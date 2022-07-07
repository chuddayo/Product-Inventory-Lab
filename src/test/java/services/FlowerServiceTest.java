package services;

import models.Flower;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FlowerServiceTest {
    @Test
    public void createTest() {
        // given
        int qty = 10;
        String color = "brown";
        String flowerType = "banana";
        boolean isWrapped = true;
        double price = 14.49;

        // when
        FlowerService flowerService = new FlowerService();
        Flower testFlower = flowerService.create(color, flowerType, isWrapped, price, qty);

        // then
        int actualId = testFlower.getId();
        int actualQty = testFlower.getQty();
        String actualColor = testFlower.getColor();
        String actualFlowerType = testFlower.getFlowerType();
        boolean actualIsWrapped = testFlower.isWrapped();
        double actualPrice = testFlower.getPrice();

        Assertions.assertEquals(Integer.class.getName(), new Integer(actualId).getClass().getName());
        Assertions.assertEquals(qty, actualQty);
        Assertions.assertEquals(color, actualColor);
        Assertions.assertEquals(flowerType, actualFlowerType);
        Assertions.assertEquals(isWrapped, actualIsWrapped);
        Assertions.assertEquals(price, actualPrice);
    }
}
