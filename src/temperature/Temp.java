package temperature;

import java.io.*;
import java.util.*;

public class Temp {
    static String[] citiesList = { "Brest", "Paris", "Rennes", "Toulouse", "Nice", "Lyon" };

    public static void registerTemperature(String city, Scanner scanner) {
        String pathToTemperature= "./data/temperature/";
        File temperatureDirectory = new File(pathToTemperature);
        temperatureDirectory.mkdirs();
        try (RandomAccessFile file = new RandomAccessFile(pathToTemperature + city + ".txt", "rw")) {
            if (file.length() > 0) {
                file.seek(file.length());
            }
            System.out.print("Enter the temperature of " + city + " :");
            Date currentDate = new Date();
            float temperature = scanner.nextFloat();
            file.writeChars(currentDate + ";" + temperature + System.lineSeparator());
            file.close();
            System.out.println("Successfully registered the current temperature of "+ city+System.lineSeparator());

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        System.out.println("This is the new meteorology tracker program for getting the city temperature.");
        printMenu();
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        while (choice != 0) {
            registerTemperature(citiesList[choice - 1], scanner);
            printMenu();
            choice = scanner.nextInt();
        }
        scanner.close();
        System.out.println("Exiting the program.");
        System.exit(0);
    }

    private static void printMenu() {
        System.out.println("Enter the number of your city :\n"
                + "0 - Exit Program");
        for (int i = 1; i < citiesList.length; i++) {
            System.out.println(i + " - " + citiesList[i - 1]);
        }
        System.out.print("Your choice :");
    }
}
