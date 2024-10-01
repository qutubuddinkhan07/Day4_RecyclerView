package com.example.day4recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class myListItemAdaptor extends RecyclerView.Adapter<myListItemAdaptor.MyViewHolder> {
    public myListItemAdaptor(ArrayList<itemPOJO> arrayListItem, Context context) {
        this.arrayListItem = arrayListItem;
        this.context = context;
    }

    ArrayList<itemPOJO> arrayListItem;
    Context context;

    @NonNull
    @Override
    public myListItemAdaptor.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());

        View myView = layoutInflater.inflate(R.layout.list_item, parent, false);

        MyViewHolder myViewHolder1 = new MyViewHolder(myView);

        return myViewHolder1;
    }

    @Override
    public void onBindViewHolder(@NonNull myListItemAdaptor.MyViewHolder holder, int position) {
        holder.imageView.setImageResource(arrayListItem.get(position).getImageLink());
        holder.name1.setText(""+arrayListItem.get(position).getItemName());
        holder.quant1.setText(""+arrayListItem.get(position).getItemQuantity());
        holder.price1.setText("Rs "+arrayListItem.get(position).getItemPrice()+""+arrayListItem.get(position).getItemUnit());
        holder.textViewDiscount.setText(""+((arrayListItem.get(position).getDiscount()>0)? arrayListItem.get(position).getDiscount()+"% Discount":"No Discount"));
        holder.ratingBar1.setRating(arrayListItem.get(position).getRating());

        holder.buy1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Buy clicked for " + arrayListItem.get(position).getId(), Toast.LENGTH_SHORT).show();
            }
        });

        holder.cart1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Add to cart clicked for " + arrayListItem.get(position).getId(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return arrayListItem.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView name1;
        TextView price1;
        TextView quant1;
        Button cart1,buy1;
        TextView textViewDiscount;
        RatingBar ratingBar1;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            name1 = itemView.findViewById(R.id.name);
            price1 = itemView.findViewById(R.id.price);
            quant1 = itemView.findViewById(R.id.quantity);
            cart1 = itemView.findViewById(R.id.addtocart);
            buy1 = itemView.findViewById(R.id.buy);
            textViewDiscount=itemView.findViewById(R.id.textViewDiscount);
            ratingBar1 = itemView.findViewById(R.id.ratingBar);
        }
    }
}
//change made and checked 😁