package ng.edu.binghamuni.inventory.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "ingredient")
public class Ingredient
{
    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getNutritional()
    {
        return nutritional;
    }

    public void setNutritional(String nutritional)
    {
        this.nutritional = nutritional;
    }

    @Id
    public Long id;
    private String name;
    private String nutritional;

    public Ingredient(){}

    public Ingredient(Long id, String name, String nutritional)
    {
        this.id = id;
        this.name = name;
        this.nutritional = nutritional;
    }


}
