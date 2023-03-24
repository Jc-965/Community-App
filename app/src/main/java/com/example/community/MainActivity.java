package com.example.community;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    GoogleSignInClient gsc;
    GoogleSignInOptions gso;

    ImageButton signOutBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        signOutBtn = findViewById(R.id.sign_out_btn);
        gsc = GoogleSignIn.getClient(this, gso);

        ImageButton b = this.findViewById(R.id.troop_finder_btn);
        b.setOnClickListener(this::onBtnClicked);

        FirebaseApp.initializeApp(this);

        //FirebaseDatabase database = FirebaseDatabase.getInstance();
        //DatabaseReference myRef = database.getReference("message");

        //myRef.setValue("Hello, World!");
        signOutBtn.setOnClickListener(view -> signOut());
    }

    private void onBtnClicked(View view){
        Intent intent = new Intent(this, BoyScoutFinder.class);
        startActivity(intent);
    }

    private void signOut() {
        gsc.signOut()
                .addOnCompleteListener(this, task -> {
                    Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                    startActivity(intent);
                });
    }

}