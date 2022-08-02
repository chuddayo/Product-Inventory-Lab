package services;

import models.Flower;
import models.Painting;

public class InventoryService {
    private FlowerService flowerService;
    private PaintingService paintingService;
    public InventoryService(FlowerService flowerService, PaintingService paintingService) {
        this.flowerService = flowerService;
        this.paintingService = paintingService;
    }

    public void removeItemByID(int id) {
        paintingService.removeInventory(id);
        flowerService.removeInventory(id);
    }

    public void updateItemByID(int id) {

    }
}
