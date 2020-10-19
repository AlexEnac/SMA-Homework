package com.example.homework2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class CapitalActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private List<Capital> capitals;
    private CapitalAdapter capitalAdapter;
    private Button addBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capital);
        initializeList();
        recyclerView = findViewById(R.id.rv_list);
        capitalAdapter = new CapitalAdapter(capitals);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(capitalAdapter);
        addBtn = findViewById(R.id.btn_add);
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                capitals.add(new Capital("Atena", "Grecia"));
                capitalAdapter.notifyItemRangeInserted(capitals.size() - 1, capitals.size());
            }
        });
    }

    private void initializeList(){
        capitals = new ArrayList<>();
        capitals.add(new Capital("Bucharest", "Romania"));
        capitals.add(new Capital("Sofia", "Bulgaria"));
        capitals.add(new Capital("Budapesta", "Ungaria"));
        capitals.add(new Capital("Ankara", "Turcia"));
    }
}