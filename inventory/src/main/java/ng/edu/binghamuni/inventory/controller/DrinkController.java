package ng.edu.binghamuni.inventory.controller;

import ng.edu.binghamuni.inventory.domain.Drink;
import ng.edu.binghamuni.inventory.services.DrinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DrinkController
{
    @Autowired
    DrinkService drinkService;

    @GetMapping("/")
    public String homePage(Model model)
    {
        model.addAttribute("drinks",drinkService.getAllDrinks());
        return "home";
    }

    @GetMapping("/showNewDrinkForm")
    public String showNewDrinkForm(Model model)
    {
        Drink drink = new Drink();
        model.addAttribute("drink",drink);
        return "new drink";
    }

    @PostMapping("/saveDrink")
    public Drink saveDrink(@ModelAttribute("drink") Drink drink)
    {
        drinkService.saveDrink(drink);
        return drink;
    }
}
