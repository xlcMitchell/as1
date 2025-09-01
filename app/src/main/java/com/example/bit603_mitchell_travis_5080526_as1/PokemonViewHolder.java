package com.example.bit603_mitchell_travis_5080526_as1;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/*
The PokemonViewHolder class provides references to the
ids in our pokemon_card_view. Now when the recycler view adapter
is creating a new view it can do so by just reusing the holder
which already has references to the ids in the pokemon_card_view.

**INHERITANCE** -- Our PokemonRecyclerViewHolder inherits properties from the
RecyclerView.ViewHolder class reducing redundancy be reusing code
**ABSTRACTION** -- By using the RecyclerView.ViewHolder class the more complex
parts of the code are hidden and we focus on implementing the view holder
**ENCAPSULATION** -- The name and images are separate from other parts of the app
**POLYMORPHISM** -- Many different view holders can be created for each individual pokemon
*/

public class PokemonViewHolder extends RecyclerView.ViewHolder{
    ImageView image;
    TextView name;


    public PokemonViewHolder(@NonNull View itemView) {
        super(itemView);
        //place ids where the images,names,descriptions will be shown
        image = itemView.findViewById(R.id.pokemonImage);
        name = itemView.findViewById(R.id.pokemonName);
    }
}
