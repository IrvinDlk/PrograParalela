package com.example.prograparale;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.FrameLayout;
import android.content.Intent;
import android.widget.Toast;
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

        imageView = findViewById(R.id.loggoStart);
        loginButton = findViewById(R.id.loginButton);
        singUpButton = findViewById(R.id.singUpButton);
        frameLayout = findViewById(R.id.botLogin);

        singUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StartActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(StartActivity.this,
                        "Esta opción todavía no está implementada",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
