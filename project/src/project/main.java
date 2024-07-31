package project;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Rental r = new Rental();
        ArrayList<Booking> b = new ArrayList<>();
        int ch;
        System.out.println("  Welcome to our rental cars agency  ");
        try {

            do {
                System.out.println("--------------------------------------");
                System.out.println("\u001B[46m" + "************* Menu *************" + "\u001B[46m");
                System.out.println("1 - List the cars available .");
                System.out.println("2 - New booking .");
                System.out.println("3 - Display booking information .");
                System.out.println("4 - Cancel booking .");
                System.out.println("5 - Exit .");
                System.out.print("Enter your choice : ");
                ch = input.nextInt();
                switch (ch) {
                    case 1:
                        r.ListCars();
                        break;
                    case 2:
                        r.newBooking(b);
                        break;
                    case 3:
                        r.bookingInformation(b);
                        break;
                    case 4:
                        r.cancelBooking(b);
                        break;
                    case 5:
                        break;
                    default:
                        System.out.println("Not a valid choice.");
                }
            } while (ch != 5);
        } catch (InputMismatchException e) {
            System.out.println("Error : not a valid input !");
        }
    }
}
