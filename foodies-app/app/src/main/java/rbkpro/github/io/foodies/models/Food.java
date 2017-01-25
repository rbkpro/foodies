package rbkpro.github.io.foodies.models;

/**
 * Created by rbkpro on 24/01/2017.
 */

public class Food {

    private String name;
    private double price;
    private String description;
    private int imageId;
    private double calories;
    private String category;

    public Food(String name, double price, String description, int imageId, double calories, String category) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.imageId = imageId;
        this.calories = calories;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public int getImageId() {
        return imageId;
    }

    public double getCalories() {
        return calories;
    }

    public String getCategory() {
        return category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", imageId=" + imageId +
                ", category='" + category + '\'' +
                '}';
    }

}
