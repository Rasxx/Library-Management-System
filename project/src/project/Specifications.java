
package project;

public class Specifications {
    private String color;
    private boolean AC;
    private boolean wifi;
    
    public Specifications(){
    this ("",false,false);
    }

    public Specifications(String color, boolean AC, boolean wifi) {
        this.color = color;
        this.AC = AC;
        this.wifi = wifi;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isWifi() {
        return wifi;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

 
    public boolean isAC() {
        return AC;
    }

    public void setAC(boolean AC) {
        this.AC = AC;
    }

    @Override
    public String toString() {
        return "\n******Car specifications******" + "\n-Color : " + color + "\n-wifi : " + wifi + "\n-AC : " + AC ;
    }
 
    
}
