package com.example.bit603_mitchell_travis_5080526_as1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.List;

public class PokemonListActivity extends AppCompatActivity {

    //List <Pokemon> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_pokemon_list);


        TextView welcomeMsg = findViewById(R.id.welcomeTxt);
        //receive intent to display welcome message
        Intent intent = getIntent();
        String usersName = "Welcome " + intent.getStringExtra("name") + "\nLet us explore";
        welcomeMsg.setText(usersName);
        //Create recycler view adapter and set it maybe??
    }
}