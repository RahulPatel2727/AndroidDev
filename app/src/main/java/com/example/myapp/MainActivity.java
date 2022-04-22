package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gotoHome(View view){
        Toast.makeText(this,"going home",Toast.LENGTH_LONG).show();
    }
    public void back(View view){
        Toast.makeText(this,"go back",Toast.LENGTH_LONG).show();
    }

}