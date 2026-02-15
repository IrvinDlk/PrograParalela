package com.example.prograparale;



import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity  extends  AppCompatActivity {
    private ImageView imageView;
    private TextView textView;
    private FrameLayout frameLayout_bot;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
        textView = findViewById(R.id.textView);
        frameLayout_bot = findViewById(R.id.botRegister);

        Thread hilo = new Thread(() -> {
            try {
                Thread.sleep(3000);

                // Verificar que la Activity no fue destruida
                if (!isFinishing() && !isDestroyed()) {
                    runOnUiThread(() -> {
                        Intent intent = new Intent(MainActivity.this, StartActivity.class);
                        startActivity(intent);

                    });
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        hilo.start(); // Iniciar el hilo
    }
}
