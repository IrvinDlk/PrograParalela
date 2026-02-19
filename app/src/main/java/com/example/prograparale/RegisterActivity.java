package com.example.prograparale;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.FrameLayout ;
import android.widget.ImageView ;
import android.widget.Button ;
import android.widget.EditText;
import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


public class RegisterActivity extends AppCompatActivity {

    private ImageView imageView ;
    private EditText passwordEditText ;
    private EditText rePasswordEditText;

    private EditText userTextView;
    private EditText emailTextView;
    private Button registerButton ;

    private FrameLayout botRLayout ;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singup);

        imageView = findViewById(R.id.avatarImage);
        userTextView = findViewById(R.id.userNameText);
        emailTextView = findViewById(R.id.emailRegisterText);
        passwordEditText = findViewById(R.id.passwordText);
        rePasswordEditText = findViewById(R.id.repasswordText);
        registerButton = findViewById(R.id.buttonRegister);

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String userName =  userTextView.getText().toString();
                String email = emailTextView.getText().toString();
                String password = passwordEditText.getText().toString();
                String rePassword = rePasswordEditText.getText().toString();

                if (userName.isEmpty() || email.isEmpty() || password.isEmpty() || rePassword.isEmpty()) {
                    Toast.makeText(RegisterActivity.this,
                            "Por favor completa todos los campos",
                            Toast.LENGTH_SHORT).show();
                    return;
                }

                if (!password.equals(rePassword)) {
                    Toast.makeText(RegisterActivity.this,
                            "Las contraseñas no coinciden",
                            Toast.LENGTH_SHORT).show();
                    return;
                }

                Toast.makeText(RegisterActivity.this,
                        "Bienvenido " + userName  + " Usuario Registrado con exito",
                        Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(RegisterActivity.this, StartActivity.class);
                startActivity(intent);
            }
        });

    }
}
