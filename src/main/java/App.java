import io.Console;
import services.FlowerService;
import services.PaintingService;

import java.util.Locale;
import java.util.Scanner;

public class App {
    private FlowerService flowerService = new FlowerService();
    private PaintingService paintingService = new PaintingService();

    public static void main(String[] args) {
        App application = new App();
        application.init();
    }

    public void init() {
        Console.printWelcome();
        Scanner in = new Scanner(System.in);
        String input;

        do {
            Console.printMenu();
            input = in.next().toLowerCase();
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
