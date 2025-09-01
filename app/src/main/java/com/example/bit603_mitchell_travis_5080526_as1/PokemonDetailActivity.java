package com.example.bit603_mitchell_travis_5080526_as1;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

/*
This activity will display the information about each individual pokemon
when the user selected a pokemon from the list activity.. The pokemon that the
user selects will be passed through to this activity with an intent

**INHERITANCE** -- Like the other activity classes we inherit methods from the AppCompatActivity
**ABSTRACTION** -- We also hide complexity using the AppCompatActivity class
**POLYMORPHISM** -- The inherited classes can be implemented to in many different ways

 */
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

        //Retrieving ids
        TextView heading = findViewById(R.id.heading);
        ImageView img = findViewById(R.id.pokemonImg);
        RadioGroup radioOptions = findViewById(R.id.myRadioGroup);
        TextView txt = findViewById(R.id.txtUpdate);
        RadioButton heightBtn = findViewById(R.id.heightRadioButton);
        Button exploreBtn = findViewById(R.id.exploreBtn);


        heightBtn.setChecked(true); //set height option checked by default
        img.setImageResource(pokemon.getImageResourceID()); //set pokemon image
        heading.setText(pokemon.getName()); //set the heading to the pokemon's name
        updateRadioGroup(heightBtn.getId(),pokemon,txt);

        radioOptions.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(@NonNull RadioGroup group, int checkedId) {
                     updateRadioGroup(checkedId,pokemon,txt);
            }
        });

        exploreBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); //close the current activity and return to previous (recycler view list)
            }
        });










    }

    private void updateRadioGroup(int checkedId, Pokemon pokemon, TextView txt){
        if(checkedId == R.id.heightRadioButton){
            txt.setText(pokemon.getHeight());
        }else if(checkedId == R.id.weightRadioButton){
            txt.setText(pokemon.getWeight());
        }else if(checkedId == R.id.abilityRadioButton){
            txt.setText(pokemon.getAbility());
        }else if(checkedId == R.id.categoryRadioButton){
            txt.setText(pokemon.getCategory());
        }
    }


}