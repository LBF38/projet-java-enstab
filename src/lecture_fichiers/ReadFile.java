package lecture_fichiers;

import java.util.Scanner;
import java.io.*;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        boolean fileExists = false;
        Scanner in = new Scanner(System.in);
        while (!fileExists) {
            System.out.print("Enter the name of the file: ");
            String filename = in.next();
            try (BufferedReader bf = new BufferedReader(new FileReader(filename));) {
                fileExists = true;
                String line = bf.readLine();
                while (line != null) {
                    System.out.println(line);
                    line = bf.readLine();
                }
                bf.close();
                in.close();
            } catch (FileNotFoundException exception) {
                System.out.println("File not found");
                fileExists = false;
            }
        }
    }
}
