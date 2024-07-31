package project;

import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;
import java.util.Date;
import java.util.InputMismatchException;

public class Rental {

    Scanner input = new Scanner(System.in);

    Car[] carlist = new Car[50];

    public void addCars() {
        carlist[0] = (new SportCar(490, "Bugatti", "Chiron", "Sport Car", "Gasoline", 10000, new Specifications("Black", true, true), 30000));
        carlist[1] = (new SUV(8, "Toyota", "Land Cruiser", "SUV", "Gasoline", 15000, new Specifications("White", true, false), 400));
        carlist[2] = (new ElectricCar(800, "Audi", "Audi E-tron", "Electric Car", "Electricity", 12000, new Specifications("Blue", true, true), 1000));
    }

    public void ListCars() {
        addCars();
        System.out.println("--------------------------------------");
        System.out.println("\u001B[46m" + "********Cars available********" + "\u001B[46m");
        System.out.println("1 - Sport car .");
        System.out.println("2 - SUV car . ");
        System.out.println("3 - Electric car . ");
        System.out.print("Enter your choice : ");
        int c = input.nextInt();
        switch (c) {
            case 1:
                carlist[0].Display();
                break;
            case 2:
                carlist[1].Display();
                break;
            case 3:
                carlist[2].Display();
                break;
            default:
                System.out.println("Error : Not a valid choise ! ");
                break;
        }
    }

    public void newBooking(ArrayList<Booking> b) {
// ********************** cutomer info *************************************
        try {
            System.out.print("Enter your name : ");
            String name = input.next();
            System.out.print("Enter your ID : ");
            int ID = input.nextInt();
            System.out.print("Enter your phone number : ");
            int num = input.nextInt();
            System.out.print("Enter your address : ");
            String address = input.next();
            System.out.println("Do you have a membership : (1-VIP 2-Guest)  ");
            int choice = input.nextInt();
            boolean memshp;
            if (choice == 1) {
                memshp = true;
            } else {
                memshp = false;
            }
// **************************** booking info *******************************************
            System.out.println("Enter the duration : (in days)");
            int dur = input.nextInt();
            ListCars();
            System.out.println("--------------------------------------");

            System.out.print("Enter the car chosen : ");
            int carNum = input.nextInt();

            Date d1 = Booking.pickUpDate();

            System.out.println("Do you want to confirm your booking ?"
                    + "\nEnter number :  1- yes  or  2- No ");

            int confirmNum = input.nextInt();
            if (confirmNum == 1) {
                System.out.println("your booking is confirmed, "
                        + "\nThanks " + name + " .");

                System.out.println("\n*******Your booking information*******\n");

                Customer c1 = new Customer(name, num, address, memshp, ID);

                switch (carNum) {
                    case 1:
                        Booking booking1 = new Booking(carlist[0], c1, dur, d1);
                        b.add(booking1);
                        booking1.confirm();
                        booking1.Display();
                        FileWriter writer1 = new FileWriter();
                        writer1.openToFile("booking.txt");
                        writer1.writeToFile(booking1);
                        writer1.closeFile();
                        break;

                    case 2:
                        Booking booking2 = new Booking(carlist[1], c1, dur, d1);
                        b.add(booking2);
                        booking2.confirm();
                        booking2.Display();
                        FileWriter writer2 = new FileWriter();
                        writer2.openToFile("booking.txt");
                        writer2.writeToFile(booking2);
                        writer2.closeFile();
                        break;

                    case 3:
                        Booking booking3 = new Booking(carlist[2], c1, dur, d1);
                        b.add(booking3);
                        booking3.confirm();
                        booking3.Display();
                        FileWriter writer3 = new FileWriter();
                        writer3.openToFile("booking.txt");
                        writer3.writeToFile(booking3);
                        writer3.closeFile();

                        break;

                }
            } else {
                System.out.println("Your booking is not confirmed.");

            }
        } catch (InputMismatchException e) {
            System.err.println("Error : not a valid input !");
        }
    }

    public void bookingInformation(ArrayList<Booking> b) {
        System.out.print("Enter booking number : ");
        int id = input.nextInt();

        for (Booking x : b) {
            if (x.getrNum() == id) {
                x.Display();
                return;
            }}
            System.out.println("There is no such booking.");

        
    }

    public void cancelBooking(ArrayList<Booking> b) {
        System.out.print("Enter booking number : ");
        int id = input.nextInt();

        for (Booking x : b) {
            if (x.getrNum() == id) {
                x.cancel();
                return;
            }}
            System.out.println("There is no such booking.");

        
    }

    public void readBooking() {
        FileReader reader = new FileReader();
        reader.openTextFile("booking.txt");
        reader.readFromFile();
        reader.closeFile();
    }

}
