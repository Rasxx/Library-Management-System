package project;

public class SportCar extends Car {

    public int speed;
    
    public SportCar(){
    this (0,"","","","",0,null,0);
    }

    public SportCar(int speed, String brand, String model, String carType, String gasType, double KMS,Specifications Specifications, double costPerDay) {
        super(brand, model, carType, gasType, KMS, Specifications, costPerDay);
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public void Display() {
        super.Display();
        System.out.println("-The car speed : " + speed +" km/h ");
    }

}
