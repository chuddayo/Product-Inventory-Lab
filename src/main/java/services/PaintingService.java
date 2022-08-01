package services;

import models.Painting;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PaintingService {
    private static int nextId = 1;
    private List<Painting> inventory;
    private final ObjectMapper mapper = new ObjectMapper();

    public PaintingService() {
        inventory = readPaintingList();
        System.out.println("pause");
    }

    public Painting create(String artistName, String paintingName, double height, double width, double price) throws IOException {
        Painting createdPainting = new Painting(nextId++, artistName, paintingName, height, width, price);
        create(createdPainting);
        return createdPainting;
    }

    public void create(Painting painting) throws IOException {
        inventory.add(painting);
        writePaintingList();
    }

    public void createFromStringArray(String[] paintingArray) throws IOException {
        create(new Painting()
                .withId(Integer.parseInt(paintingArray[0]))
                .withArtistName(paintingArray[1])
                .withPaintingName(paintingArray[2])
                .withHeight(Double.parseDouble(paintingArray[3]))
                .withWidth(Double.parseDouble(paintingArray[4]))
                .withPrice(Double.parseDouble(paintingArray[5])));
    }

    public List<Painting> readPaintingList() {
        try {
            return new ArrayList<>(Arrays.asList(mapper.readValue(Paths.get("paintings.json").toFile(), Painting[].class)));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public void writePaintingList() throws IOException {
        mapper.writeValue(Paths.get("paintings.json").toFile(), inventory);
    }

}