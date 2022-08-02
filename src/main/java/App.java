
import io.Console;
import services.FlowerService;
import services.IDService;
import services.InventoryService;
import services.PaintingService;
import java.io.IOException;
import java.util.Arrays;

public class App {
    private FlowerService flowerService;
    private PaintingService paintingService;
    private InventoryService inventoryService;

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
        inventoryService = new InventoryService(flowerService, paintingService);

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
                    } else if (inputArray[0].equalsIgnoreCase("flower")) {
                        flowerService.createFromStringArray(Arrays.copyOfRange(inputArray, 1, inputArray.length));
                    }
                    break;
                case "s":
                    Console.printExisting(flowerService, paintingService);
                    break;
                case "u":
                    Console.printExisting(flowerService, paintingService);
                    Console.updateProducts();
                    int idToUpdate = Integer.parseInt(Console.getStringInput());
                    Console.println("Enter updated info for item #" + idToUpdate);
                    input = Console.getStringInput();
                    inputArray = input.split(" ");
                    inventoryService.updateItemByID(idToUpdate, inputArray);
                    break;
                case "d":
                    Console.printExisting(flowerService, paintingService);
                    Console.deleteProducts();
                    input = Console.getStringInput();
                    inventoryService.removeItemByID(Integer.parseInt(input));
                    break;
            }
        } while (!input.equals("x"));
    }
}