package io;

import models.Flower;
import models.Painting;
import services.FlowerService;
import services.PaintingService;

import java.util.List;
import java.util.Scanner;

public class Console {
    private static final Scanner scanner = new Scanner(System.in);

    public static String getStringInput() {
        return scanner.nextLine();
    }

    public static String getNextString() {
        return scanner.next();
    }

    public static void print(String output, Object... args) {
        System.out.printf(output, args);
    }

    public static void println(String output, Object... args) {
        print(output + "\n", args);
    }

    public static <E> void prettyPrint(E output) {
        Console.println(output.toString());
    }

    public static <E> void prettyListPrint(List<E> objectList) {
        for (E element : objectList) {
            Console.println(element.toString());
        }
    }
    public static void printWelcome(){
        System.out.println("" +
                "**************************************************\n" +
                "***              Welcome to ZipCo              ***\n" +
                "***            Paintings & Flowers             ***\n" +
                "**************************************************");
    }
    public static void printMenu(){
        System.out.println(
                "\nMain Menu\n" +
                "(a) - add a product\n" +
                "(s) - see existing products\n" +
                "(u) - udpate existing products\n" +
                "(d) - delete existing products\n" +
                "(x) - exit the menu"
        );
    }
    public static void addProduct(){
        System.out.println("Add a painting by typing: " +
                "painting id artistName paintingName height width price");
    }
    public static void printExisting(FlowerService flowerService, PaintingService paintingService){
        if (!paintingService.getInventory().isEmpty()){
            System.out.println("PAINTINGS");
            for (Painting p : paintingService.getInventory()) {
                System.out.println(p);
            }
        }
        if (!flowerService.getInventory().isEmpty()){
            System.out.println("FLOWERS");
            for (Flower f : flowerService.getInventory()) {
                System.out.println(f);
            }
        }
    }

    public static void updateProducts(){

    }

    public static void deleteProducts(){

    }
}
