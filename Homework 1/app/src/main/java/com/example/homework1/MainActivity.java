package com.example.homework1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button mainBtn;
    private RelativeLayout rv;
    private EditText rv_et;
    private Button rv_ok_btn;
    private Button rv_cancel_btn;
    private Button emptyActivityBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeViews();
        setOnClickListeners();
    }

    private void setOnClickListeners() {
        emptyActivityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, EmptyActivity.class);
                startActivity(intent);
            }
        });
        mainBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rv.setVisibility(View.VISIBLE);
            }
        });

        rv_ok_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String text = rv_et.getText().toString();
                if (!text.isEmpty()) {
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    intent.putExtra("key1", text);
                    startActivity(intent);
                    rv.setVisibility(View.INVISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "Input text must not pe empty!", Toast.LENGTH_SHORT).show();
                   return;
                }

            }
        });
        rv_cancel_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "I am out!", Toast.LENGTH_SHORT).show();
                rv.setVisibility(View.INVISIBLE);
        }
        });
    }

    private void initializeViews() {
        mainBtn = findViewById(R.id.dialog_button);
        rv = findViewById(R.id.hidden_rv);
        rv_et = findViewById(R.id.main_et);
        rv_ok_btn = findViewById(R.id.ok_btn);
        rv_cancel_btn = findViewById(R.id.cancel_btn);
        emptyActivityBtn = findViewById(R.id.btn_empty_activity);
    }

}
