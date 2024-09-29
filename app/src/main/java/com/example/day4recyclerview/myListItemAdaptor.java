package com.example.day4recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

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
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());

        View myView = layoutInflater.inflate(R.layout.list_item, parent, false);

        MyViewHolder myViewHolder1 = new MyViewHolder(myView);

        return myViewHolder1;
    }

    @Override
    public void onBindViewHolder(@NonNull myListItemAdaptor.MyViewHolder holder, int position) {
        holder.imageView.setImageResource(arrayListItem.get(position).getImageLink());
        holder.name.setText(arrayListItem.get(position).getItemName().toString());
        holder.name.setText(""+arrayListItem.get(position).getItemQuantity());
        holder.name.setText(""+arrayListItem.get(position).getItemPrice());
    }

    @Override
    public int getItemCount() {
        return arrayListItem.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView name;
        TextView price;
        TextView quant;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            name = itemView.findViewById(R.id.name);
            price = itemView.findViewById(R.id.price);
            quant = itemView.findViewById(R.id.quantity);
        }
    }
}
