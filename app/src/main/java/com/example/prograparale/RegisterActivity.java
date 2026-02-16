package com.example.prograparale;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.FrameLayout ;
import android.widget.ImageView ;
import android.widget.Button ;
import android.widget.TextView;
import android.widget.Toast;
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

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(RegisterActivity.this,
                        "Usuario Registrado con exito",
                        Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(RegisterActivity.this, StartActivity.class);
                startActivity(intent);
            }
        });

    }
}
