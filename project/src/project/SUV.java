package project;

public class SUV extends Car {

    public int capacity;

    public SUV() {
        this(0, "", "", "", "", 0, null, 0);

    }

    public SUV(int capacity, String brand, String model, String carType, String gasType, double KMS, project.Specifications Specifications, double costPerDay) {
        super(brand, model, carType, gasType, KMS, Specifications, costPerDay);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public void Display() {
        super.Display();
        System.out.println("-The car capasity : " + capacity);
    }

}
