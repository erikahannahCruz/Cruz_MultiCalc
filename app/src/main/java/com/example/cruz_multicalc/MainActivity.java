package com.example.cruz_multicalc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnPhysics , btnGeometry ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPhysics = findViewById(R.id.btnPhysics);
        btnGeometry = findViewById(R.id.btnGeometry);

        btnPhysics.setOnClickListener(this);
        btnGeometry.setOnClickListener(this);
    }

    @Override
    public void onClick (View v) {
        switch (v.getId()) {
            case R.id.btnPhysics:
                Intent i = new Intent (this, PhysicsMenu.class) ;
                startActivity(i);
                break;

            case R.id.btnGeometry:
                Intent i2 = new Intent (this, GeometryMenu.class) ;
                startActivity(i2);
                break;
        }

    }

}