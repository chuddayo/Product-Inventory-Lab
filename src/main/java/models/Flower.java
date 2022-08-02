package models;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "color",
        "flowerType",
        "isWrapped",
        "price"
})
public class Flower {
    @JsonProperty("id")
    private int id;
    @JsonProperty("color")
    private String color;
    @JsonProperty("flowerType")
    private String flowerType;
    @JsonProperty("isWrapped")
    private boolean isWrapped;
    @JsonProperty("price")
    private double price;

    public Flower() {
    }
    public Flower(int id, String color, String flowerType, boolean isWrapped, double price) {
        this.id = id;
        this.color = color;
        this.flowerType = flowerType;
        this.isWrapped = isWrapped;
        this.price = price;
    }

    @JsonProperty("id")
    public int getId() {
        return id;
    }
    @JsonProperty("id")
    public void setId(int id) {
        this.id = id;
    }
    @JsonProperty("color")
    public String getColor() {
        return color;
    }
    @JsonProperty("color")
    public void setColor(String color) {
        this.color = color;
    }
    @JsonProperty("flowerType")
    public String getFlowerType() {
        return flowerType;
    }
    @JsonProperty("flowerType")
    public void setFlowerType(String flowerType) {
        this.flowerType = flowerType;
    }
    @JsonProperty("isWrapped")
    public boolean isWrapped() {
        return isWrapped;
    }
    @JsonProperty("isWrapped")
    public void setWrapped(boolean wrapped) {
        isWrapped = wrapped;
    }
    @JsonProperty("price")
    public double getPrice() {
        return price;
    }
    @JsonProperty("price")
    public void setPrice(double price) {
        this.price = price;
    }
    public Flower withId(Integer id) {
        this.id = id;
        return this;
    }
    public Flower withColor(String color) {
        this.color = color;
        return this;
    }
    public Flower withFlowerType(String flowerType) {
        this.flowerType = flowerType;
        return this;
    }
    public Flower withIsWrapped(Boolean isWrapped) {
        this.isWrapped = isWrapped;
        return this;
    }
    public Flower withPrice(Double price) {
        this.price = price;
        return this;
    }
    @Override
    public String toString(){
        String output = "";
        output += color + " " + flowerType + " ID#:" + id + "\n";
        if (isWrapped) output += "wrapped ";
        else output += "not wrapped ";
        output += "for $" + price + "\n";
        return output;
    }
}
