package com.example.cruz_multicalc;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;

import com.example.cruz_multicalc.Geometry.Cone;
import com.example.cruz_multicalc.Geometry.Cube;
import com.example.cruz_multicalc.Geometry.Cylinder;
import com.example.cruz_multicalc.Geometry.Sphere;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class GeometryMenu extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    BottomNavigationView bottomNavGeometry;

    Cube cube = new Cube();
    Cylinder cylinder = new Cylinder();
    Sphere sphere = new Sphere();
    Cone cone = new Cone();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_geometry);

        bottomNavGeometry = findViewById(R.id.bottomNavGeometry) ;
        bottomNavGeometry.setOnNavigationItemSelectedListener(this);
        bottomNavGeometry.setSelectedItemId(R.id.sphere);

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.cube:
                getSupportFragmentManager().beginTransaction().replace(R.id.flFragmentGeometry, cube).commit();
                return true;

            case R.id.cylinder:
                getSupportFragmentManager().beginTransaction().replace(R.id.flFragmentGeometry, cylinder).commit();
                return true;

            case R.id.cone:
                getSupportFragmentManager().beginTransaction().replace(R.id.flFragmentGeometry, cone).commit();
                return true;

            case R.id.sphere:
                getSupportFragmentManager().beginTransaction().replace(R.id.flFragmentGeometry, sphere).commit();
                return true;

        }
        return false;
    }

}