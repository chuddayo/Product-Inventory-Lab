package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PaintingTest {
    @Test
    public void setArtistNameTest() {
        // given (1)
        String expected = "Floret";

        // when (2)
        Painting testPainting = new Painting();
        testPainting.setArtistName(expected);

        // then (3)
        Assertions.assertEquals(expected, testPainting.getArtistName());
    }

    @Test
    public void setPaintingNameTest() {
        // given (1)
        String expected = "The Flood";

        // when (2)
        Painting testPainting = new Painting();
        testPainting.setPaintingName(expected);

        // then (3)
        Assertions.assertEquals(expected, testPainting.getPaintingName());
    }

    @Test
    public void setHeightTest() {
        // given (1)
        double expected = 14.0;

        // when (2)
        Painting testPainting = new Painting();
        testPainting.setHeight(expected);

        // then (3)
        Assertions.assertEquals(expected, testPainting.getHeight());
    }

    @Test
    public void setWidthTest() {
        // given (1)
        double expected = 155.2;

        // when (2)
        Painting testPainting = new Painting();
        testPainting.setWidth(expected);

        // then (3)
        Assertions.assertEquals(expected, testPainting.getWidth());
    }

    @Test
    public void setPriceTest() {
        // given (1)
        double expected = 44.99;

        // when (2)
        Painting testPainting = new Painting();
        testPainting.setPrice(expected);

        // then (3)
        Assertions.assertEquals(expected, testPainting.getPrice());
    }

    @Test
    public void setIdTest() {
        // given (1)
        int expected = 43;

        // when (2)
        Painting testPainting = new Painting();
        testPainting.setId(expected);

        // then (3)
        Assertions.assertEquals(expected, testPainting.getId());
    }
}
