package lection11.tasks.service;

import java.io.*;

public class FileHandler {

    public static String[] readFile(String fileName) {
        String result = "";
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {

            StringBuilder stringBuilder = new StringBuilder();


            String line;
            while (reader.readLine() != null) {
                stringBuilder.append(reader.readLine()
                        + "\n");

            }

            result = stringBuilder.toString();


        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        return result.split("\n");
    }

    public static void writeFile(String filename, String[] lines) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (String line : lines) {
                if (isPolyndrom(line)) {
                    writer.write(line + "\n");
                }
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    private static boolean isPolyndrom(String line) {
        StringBuilder stringBuilder = new StringBuilder(line);
        return line.equalsIgnoreCase(stringBuilder.reverse().toString());
    }
}
