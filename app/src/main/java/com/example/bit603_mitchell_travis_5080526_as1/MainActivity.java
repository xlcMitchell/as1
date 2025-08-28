package com.example.bit603_mitchell_travis_5080526_as1;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public static List<Pokemon> pokemonData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.btn);
        EditText name = findViewById(R.id.nameEntry);
        pokemonData = new ArrayList<>();

        //---- btn onclick listener ----
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkName(name);

            }
        });
    }

    //Method checks if the user has entered a name
    void checkName(EditText name){
        if(name.getText().length() == 0){
            Toast.makeText(getApplicationContext(),
                    "Please enter your name",
                    Toast.LENGTH_SHORT).show();
        }else{ //if a name has been entered an intent is created to send name + pokemon data to next activity
            Intent intent = new Intent(getApplicationContext(),PokemonListActivity.class);
            intent.putExtra("name",name.getText().toString());
            intent.putExtra("pokemon_list", (Serializable) pokemonData);
            startActivity(intent);
        }
    }

    //Method which create the pokemon objects and add them to the list array
    private void createPokemonList(){
        String [] images = getResources().getStringArray(R.array.image_names);
        String [] pokemonNames =  getResources().getStringArray(R.array.pokemon_names);
        String [] description = getResources().getStringArray(R.array.pokemon_descriptions);
        String [] height = getResources().getStringArray(R.array.pokemon_heights);
        String [] category = getResources().getStringArray(R.array.pokemon_categories);
        String [] weight = getResources().getStringArray(R.array.pokemon_weights);
        String [] ability = getResources().getStringArray(R.array.pokemon_abilities);

        for(int i=0; i < pokemonNames.length; i++){
            int imageId = getResources().getIdentifier(images[i], "drawable", getPackageName());
           pokemonData.add(new Pokemon(imageId,pokemonNames[i],description[i],
                   height[i],category[i],weight[i],ability[i]));
        }
    }

}