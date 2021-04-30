package com.example.pantalla_inicio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

// activity de Scroll de fotos de islas
public class MainActivity extends AppCompatActivity {
    private Button boton_comenzar;
    private TextView titulo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_islas);



    }
}