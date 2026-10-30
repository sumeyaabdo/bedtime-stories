package com.pluralsight;
import java.util.Scanner;
import java.io.*;

public class BedtimeStories {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name of a story: ");
        String fileName = scanner.nextLine();

        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufReader = new BufferedReader(fileReader);

            String input;
            int lineNumber = 1;

            while ((input = bufReader.readLine()) != null) {
                System.out.println(lineNumber + ". " + input);
                lineNumber++;
            }

            bufReader.close();

        } catch (IOException e) {
            System.out.println("Error reading the file!");
            e.printStackTrace();
        }

        scanner.close();
    }
}
