package services;

import com.fasterxml.jackson.databind.ObjectMapper;
import models.Flower;
import models.Painting;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlowerService {
    private List<Flower> inventory;
    private final ObjectMapper mapper = new ObjectMapper();
    public FlowerService() {
        inventory = readFlowerList();
        System.out.println(inventory.size());
    }

    public Flower create(String color, String flowerType, boolean isWrapped, double price) throws IOException {
        Flower createdFlower = new Flower(IDService.getNextID(), color, flowerType, isWrapped, price);
        create(createdFlower);
        return createdFlower;
    }

    public void create(Flower flower) throws IOException {
        inventory.add(flower);
        writeFlowerList();
        IDService.setTextToFile(String.valueOf(IDService.getNextID() + 1), "nextid.txt");
    }

    public void createFromStringArray(String[] flowerArray) throws IOException {
        create(new Flower()
                .withId(IDService.getNextID())
                .withColor(flowerArray[0])
                .withFlowerType(flowerArray[1])
                .withIsWrapped(Boolean.parseBoolean(flowerArray[2]))
                .withPrice(Double.parseDouble(flowerArray[3])));
    }

    public List<Flower> readFlowerList() {
        try {
            return new ArrayList<>(Arrays.asList(mapper.readValue(Paths.get("flowers.json").toFile(), Flower[].class)));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public void writeFlowerList() throws IOException {
        mapper.writeValue(Paths.get("flowers.json").toFile(), inventory);
    }
    public List<Flower> getInventory() {
        return inventory;
    }

    public void removeInventory(int id) {
        for (Flower f : inventory) {
            if (f.getId() == id) {
                inventory.remove(f);
                break;
            }
        }
    }
}
