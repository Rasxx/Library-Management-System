package project;

public class ElectricCar extends Car {

    private double batteryCapacity;

    public ElectricCar() {

        this(0, "", "", "", "", 0, null, 0);

    }

    public ElectricCar(double batteryCapacity, String brand, String model, String carType, String gasType, double KMS, project.Specifications Specifications, double costPerDay) {
        super(brand, model, carType, gasType, KMS, Specifications, costPerDay);
        this.batteryCapacity = batteryCapacity;
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public void Display() {
        super.Display();
        System.out.println("-The car battery capacity : " + batteryCapacity + " W");
    }

}
