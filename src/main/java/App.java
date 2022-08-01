
import io.Console;
import services.FlowerService;
import services.PaintingService;
import java.io.IOException;
import java.util.Arrays;

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
        String[] inputArray;

        do {
            Console.printMenu();
            input = Console.getStringInput().toLowerCase();
            switch (input) {
                case "a":
                    Console.addProduct();
                    input = Console.getStringInput();
                    inputArray = input.split(" ");
                    if (inputArray[0].equalsIgnoreCase("painting")) {
                        paintingService.createFromStringArray(Arrays.copyOfRange(inputArray, 1, inputArray.length));
                    }
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