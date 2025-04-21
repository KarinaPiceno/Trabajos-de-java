package umg.com;

public class Vehicle {
    protected double fuel;
    protected double speed;

    public void speedUp (){
        speed++;
    }
    public void speedDown(){
        speed--;
    }
    public double getSpeed (){
        return speed;
    }
    public void loadFuel (double f){
        this.fuel = f;
    }
}
