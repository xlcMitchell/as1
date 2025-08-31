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
If not then it would need to constantly call the findViewById() method
which would slow performance

Inheritance - Our PokemonRecyclerViewHolder inherits properties from the
RecyclerView.ViewHolder class reducing redundancy be reusing code
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
