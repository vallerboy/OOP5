package shop;

public class Product {
    private String name;
    private float weight;
    private Category category;

    public Product(String name, Category category) {
        this.name = name;
        this.category = category;
    }

    public Product() { }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", category=" + category +
                '}';
    }
}
