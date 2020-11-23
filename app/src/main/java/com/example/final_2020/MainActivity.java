package com.example.final_2020;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    NavigationView navigationView;
    DrawerLayout drawerLayout;
    ActionBarDrawerToggle actiondrawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        navigationView = findViewById(R.id.navigationview);
        drawerLayout = findViewById(R.id.drawer);

        actiondrawer = new ActionBarDrawerToggle(
                this,drawerLayout,R.string.app_name,R.string.app_name
        );

        drawerLayout.addDrawerListener(actiondrawer);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Intent toIntent = new Intent(MainActivity.this,MainActivity2.class);
                toIntent.putExtra("name",item.getTitle());
                startActivity(toIntent);
                return true;
            }
        });
    }
}