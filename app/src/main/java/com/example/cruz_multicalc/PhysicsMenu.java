package com.example.cruz_multicalc;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class PhysicsMenu extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    BottomNavigationView bottomNavPhysics;

    pDensity density = new pDensity();
    pAcceleration acceleration = new pAcceleration();
    pSpeed speed = new pSpeed();
    pWeight weight = new pWeight();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_physics);

        bottomNavPhysics = findViewById(R.id.bottomNavPhysics) ;
        bottomNavPhysics.setOnNavigationItemSelectedListener(this);
        bottomNavPhysics.setSelectedItemId(R.id.density);

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.speed:
                getSupportFragmentManager().beginTransaction().replace(R.id.flFragmentPhysics, speed).commit();
                return true;

            case R.id.density:
                getSupportFragmentManager().beginTransaction().replace(R.id.flFragmentPhysics, density).commit();
                return true;

            case R.id.acceleration:
                getSupportFragmentManager().beginTransaction().replace(R.id.flFragmentPhysics, acceleration).commit();
                return true;

            case R.id.weight:
                getSupportFragmentManager().beginTransaction().replace(R.id.flFragmentPhysics, weight).commit();
                return true;

        }
        return false;
    }

}