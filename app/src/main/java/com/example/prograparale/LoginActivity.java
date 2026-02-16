package com.example.prograparale;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.FrameLayout ;
import android.widget.ImageView ;
import android.widget.Button ;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity{

    private ImageView imageView;
    private TextView textView;
    private FrameLayout frameLayout;
    private Button loginButton;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        imageView = findViewById(R.id.loginAvatar);
        textView = findViewById(R.id.passwordTextLogin);
        textView = findViewById(R.id.userNameTextLogin);
        frameLayout = findViewById(R.id.botLogin);
        loginButton = findViewById(R.id.buttonlogin);

    }

}
