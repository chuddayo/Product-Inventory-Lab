package services;

import java.io.*;

public class IDService {
    public static String readFileNextInteger() {
        String nextID;
        try (BufferedReader br = new BufferedReader(new FileReader("nextid.txt"))) {
            nextID = br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return nextID;
    }

    public static void setTextToFile(String textToSet, String fileName) throws FileNotFoundException, UnsupportedEncodingException {
        PrintWriter writer = new PrintWriter(fileName, "UTF-8");
        String[] allLines = textToSet.split("\n");
        for (String str : allLines) {
            writer.println(str);
        }
        writer.close();
    }

    public static int getNextID(){
        return Integer.parseInt(readFileNextInteger());
    }
}
