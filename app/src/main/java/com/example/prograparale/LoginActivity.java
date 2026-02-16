package com.example.prograparale;


import android.os.Bundle;

import android.widget.Button;
import android.widget.ImageView;
import android.widget.FrameLayout;
import android.widget.EditText ;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    private  ImageView imageView ;
    private  FrameLayout frameLayout ;
    private Button loginButton;
    private EditText editText ;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        imageView = findViewById(R.id.loginAvatar);
        editText = findViewById(R.id.userNameTextLogin);
        editText = findViewById(R.id.passwordTextLogin);
        frameLayout = findViewById(R.id.botLogin);
        loginButton = findViewById(R.id.loginButton);



    }
}
