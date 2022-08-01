package services;

import com.fasterxml.jackson.databind.ObjectMapper;
import models.Flower;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlowerService {
    private static int nextId = 1;
    private List<Flower> inventory;
    private final ObjectMapper mapper = new ObjectMapper();
    public FlowerService() {
        inventory = readFlowerList();
        System.out.println(inventory.size());
    }

    public Flower create(String color, String flowerType, boolean isWrapped, double price) throws IOException {
        Flower createdFlower = new Flower(nextId++, color, flowerType, isWrapped, price);
        create(createdFlower);
        return createdFlower;
    }

    public void create(Flower flower) throws IOException {
        inventory.add(flower);
        writeFlowerList();
    }

    public void createFromStringArray(String[] flowerArray) throws IOException {
        create(new Flower()
                .withId(Integer.parseInt(flowerArray[0]))
                .withColor(flowerArray[1])
                .withFlowerType(flowerArray[2])
                .withIsWrapped(Boolean.parseBoolean(flowerArray[3]))
                .withPrice(Double.parseDouble(flowerArray[4])));
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
}
