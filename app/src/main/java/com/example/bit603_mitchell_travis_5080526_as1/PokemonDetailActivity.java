package com.example.bit603_mitchell_travis_5080526_as1;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class PokemonDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_pokemon_detail);
        //Get the pokemon object sent from the previous activity when the user clicks the recycler view holder
        Intent intent = getIntent();
        Pokemon pokemon = (Pokemon) intent.getSerializableExtra("pokemon_object");
        assert pokemon != null;


        TextView heading = findViewById(R.id.heading);
        ImageView img = findViewById(R.id.pokemonImg);

        img.setImageResource(pokemon.getImageResourceID()); //set pokemon image
        heading.setText(pokemon.getName()); //set the heading to the pokemon's name


    }
}