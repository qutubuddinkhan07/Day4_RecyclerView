package com.example.day4recyclerview;

import android.os.Bundle;

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
        arrayListItem.add(new itemPOJO(R.drawable.tomato, "Tomato", 60, 1));
        arrayListItem.add(new itemPOJO(R.drawable.potato, "Potato", 80, 5));
        arrayListItem.add(new itemPOJO(R.drawable.pumpkin, "Pumpkin", 120, 6));
        arrayListItem.add(new itemPOJO(R.drawable.cabage, "Cabbage", 100, 6));
        arrayListItem.add(new itemPOJO(R.drawable.capsicum, "Capsicum", 120, 6));
        arrayListItem.add(new itemPOJO(R.drawable.carrot, "Carrot", 90, 7));
        arrayListItem.add(new itemPOJO(R.drawable.baigan, "Baigan", 130, 12));



        myListItemAdaptor myListItemAdaptor =new myListItemAdaptor(arrayListItem,MainActivity.this);
        RecyclerView.LayoutManager layoutMan=new LinearLayoutManager(MainActivity.this);

        recyclerView.setLayoutManager(layoutMan);
        recyclerView.setAdapter(myListItemAdaptor);
    }
}