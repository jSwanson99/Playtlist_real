package com.platelist.platelist_real;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class home_Screen extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home__screen);
    }
    public void maps_click(View view) {
        Intent intent = new Intent(this,platelist_Maps.class);
        startActivity(intent);
    }
    public void search_click(View view) {
        Intent intent = new Intent(this,platelist_Maps.class);
        startActivity(intent);
    }
}
