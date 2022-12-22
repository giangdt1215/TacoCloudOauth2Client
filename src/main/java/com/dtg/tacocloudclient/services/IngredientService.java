package com.dtg.tacocloudclient.services;

import com.dtg.tacocloudclient.models.Ingredient;

public interface IngredientService {

    Iterable<Ingredient> findAll();

    Ingredient addIngredient(Ingredient ingredient);
}
