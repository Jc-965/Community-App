package com.example.community;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b = this.findViewById(R.id.troop_finder_btn);
        b.setOnClickListener(this::onBtnClicked);
    }

    private void onBtnClicked(View view){
        Intent intent = new Intent(this, BoyScoutFinder.class);
        startActivity(intent);
    }
}