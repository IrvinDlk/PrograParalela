package com.example.prograparale;

import android.os.Bundle;

import android.widget.Button;
import android.widget.ImageView;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


public class StartActivity extends AppCompatActivity {
    private ImageView imageView;
    private Button loginButton;
    private Button singUpButton;
    private FrameLayout frameLayout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        imageView = findViewById(R.id.imageView2);
        loginButton = findViewById(R.id.loginButton);
        singUpButton = findViewById(R.id.loginButton);
        frameLayout = findViewById(R.id.botStart);
    }
}
