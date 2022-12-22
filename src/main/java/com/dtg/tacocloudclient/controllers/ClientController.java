package com.dtg.tacocloudclient.controllers;

import com.dtg.tacocloudclient.models.Ingredient;
import com.dtg.tacocloudclient.services.IngredientService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/client/ingredients")
@RequiredArgsConstructor
public class ClientController {

    private final IngredientService ingredientService;

    @GetMapping
    public String ingredientsAdmin(Model model) {
        model.addAttribute("ingredients", ingredientService.findAll());
        return "ingredientsClient";
    }

    @PostMapping
    public String addIngredient(Ingredient ingredient) {
        ingredientService.addIngredient(ingredient);
        return "redirect:/client/ingredients";
    }
}
