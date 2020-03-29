package com.example.pizzarecips;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<PizzaRecipeItem> pizzaRecipeItems = new ArrayList<>();
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.pizza1,
                Utils.TITLE_1,
                Utils.DESCRIPTION_1,
                Utils.RECIPE_1
                ));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.pizza2,
                Utils.TITLE_2,
                Utils.DESCRIPTION_2,
                Utils.RECIPE_2
                ));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.pizza3,
                Utils.TITLE_3,
                Utils.DESCRIPTION_3,
                Utils.RECIPE_3
                ));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.pizza4,
                Utils.TITLE_4,
                Utils.DESCRIPTION_4,
                Utils.RECIPE_4
                ));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.pizza_5,
                Utils.TITLE_5,
                Utils.DESCRIPTION_5,
                Utils.RECIPE_5
                ));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.pizza6,
                Utils.TITLE_6,
                Utils.DESCRIPTION_6,
                Utils.RECIPE_6
                ));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.piza7,
                Utils.TITLE_7,
                Utils.DESCRIPTION_7,
                Utils.RECIPE_7
                ));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.pizza8,
                Utils.TITLE_8,
                Utils.DESCRIPTION_8,
                Utils.RECIPE_8
                ));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.pizza9,
                Utils.TITLE_9,
                Utils.DESCRIPTION_9,
                Utils.RECIPE_9
                ));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.pizza10,
                Utils.TITLE_10,
                Utils.DESCRIPTION_10,
                Utils.RECIPE_10
                ));

    }
}
