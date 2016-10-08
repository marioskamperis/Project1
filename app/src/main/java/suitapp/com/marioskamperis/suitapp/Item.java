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
    private int thumbnail;
    private int photo;

    public Item() {
    }

    public Item(int category, String name, String patterns, String color, Float price, int thumbnail, int photo) {
        this.category = category;
        this.name = name;
        this.patterns = patterns;
        this.color = color;
        this.price = price;
        this.thumbnail = thumbnail;
        this.photo = photo;
    }

    public Item(int category, String name, int thumbnail) {
        this.category = category;
        this.name = name;
        this.thumbnail = thumbnail;
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

    public int getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
}
