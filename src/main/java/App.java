import io.Console;
import services.FlowerService;
import services.PaintingService;

public class App {
    private FlowerService flowerService = new FlowerService();
    private PaintingService paintingService = new PaintingService();

    public static void main(String[] args) {
        App application = new App();
        application.init();
    }

    public void init() {
        Console.printWelcome();
    }
}
