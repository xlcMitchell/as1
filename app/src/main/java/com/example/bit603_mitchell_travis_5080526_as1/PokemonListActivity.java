package com.example.bit603_mitchell_travis_5080526_as1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class PokemonListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_pokemon_list);

        TextView welcomeMsg = findViewById(R.id.welcomeTxt);
        RecyclerView recyclerView = findViewById(R.id.pokemonRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        //receive intent to display welcome message
        Intent intent = getIntent();
        String usersName = "Welcome " + intent.getStringExtra("name") + "\nLet us explore";
        welcomeMsg.setText(usersName);
         //receive pokemon list
        ArrayList <Pokemon> pokemonData = (ArrayList<Pokemon>) intent.getSerializableExtra("pokemon_list");

        //Create recycler view adapter and set it maybe??
        PokemonRecyclerViewAdapter recyclerViewAdapter = new PokemonRecyclerViewAdapter(pokemonData);
        recyclerView.setAdapter(recyclerViewAdapter);



    }
}