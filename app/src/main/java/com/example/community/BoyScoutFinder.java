package com.example.community;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BoyScoutFinder extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boy_scout_finder);

        Button homePage = this.findViewById(R.id.home_btn);
        homePage.setOnClickListener(this::onBtnClicked);
    }

    private void onBtnClicked(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}