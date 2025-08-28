package com.example.bit603_mitchell_travis_5080526_as1;

import android.content.Intent;
import android.os.Bundle;
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

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkName(name);

            }
        });
    }

    void checkName(EditText name){
        if(name.getText().length() == 0){
            Toast.makeText(getApplicationContext(),
                    "Please enter your name",
                    Toast.LENGTH_SHORT).show();
        }else{
            Intent intent = new Intent(getApplicationContext(),PokemonListActivity.class);
            intent.putExtra("name",name.getText());
            startActivity(intent);
        }
    }

    //TODO finish method to create Pokemon objects
    private void createPokemonList(){
        String [] images = getResources().getStringArray(R.array.image_names);
        String [] pokemonNames =  getResources().getStringArray(R.array.pokemon_names);

        for(int i=0; i < pokemonNames.length; i++){
            int imageId = getResources().getIdentifier(images[i], "drawable", getPackageName());
          //  pokemonData.add(new Pokemon(imageId,pokemonNames[i]))
            Log.d("Pokemon","Creating pokemon objects");
        }
    }

}