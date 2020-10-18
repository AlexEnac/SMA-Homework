 package com.example.homework2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

 public class MainActivity extends AppCompatActivity {

    private Button mainButton;
    private TextView mainTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeViews();
        mainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CapitalActivity.class);
                startActivity(intent);
            }
        });

    }

    public void initializeViews() {
        mainButton = findViewById(R.id.btn_main_button);
        mainTextView = findViewById(R.id.tv_main_text);
    }

}
