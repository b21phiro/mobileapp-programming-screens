package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class SearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        Intent intent = getIntent();
        String input = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView searchKey = findViewById(R.id.searchKey);
        searchKey.setText("Results for \""+input+"\"");
    }
}