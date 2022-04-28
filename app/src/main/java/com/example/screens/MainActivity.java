package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private static final String EXTRA_MESSAGE = "com.example.screens";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button submitButton = (Button) findViewById(R.id.submitButton);
        EditText searchInput = (EditText) findViewById(R.id.searchInput);

        submitButton.setOnClickListener(view -> {
            String input = (String) searchInput.getText().toString();
            submitSearchInput(input);
        });

    }

    public void submitSearchInput(String input) {
        Intent intent = new Intent(this, SearchActivity.class);
        intent.putExtra(EXTRA_MESSAGE, input);
        startActivity(intent);
    }

}
