package com.example.day4recyclerview;

import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<itemPOJO> arrayListItem = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        recyclerView = findViewById(R.id.recyclerView);
        arrayListItem.add(new itemPOJO(R.drawable.potato, "Potato", 80, 5, "Reliance", "1", 3.5f, "Kg", 25));
        arrayListItem.add(new itemPOJO(R.drawable.pumpkin, "Pumpkin", 120, 62, "Big Basket", "2", 4.4f, "Kg", 10));
        arrayListItem.add(new itemPOJO(R.drawable.cabage, "Cabbage", 100, 6, "Reliance", "3", 3.2f, "Piece", 15));
        arrayListItem.add(new itemPOJO(R.drawable.capsicum, "Capsicum", 120, 6, "Reliance", "4", 3.5f, "Piece", 16));
        arrayListItem.add(new itemPOJO(R.drawable.carrot, "Carrot", 90, 7, "Reliance", "5", 4.2f, "Kg", 12));
        arrayListItem.add(new itemPOJO(R.drawable.baigan, "Baigan", 130, 12, "Big Basket", "6", 3.2f, "Kg", 7));
        arrayListItem.add(new itemPOJO(R.drawable.tomato, "Tomato", 60, 1, "Jio Mart", "7", 4.2f, "Kg", 20));

        myListItemAdaptor myListItemAdaptor = new myListItemAdaptor(arrayListItem, MainActivity.this);
        RecyclerView.LayoutManager layoutMan = new LinearLayoutManager(MainActivity.this);

        recyclerView.setLayoutManager(layoutMan);
        recyclerView.setAdapter(myListItemAdaptor);
    }
}