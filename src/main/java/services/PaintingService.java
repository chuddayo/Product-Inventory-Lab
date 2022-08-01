package services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectWriter;
import models.Painting;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PaintingService {
    private static int nextId = 1;
    private final List<Painting> inventory;
    private final ObjectMapper mapper = new ObjectMapper();
    //private final ObjectWriter writer = new ObjectWriter();

    public PaintingService() throws IOException {
        inventory = readPaintingList();
    }

    public Painting create(String artistName, String paintingName, double height, double width, double price) {
        Painting createdPainting = new Painting(nextId++, artistName, paintingName, height, width, price);
        inventory.add(createdPainting);
        return createdPainting;
    }

    public List<Painting> readPaintingList() throws IOException {
        //mapper.writeValue(new File("example.json"), new Painting(2, "Billy", "Sunrise", 50.0, 24.0, 26.77));
        //Painting myPainting = mapper.readValue(new File("paintings.json"), Painting.class);

        try {
            return Arrays.asList(mapper.readValue(new File("paintings.json"), Painting[].class));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
        //return new ArrayList<>(Collections.singletonList(myPainting));
    }

}
// Paths.get("paintings.json").toFile()