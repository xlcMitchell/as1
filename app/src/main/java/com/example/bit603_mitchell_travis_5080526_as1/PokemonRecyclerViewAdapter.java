package com.example.bit603_mitchell_travis_5080526_as1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

/*
The recycler view adapter class connects our data list to the recycler view
 */

public class PokemonRecyclerViewAdapter extends RecyclerView.Adapter<PokemonViewHolder>{

    List <Pokemon> data;
    public PokemonRecyclerViewAdapter(List <Pokemon> data){
          this.data = data;
    }

    @NonNull
    @Override
    public PokemonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.pokemon_card_view,parent,false);
        return new PokemonViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PokemonViewHolder holder, int position) {
               Pokemon pokemon = data.get(position);
               holder.name.setText(pokemon.getName());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
