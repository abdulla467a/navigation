package com.example.nav;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    DrawerLayout myDrawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        androidx.appcompat.widget.Toolbar mytoolbar = findViewById(R.id.toobarId);
        myDrawer = findViewById(R.id.myDrawelayoutID);
        setSupportActionBar(mytoolbar);
        ActionBarDrawerToggle mytoggle = new ActionBarDrawerToggle(this,myDrawer,R.string.open, R.string.close);
        myDrawer.addDrawerListener(mytoggle);
        mytoggle.syncState();
    }

    @Override
    public void onBackPressed() {
        if (myDrawer.isDrawerOpen(GravityCompat.START)) {
            myDrawer.closeDrawer(GravityCompat.START);
        }
        else {

            super.onBackPressed();
        }
    }
}