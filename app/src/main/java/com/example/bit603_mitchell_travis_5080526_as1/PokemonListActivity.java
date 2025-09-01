package com.example.bit603_mitchell_travis_5080526_as1;

/*
The PokemonListActivity class will be used to display the recycler
view which will show all of the different pokemon's to the user.

**INHERITANCE** -- PokemonListActivity extends AppCompatActivity allowing
us to use code from this class rather than creating our own methods
**ABSTRACTION** -- More complex functionality is hidden as we are utilising the AppCompatActivity class

 */

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
        //STEP 1: Retrieve the recycler view ID and assign it to a variable
        RecyclerView recyclerView = findViewById(R.id.pokemonRecyclerView);
        //STEP 2: Set the layout manager
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        //STEP 3: Receive our intent from the previous activity which contains our
        //pokemon objects as well as the user's name for the welcome message
        Intent intent = getIntent();
        String usersName = "Welcome " + intent.getStringExtra("name") + "\nLet us explore";
        welcomeMsg.setText(usersName);
         //STEP 4: Store the pokemon objects into an array list
        ArrayList <Pokemon> pokemonData = (ArrayList<Pokemon>) intent.getSerializableExtra("pokemon_list");

        //STEP 5: Create a new PokemonRecyclerViewAdapter with our pokemon array list
        PokemonRecyclerViewAdapter recyclerViewAdapter = new PokemonRecyclerViewAdapter(pokemonData);
        //STEP 6: Set the adapter to the recycler view
        recyclerView.setAdapter(recyclerViewAdapter);



    }
}