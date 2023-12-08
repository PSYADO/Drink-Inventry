package ng.edu.binghamuni.inventory.domain;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import org.hibernate.annotations.IdGeneratorType;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.util.List;

@Entity(name = "drink")
public class Drink
{
    private String name;
    private int capacity;
    private String color;
    private String type;
    private String company;
    private int price;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getCapacity()
    {
        return capacity;
    }

    public void setCapacity(int capacity)
    {
        this.capacity = capacity;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public String getCompany()
    {
        return company;
    }

    public void setCompany(String company)
    {
        this.company = company;
    }

    public int getPrice() {return price;}

    public void setPrice(int price) {this.price = price;}


    public Drink()
    {

    }

    public Drink(Long id,String name,int capacity,String color,String type,String company,int price)
    {
        this.id = id;
        this.name = name;
        this.capacity = capacity;
        this.color = color;
        this.type = type;
        this.company = company;
        this.price = price;
    }

    @Id
    @GeneratedValue
    public Long id;

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId()
    {
        return this.id;
    }

    @OneToMany
    public List<Ingredient> ingredients;

    public List<Ingredient> getIngredients() {return ingredients;}

    public void setIngredients(List<Ingredient> ingredients) {this.ingredients = ingredients;}
}
