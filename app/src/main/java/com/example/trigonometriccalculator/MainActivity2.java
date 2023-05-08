package com.example.trigonometriccalculator;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.trigonometriccalculator.databinding.ActivityMain2Binding;
import com.example.trigonometriccalculator.databinding.ActivityMainBinding;

public class MainActivity2 extends AppCompatActivity {

    TextView txt1, txt2;

    ActivityMain2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMain2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        txt1 = binding.textViewg;
        txt2 = binding.textViewr;
        Bundle extras = getIntent().getExtras();
        String name = extras.getString("gradusi");
        txt1.setText(name);
        String name2 = extras.getString("radiani");
        txt2.setText(name2);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mymenu, menu);
        return true;
    }


    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                startActivity(new Intent(this, MainActivity.class));
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}