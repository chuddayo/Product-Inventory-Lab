package services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

public class IDServiceTest {
    @Test
    public void readFileTest() {
        String expected = "4";

        String actual = IDService.readFile("nextid.txt");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setTextToFileTest() throws FileNotFoundException, UnsupportedEncodingException {
        String expected = "77";
        IDService.setTextToFile(expected, "nextid.txt");

        String actual = IDService.readFile("nextid.txt");

        Assertions.assertEquals(expected, actual);
    }
}
