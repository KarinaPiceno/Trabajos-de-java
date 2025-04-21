package umg.com.model;

public class ShapeCuadrilateral extends Shape implements ShapeTheorem{
    public int lado1;
    public int lado2;
    public ShapeCuadrilateral (String shape, int l1, int l2){
        super(shape);
        this.lado1 = l1;
        this.lado2 = l2;
    }
    public double pitagorasT(int l1,int l2){
        return Math.sqrt((l1*l1)+(l2*l2));
    }
    public double area(){
        return((lado1*lado2)/2);
    }
    public double perimeter(){
        return(lado1+lado2+pitagorasT(lado1,lado2));
    }
    public double senoT(){
        return lado1/pitagorasT(lado1,lado2);
    }
    public double cosenoT(){
        return lado2/pitagorasT(lado1,lado2);

    }
}
