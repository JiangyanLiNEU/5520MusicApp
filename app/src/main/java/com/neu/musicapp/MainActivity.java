package com.neu.musicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button login, signUp;
    TextView userName, passWord;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // get elements
        login = findViewById(R.id.loginBTN);
        signUp = findViewById(R.id.signUpBTN);
        userName = findViewById(R.id.userNameTV);
        passWord = findViewById(R.id.passwordTV);
    }

    public void logInOnClick(View view){
        Intent intent = new Intent(this, MusicDisplay.class);
    }



}