package models;

public class Flower {
    private int id;
    private int qty;
    private String color;
    private String flowerType;
    private boolean isWrapped;
    private double price;

    public Flower() {
        this.id = 0;
        this.color = "N/A";
        this.flowerType = "N/A";
        this.price = 0;
        this.isWrapped = false;
        this.qty = 1;
    }
    public Flower(int id, String color, String flowerType, double price) {
        this.id = id;
        this.color = color;
        this.flowerType = flowerType;
        this.price = price;
        this.isWrapped = false;
        this.qty = 1;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFlowerType() {
        return flowerType;
    }

    public void setFlowerType(String flowerType) {
        this.flowerType = flowerType;
    }

    public boolean isWrapped() {
        return isWrapped;
    }

    public void setWrapped(boolean wrapped) {
        isWrapped = wrapped;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
