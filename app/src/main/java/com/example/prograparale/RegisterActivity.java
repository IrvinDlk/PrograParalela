package com.example.prograparale;

import android.os.Bundle;

import android.widget.FrameLayout ;
import android.widget.ImageView ;
import android.widget.Button ;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


public class RegisterActivity extends AppCompatActivity {

    private ImageView imageView ;
    private TextView textView ;
    private Button registerButton ;

    private FrameLayout botRLayout ;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singup);

        imageView = findViewById(R.id.avatarImage);
        textView = findViewById(R.id.userNameText);
        textView = findViewById(R.id.emailRegisterText);
        textView = findViewById(R.id.passwordText);
        textView = findViewById(R.id.repasswordText);
        registerButton = findViewById(R.id.buttonRegister);

    }
}
