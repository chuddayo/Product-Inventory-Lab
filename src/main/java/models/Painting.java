package models;

public class Painting {
    private String artistName;
    private String paintingName;
    private double height;
    private double width;
    private double price;
    private int id;

    public Painting() {
        this.id = 0;
        this.artistName = "Artist Name";
        this.paintingName = "Painting Name";
        this.height = 0;
        this.width = 0;
        this.price = 0;
    }

    public Painting(String artistName, String paintingName, double height, double width, double price, int id) {
        this.artistName = artistName;
        this.paintingName = paintingName;
        this.height = height;
        this.width = width;
        this.price = price;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getPaintingName() {
        return paintingName;
    }

    public void setPaintingName(String paintingName) {
        this.paintingName = paintingName;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
