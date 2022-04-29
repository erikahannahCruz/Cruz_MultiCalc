package com.example.cruz_multicalc;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class GeometryMenu extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    BottomNavigationView bottomNavGeometry;

    gCube cube = new gCube();
    gCylinder cylinder = new gCylinder();
    gSphere sphere = new gSphere();
    gCone cone = new gCone();

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