package project;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class FileReader {

    private Scanner myObj;

// First method
    public void openTextFile(String myFile) {
        try {
            myObj = new Scanner(new File(myFile));
        } catch (FileNotFoundException ex) {
            System.err.println("Error : File Not Found ! ");
            System.exit(1);
        }
    }

// Seconed method
    public void readFromFile() {
        try {
            while (myObj.hasNext()) {
                System.out.println(myObj.nextLine());
            }
        } catch (NoSuchElementException ex) {
            System.err.println("Error : File improperly formed ! ");
            myObj.close();
            System.exit(1);
        } catch (IllegalStateException ex) {
            System.err.println("Error : reading from file !");
            System.exit(1);
        }
    }

// Third method
    public void closeFile() {
        if (myObj != null) {
            myObj.close();
        }
    }
}
