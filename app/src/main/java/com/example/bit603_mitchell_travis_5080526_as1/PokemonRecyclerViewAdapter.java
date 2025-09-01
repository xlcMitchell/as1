package com.example.bit603_mitchell_travis_5080526_as1;

import static androidx.core.content.ContextCompat.startActivity;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.io.Serializable;
import java.util.List;

/*
The recycler view adapter class connects our data list to the recycler view
It implements several different methods to achieve this.
The onCreateViewHolder creates a new PokemonViewHolder by inflating a
pokemon card view
The onBindViewHolder sets an onclick listener to each view holder

**INHERITANCE** -- Our PokemonRecyclerViewAdapter inherits properties from the
RecyclerViewAdapter class reducing redundancy be reusing code
**POLYMORPHISM** -- The recycler view will be able to be created in many different forms reusing
the same code
**ABSTRACTION** -- More complex parts of the RecyclerViewAdapter are hidden and we focus on
implementing the code necessary for our recyclerview to function
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
               Pokemon pokemon = data.get(position); //get the pokemon object
               holder.name.setText(pokemon.getName());

               //Attach a click listener to each pokemon cardview
               holder.itemView.setOnClickListener(v -> {
                   Intent intent = new Intent(v.getContext(),PokemonDetailActivity.class);
                   intent.putExtra("pokemon_object",(Serializable) pokemon); //pass the pokemon object that was selected
                   v.getContext().startActivity(intent);
               });
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
