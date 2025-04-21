package umg.com.model;

public class MathOperation implements CuadraticPrivate{
    public void insNotNegative(){
        System.out.println("no es negativa");
    }
    public void mostrar (){
        insNotNegative();
        System.out.println("\n"+ cuadratic() + "\n" + square() +"\n"+ squareRoot());
    }
}
