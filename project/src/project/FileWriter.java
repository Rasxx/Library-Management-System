package project;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;

public class FileWriter {

    private Formatter myObj;

// First method
    public void openToFile(String myFile) {

        try {
            myObj = new Formatter(myFile);
        } catch (SecurityException ex) {
            System.out.println(ex);
            System.exit(1);
        } catch (FileNotFoundException ex) {
            System.out.println("Error : File Not Found !");
            System.exit(1);
        }

    }

// seconed method
    public void writeToFile(Booking P) {
        try {
            myObj.format(P.toString());
        } catch (FormatterClosedException ex) {
            System.err.println("Error : writing to file ! ");
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
