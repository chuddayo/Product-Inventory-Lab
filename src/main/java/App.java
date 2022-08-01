import com.fasterxml.jackson.core.JsonProcessingException;
import io.Console;
import services.FlowerService;
import services.PaintingService;

import java.io.IOException;

public class App {
    private FlowerService flowerService;
    private PaintingService paintingService;

    public static void main(String[] args) {
        App application = new App();
        try {
            application.init();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void init() throws IOException {
        flowerService = new FlowerService();
        paintingService = new PaintingService();

        Console.printWelcome();
        String input;

        do {
            Console.printMenu();
            input = Console.getNextString().toLowerCase();
            switch (input) {
                case "a":
                    Console.addProduct();
                    break;
                case "s":
                    Console.printExisting();
                    break;
                case "u":
                    Console.printExisting();
                    Console.updateProducts();
                    break;
                case "d":
                    Console.printExisting();
                    Console.deleteProducts();
                    break;
            }
        } while (!input.equals("x"));
    }
}