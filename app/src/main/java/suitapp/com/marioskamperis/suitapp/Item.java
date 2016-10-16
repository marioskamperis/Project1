package suitapp.com.marioskamperis.suitapp;

import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.util.Arrays;
import java.util.Date;

/**
 * Created by Marios on 10/2/2016.
 */

@DatabaseTable(tableName = "items")
public class Item {

    @DatabaseField(generatedId = true)
    private int id;

    @DatabaseField
    private int category;

    @DatabaseField
    private String name;

    @DatabaseField
    private String patterns;

    @DatabaseField
    private String color;

    @DatabaseField
    private Float price;

    @DatabaseField(dataType = DataType.BYTE_ARRAY)
    byte[] image;

    @DatabaseField
    private Date created;

    protected static int counterId = 0;

    private int thumbnail;


    public Item() {
        this.id = counterId++;
    }

    public Item(int category, String name, String patterns, String color, Float price, byte[] image, Date created) {
        this.id = counterId++;
        this.category = category;
        this.name = name;
        this.patterns = patterns;
        this.color = color;
        this.price = price;
        this.image = image;
        this.created = new Date(System.currentTimeMillis());
    }

    public Item(String name) {
        this.id = counterId++;
        this.name = name;
    }

    public Item(String name, byte[] image) {
        this.id = counterId++;
        this.name = name;
        this.image = image;
    }

    public int getId() {
        return id;
    }


    public static int getCounterId() {
        return counterId;
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

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", category=" + category +
                ", name='" + name + '\'' +
                ", patterns='" + patterns + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", image=" + Arrays.toString(image) +
                ", created=" + created +
                '}';
    }
}
