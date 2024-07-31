package project;

public abstract class Car {

    private String brand;
    private String model;
    private String carType;
    private String gasType;
    private double KMS; // the number of kilometers it drives in a year
    private Specifications Specifications;
    private double costPerDay;

// Constructor
    public Car() {
        this("", "", "", "", 0, null, 0);
    }

    public Car(String brand, String model, String carType, String gasType, double KMS, Specifications Specifications, double costPerDay) {
        this.brand = brand;
        this.model = model;
        this.carType = carType;
        this.gasType = gasType;
        this.KMS = KMS;
        this.Specifications = Specifications;
        this.costPerDay = costPerDay;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getGasType() {
        return gasType;
    }

    public void setGasType(String gasType) {
        this.gasType = gasType;
    }

    public double getKMS() {
        return KMS;
    }

    public void setKMS(double KMS) {
        this.KMS = KMS;
    }

    public Specifications getSpecifications() {
        return Specifications;
    }

    public void setSpecifications(Specifications Specifications) {
        this.Specifications = Specifications;
    }

    public double getCostPerDay() {
        return costPerDay;
    }

    public void setCostPerDay(double costPerDay) {
        this.costPerDay = costPerDay;
    }

    public void Display() {
        System.out.println("The car brand : " + brand);
        System.out.println("The car model : " + model);
        System.out.println("The car type : " + carType);
        System.out.println("The gas type : " + gasType);
        System.out.println("Number of kilometers : " + KMS +" km");
        System.out.println("Cost per day : " + costPerDay+" SAR");
        System.out.println(Specifications.toString());

    }

}
