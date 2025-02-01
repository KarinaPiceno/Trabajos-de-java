package poo;
import java.util.Scanner;


public class TercerEjercicio {        
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        
        //se pide al ususario su lenguaje favorito        
        System.out.println("Ingrese su lenguaje de programacion favorito: ");
        String lenguajeFav = scanner.nextLine();

        //mediante if/else se revisa las diferentes posibilidades de lenguaje con el que se va a comparar e imprimir el resultado
        if ((lenguajeFav.trim()).equalsIgnoreCase("java")) {
            System.out.println("tu lenguaje favorito es el mas popular");
        } else if ((lenguajeFav.trim()).equalsIgnoreCase("c")){
            System.out.println("tu lenguaje favorito es el segundo lenguaje mas popular");
        } else if ((lenguajeFav.trim()).equalsIgnoreCase("python")){
            System.out.println("tu lenguaje favorito es el tercer lenguaje mas popular");
        } else {
            System.out.println("tu lenguaje favorito no se encontro en la lista");
           }  
    }
}
