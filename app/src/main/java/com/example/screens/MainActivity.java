package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final String EXTRA_MESSAGE = "com.example.screens";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitSearchInput(View view, String input) {
        Intent intent = new Intent(this, SearchActivity.class);
        intent.putExtra(EXTRA_MESSAGE, input);
        startActivity(intent);
    }

}
