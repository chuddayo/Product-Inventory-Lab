package services;

import java.io.IOException;

public class InventoryService {
    private FlowerService flowerService;
    private PaintingService paintingService;
    public InventoryService(FlowerService flowerService, PaintingService paintingService) {
        this.flowerService = flowerService;
        this.paintingService = paintingService;
    }

    public void removeItemByID(int id) throws IOException {
        paintingService.removeInventory(id);
        flowerService.removeInventory(id);
    }

    public void updateItemByID(int id, String[] updateDetails) throws IOException {
        if (updateDetails.length == 4) {
            flowerService.updateInventory(id, updateDetails);
        } else if (updateDetails.length == 5) {
            paintingService.updateInventory(id, updateDetails);
        }
    }
}
