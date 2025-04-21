package umg.com.model;

public interface CuadraticPrivate {
   public void insNotNegative();
   public default String cuadratic(){
        return "Método cuadratic";
   }
   public default String square(){
        return "resultado de cuadrado";
   }
   public default String squareRoot(){
        return "resultado de raiz";
   }
}
