package services;

import models.Flower;

import java.util.ArrayList;

public class FlowerService {
    private static int nextId = 1;  // (1)

    private ArrayList<Flower> inventory = new ArrayList<>();  // (2)

    public Flower create(String color, String flowerType, boolean isWrapped, double price,  int qty) {
        Flower createdFlower = new Flower(nextId++, color, flowerType, price, isWrapped, qty);
        inventory.add(createdFlower);
        return createdFlower;
    }

    public ArrayList<Flower> getInventory() {
        return inventory;
    }
}
