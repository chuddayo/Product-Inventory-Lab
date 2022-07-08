package services;

import models.Painting;

import java.util.ArrayList;

public class PaintingService {
    private static int nextId = 1;  // (1)

    private ArrayList<Painting> inventory = new ArrayList<>();  // (2)

    public Painting create(String artistName, String paintingName, double height, double width, double price) {
        Painting createdPainting = new Painting(artistName, paintingName, height, width, price, nextId++);
        inventory.add(createdPainting);
        return createdPainting;
    }
}
