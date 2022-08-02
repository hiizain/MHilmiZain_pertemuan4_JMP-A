package com.example.myapplicationpertemuan4;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class GameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        getSupportActionBar().setTitle("Bermain Puzzle Angka");

        Button bA = findViewById(R.id.b_A);
        Button bB = findViewById(R.id.b_B);
        Button bC = findViewById(R.id.b_C);
        Button bD = findViewById(R.id.b_D);
        Button bE = findViewById(R.id.b_E);
        Button bF = findViewById(R.id.b_F);
        Button bG = findViewById(R.id.b_G);
        Button bH = findViewById(R.id.b_H);
        Button bI = findViewById(R.id.b_I);
        Button bJ = findViewById(R.id.b_J);
        Button bK = findViewById(R.id.b_K);
        Button bL = findViewById(R.id.b_L);
        Button bM = findViewById(R.id.b_M);
        Button bN = findViewById(R.id.b_N);
        Button bO = findViewById(R.id.b_O);
        Button bBlank = findViewById(R.id.b_blank);

        bA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(GameActivity.this, "clicked!", Toast.LENGTH_SHORT).show();
            }
        });
        bA.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(GameActivity.this, "Button A have been clicked!", Toast.LENGTH_SHORT).show();
            }
        });
        bB.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(GameActivity.this, "Button B have been clicked!", Toast.LENGTH_SHORT).show();
            }
        });
        bC.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(GameActivity.this, "Button C have been clicked!", Toast.LENGTH_SHORT).show();
            }
        });
        bD.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(GameActivity.this, "Button D have been clicked!", Toast.LENGTH_SHORT).show();
            }
        });
        bE.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(GameActivity.this, "Button E have been clicked!", Toast.LENGTH_SHORT).show();
            }
        });
        bF.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(GameActivity.this, "Button F have been clicked!", Toast.LENGTH_SHORT).show();
            }
        });
        bG.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(GameActivity.this, "Button G have been clicked!", Toast.LENGTH_SHORT).show();
            }
        });
        bH.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(GameActivity.this, "Button H have been clicked!", Toast.LENGTH_SHORT).show();
            }
        });
        bI.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(GameActivity.this, "Button I have been clicked!", Toast.LENGTH_SHORT).show();
            }
        });
        bJ.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(GameActivity.this, "Button J have been clicked!", Toast.LENGTH_SHORT).show();
            }
        });
        bK.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(GameActivity.this, "Button K have been clicked!", Toast.LENGTH_SHORT).show();
            }
        });
        bL.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(GameActivity.this, "Button L have been clicked!", Toast.LENGTH_SHORT).show();
            }
        });
        bM.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(GameActivity.this, "Button M have been clicked!", Toast.LENGTH_SHORT).show();
            }
        });
        bN.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(GameActivity.this, "Button N have been clicked!", Toast.LENGTH_SHORT).show();
            }
        });
        bO.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(GameActivity.this, "Button O have been clicked!", Toast.LENGTH_SHORT).show();
            }
        });
        bBlank.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(GameActivity.this, "Blank Button have been clicked!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Intent intent;
        if (item.getItemId() == R.id.m_main){
            intent = new Intent(this, GameActivity.class);
        } else if (item.getItemId() == R.id.m_ulangi){
            intent = new Intent(this, GameActivity.class);
        } else{
            intent = new Intent(this, MainActivity.class);
        }
        startActivity(intent);
        return true;
    }
}