package com.example.bit603_mitchell_travis_5080526_as1;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

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
