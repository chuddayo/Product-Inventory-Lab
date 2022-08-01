package models;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "artistName",
        "paintingName",
        "height",
        "width",
        "price"
})
@Generated("jsonschema2pojo")
public class Painting {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("artistName")
    private String artistName;
    @JsonProperty("paintingName")
    private String paintingName;
    @JsonProperty("height")
    private Object height;
    @JsonProperty("width")
    private Object width;
    @JsonProperty("price")
    private Object price;

    /**
     * No args constructor for use in serialization
     *
     */
    public Painting() {
    }

    /**
     *
     * @param price
     * @param width
     * @param artistName
     * @param id
     * @param paintingName
     * @param height
     */
    public Painting(Integer id, String artistName, String paintingName, Object height, Object width, Object price) {
        super();
        this.id = id;
        this.artistName = artistName;
        this.paintingName = paintingName;
        this.height = height;
        this.width = width;
        this.price = price;
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    public Painting withId(Integer id) {
        this.id = id;
        return this;
    }

    @JsonProperty("artistName")
    public String getArtistName() {
        return artistName;
    }

    @JsonProperty("artistName")
    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public Painting withArtistName(String artistName) {
        this.artistName = artistName;
        return this;
    }

    @JsonProperty("paintingName")
    public String getPaintingName() {
        return paintingName;
    }

    @JsonProperty("paintingName")
    public void setPaintingName(String paintingName) {
        this.paintingName = paintingName;
    }

    public Painting withPaintingName(String paintingName) {
        this.paintingName = paintingName;
        return this;
    }

    @JsonProperty("height")
    public Object getHeight() {
        return height;
    }

    @JsonProperty("height")
    public void setHeight(Object height) {
        this.height = height;
    }

    public Painting withHeight(Object height) {
        this.height = height;
        return this;
    }

    @JsonProperty("width")
    public Object getWidth() {
        return width;
    }

    @JsonProperty("width")
    public void setWidth(Object width) {
        this.width = width;
    }

    public Painting withWidth(Object width) {
        this.width = width;
        return this;
    }

    @JsonProperty("price")
    public Object getPrice() {
        return price;
    }

    @JsonProperty("price")
    public void setPrice(Object price) {
        this.price = price;
    }

    public Painting withPrice(Object price) {
        this.price = price;
        return this;
    }

}