package umg.com.model;

public abstract class Shape {
    
    public String shape;
    public Shape (String shape){
        this.shape =shape;
    }
    public abstract double area();
    public abstract double perimeter();
}
