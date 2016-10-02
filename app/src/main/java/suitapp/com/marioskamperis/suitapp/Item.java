package suitapp.com.marioskamperis.suitapp;

/**
 * Created by Marios on 10/2/2016.
 */
public class Item {

    private int category;
    private String name;
    private String patterns;
    private String color;
    private Float price;

    public Item() {
    }

    public Item(int category, String name, String patterns, String color, Float price) {
        this.category = category;
        this.name = name;
        this.patterns = patterns;
        this.color = color;
        this.price = price;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatterns() {
        return patterns;
    }

    public void setPatterns(String patterns) {
        this.patterns = patterns;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
}
