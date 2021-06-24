package lection11.tasks;

import lection11.tasks.service.FileHandler;

public class ApplicationDemo {
    public static void main(String[] args) {
        String[] strings = FileHandler.readFile("polyndrom.txt");

        for (String string : strings) {
            System.out.println(string);
        }

        FileHandler.writeFile("result.txt",strings);


    }
}
