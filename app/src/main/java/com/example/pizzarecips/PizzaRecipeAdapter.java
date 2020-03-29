package com.example.pizzarecips;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PizzaRecipeAdapter extends RecyclerView.Adapter {

    ArrayList<PizzaRecipeItem> pizzaRecipeItems;

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.pizza_recips_item, parent, false);
        PizzaRecipeViewHolder pizzaRecipeViewHolder = new PizzaRecipeViewHolder(view);
        return pizzaRecipeViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class PizzaRecipeViewHolder extends RecyclerView.ViewHolder {

        public ImageView imageView;
        public TextView title;
        public TextView description;

        public PizzaRecipeViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.pizzaImageView);
            title = itemView.findViewById(R.id.titleImageView);
            description = itemView.findViewById(R.id.descriptionImageView);

        }
    }
}
