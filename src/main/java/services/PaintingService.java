package services;

import com.fasterxml.jackson.core.JsonProcessingException;
import models.Painting;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Arrays;
import java.util.List;

public class PaintingService {
    private static int nextId = 1;
    private final List<Painting> inventory;
    private final ObjectMapper mapper = new ObjectMapper();

    public PaintingService() throws JsonProcessingException {
        inventory = readPaintingList();
    }

    public Painting create(String artistName, String paintingName, double height, double width, double price) {
        Painting createdPainting = new Painting(artistName, paintingName, height, width, price, nextId++);
        inventory.add(createdPainting);
        return createdPainting;
    }

    public List<Painting> readPaintingList() throws JsonProcessingException {
        return Arrays.asList(mapper.readValue("paintings.json", Painting[].class));
    }

}
