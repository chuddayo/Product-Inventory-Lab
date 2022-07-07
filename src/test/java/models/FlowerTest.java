package models;
import org.junit.jupiter.api.*;
public class FlowerTest {
    @Test
    public void setFlowerTypeTest() {
        // given (1)
        String expected = "Tulip";

        // when (2)
        Flower testFlower = new Flower();
        testFlower.setFlowerType(expected);

        // then (3)
        Assertions.assertEquals(expected, testFlower.getFlowerType());
    }

    @Test
    public void setPriceTest() {
        // given
        double expected = 19.99;

        // when
        Flower testFlower = new Flower();
        testFlower.setPrice(expected);

        // then
        Assertions.assertEquals(expected, testFlower.getPrice());
    }

    @Test
    public void setWrappedTest() {
        // given
        boolean isWrapped = false;

        // when
        Flower testFlower = new Flower();
        testFlower.setWrapped(true);

        // then
        Assertions.assertTrue(testFlower.isWrapped());
    }

    @Test
    public void setColorTest() {
        // given
        String expected = "lavender";

        // when
        Flower testFlower = new Flower();
        testFlower.setColor(expected);

        // then
        Assertions.assertEquals(expected, testFlower.getColor());
    }

    @Test
    public void setQtyTest() {
        // given
        int expected = 47;

        // when
        Flower testFlower = new Flower();
        testFlower.setQty(expected);

        // then
        Assertions.assertEquals(expected, testFlower.getQty());
    }

    @Test
    public void setIdTest() {
        // given
        int expected = 3;

        // when
        Flower testFlower = new Flower();
        testFlower.setId(expected);

        // then
        Assertions.assertEquals(expected, testFlower.getId());
    }
}
