package io;

import java.util.List;
import java.util.Scanner;

public class Console {
    private static final Scanner scanner = new Scanner(System.in);

    public static String getStringInput(String prompt) {
        println(prompt);
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
                "***                 Welcome to                 ***\n" +
                "***          ZipCo Inventory Manager           ***\n" +
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

    }
    public static void printExisting(){

    }

    public static void updateProducts(){

    }

    public static void deleteProducts(){

    }
}
