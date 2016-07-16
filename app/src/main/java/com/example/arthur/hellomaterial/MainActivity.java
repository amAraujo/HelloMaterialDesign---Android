package com.example.arthur.hellomaterial;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //region Métodos onClick

    public void exemploElevacaoView(View view){
        startActivity(new Intent(this, ElevacaoView.class));
    }
    public void exemploRipple(View view){
        startActivity(new Intent(this, ExemploRipple.class));
    }
    public void exemploFloatingActionButton(View view){
        startActivity(new Intent(this, FloatingActionButton.class));
    }
    public void exemploCardView(View view){
        startActivity(new Intent(this, CardView.class));
    }

    //endregion
}
