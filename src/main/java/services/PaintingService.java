package services;

import models.Flower;
import models.Painting;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PaintingService {
    private List<Painting> inventory;
    private final ObjectMapper mapper = new ObjectMapper();

    public PaintingService() {
        inventory = readPaintingList();
    }

    public Painting create(String artistName, String paintingName, double height, double width, double price) throws IOException {
        Painting createdPainting = new Painting(IDService.getNextID(), artistName, paintingName, height, width, price);
        create(createdPainting);
        return createdPainting;
    }

    public void create(Painting painting) throws IOException {
        inventory.add(painting);
        writePaintingList();
        IDService.setTextToFile(String.valueOf(IDService.getNextID() + 1), "nextid.txt");
    }

    public void createFromStringArray(String[] paintingArray) throws IOException {
        create(new Painting()
                .withId(IDService.getNextID())
                .withArtistName(paintingArray[0])
                .withPaintingName(paintingArray[1])
                .withHeight(Double.parseDouble(paintingArray[2]))
                .withWidth(Double.parseDouble(paintingArray[3]))
                .withPrice(Double.parseDouble(paintingArray[4])));
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

    public List<Painting> getInventory() {
        return inventory;
    }

    public void removeInventory(int id) throws IOException {
        for (Painting p : inventory) {
            if (p.getId() == id) {
                inventory.remove(p);
                writePaintingList();
                break;
            }
        }
    }

    public void updateInventory(int id, String[] updateDetails) throws IOException {
        for (Painting p : inventory) {
            if (p.getId() == id) {
                p.setArtistName(updateDetails[0]);
                p.setPaintingName(updateDetails[1]);
                p.setHeight(Double.parseDouble(updateDetails[2]));
                p.setWidth(Double.parseDouble(updateDetails[3]));
                p.setPrice(Double.parseDouble(updateDetails[4]));
                writePaintingList();
                break;
            }
        }
    }
}