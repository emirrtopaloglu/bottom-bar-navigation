package com.emirtopaloglu.bottombarnavigation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    BottomNavigationView bottomNavigationView;

    HomeFragment homeFragment = new HomeFragment();
    ProfileFragment profileFragment = new ProfileFragment();
    SettingsFragment settingsFragment = new SettingsFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.BottomNavigationBar);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
        bottomNavigationView.setSelectedItemId(R.id.home);

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        if ( item.getItemId() == R.id.home ) {
            getSupportFragmentManager().beginTransaction().replace(R.id.FrameLayout, homeFragment).commit();
            return true;
        }

        if ( item.getItemId() == R.id.profile ) {
            getSupportFragmentManager().beginTransaction().replace(R.id.FrameLayout, profileFragment).commit();
            return true;
        }
        if ( item.getItemId() == R.id.settings ) {
            getSupportFragmentManager().beginTransaction().replace(R.id.FrameLayout, settingsFragment).commit();
            return true;
        }


        return false;
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }
}