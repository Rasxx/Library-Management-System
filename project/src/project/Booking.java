package project;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Booking implements payment {

    private Car car;
    private static int numOfBookings = 0;
    private Customer customer;
    private LocalDate date;
    private int duration;
    private int rNum;//Reservation number
    private Date pickUpDate;
    private String Status;

    public Booking() {
        this(null, null, 0, null);
    }

    public Booking(Car car, Customer customer, int duration, Date pickUpDate) {
        this.car = car;
        this.customer = customer;
        this.duration = duration;
        this.rNum = numOfBookings;
        ++numOfBookings;
        date = LocalDate.now();
        this.pickUpDate = pickUpDate;

    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public static int getNumOfBookings() {
        return numOfBookings;
    }

    public static void setNumOfBookings(int numOfBookings) {
        Booking.numOfBookings = numOfBookings;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getrNum() {
        return rNum;
    }

    public void setrNum(int rNum) {
        this.rNum = rNum;
    }

    public Date getPickUpDate() {
        return pickUpDate;
    }

    public void setPickUpDate(Date pickUpDate) {
        this.pickUpDate = pickUpDate;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public static  Date pickUpDate() {
        Date date1 = null;
        Scanner input = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Enter pick-up date (dd/mm/yyyy):");
        String date2 = input.nextLine();
        if (null != date2 && date2.trim().length() > 0) {
            try {
                date1 = format.parse(date2);
            } catch (ParseException ex) {
                Logger.getLogger(Booking.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return date1;
    }

    public void cancel() {
        setStatus("Cancelled");
        System.out.println("Your booking is cancelled.");
    }

    public void confirm() {
        setStatus("Confirmed");
    }

    @Override
    public double total() {
        double total;
        total = duration * car.getCostPerDay();
        return discount(total);
    }

    @Override
    public double discount(double p) {
        if (customer.isMembership()) {
            System.out.println("You have a 5% discount.");
            return (p - (p * DISCOUNT));
        } else {
            return p;
        }
    }

    public void Display() {
        System.out.println("Booking Reservation number : " + rNum);
        System.out.println("Booking Date : " + date);
        System.out.println("Pickup Date : " + pickUpDate);
        System.out.println("The duration : " + duration + " days ");
        System.out.println("The total price is : " + total() + " SAR ");
        System.out.println("Status : " + Status);
        System.out.println("Customer Information : " + customer.toString());

    }

    @Override
    public String toString() {
        System.out.println("************* Car information *************");
        car.Display();
        return "************* Customer information *************\n" + customer + "\n-Date : " + date + "\n-Duration : " + duration + "\n-Resirvation number : " + rNum + "\n-Pick Up Date : " + pickUpDate + "\n-Status : " + Status;
    }

}
