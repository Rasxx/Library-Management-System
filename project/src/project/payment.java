package project;

public interface payment {

    public static final double DISCOUNT = 0.05;

    public abstract double total();

    public abstract double discount(double a);

}