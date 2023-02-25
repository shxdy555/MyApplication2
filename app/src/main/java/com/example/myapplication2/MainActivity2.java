package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tv1 = (TextView) findViewById(R.id.tv1);
        String dato = getIntent().getStringExtra("dato");
        tv1.setText("=" + dato);

    }

    public void Regresar(View view) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);

    }
}
