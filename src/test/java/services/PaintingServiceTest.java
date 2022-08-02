package services;

import models.Painting;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.io.IOException;

public class PaintingServiceTest {
    @Test
    public void createTest() throws IOException {
        // given
        String artistName = "Smith";
        String paintingName = "Genius";
        double height = 14.32;
        double width = 83.99;
        double price = 14.49;

        // when
        PaintingService paintingService = new PaintingService();
        Painting testPainting = paintingService.create(artistName, paintingName, height, width, price);

        // then
        int actualId = testPainting.getId();
        String actualArtistName = testPainting.getArtistName();
        String actualPaintingName = testPainting.getPaintingName();
        double actualHeight = (double) testPainting.getHeight();
        double actualWidth = (double) testPainting.getWidth();
        double actualPrice = (double) testPainting.getPrice();

        Assertions.assertEquals(Integer.class.getName(), new Integer(actualId).getClass().getName());
        Assertions.assertEquals(artistName, actualArtistName);
        Assertions.assertEquals(paintingName, actualPaintingName);
        Assertions.assertEquals(height, actualHeight);
        Assertions.assertEquals(width, actualWidth);
        Assertions.assertEquals(price, actualPrice);
    }
}
