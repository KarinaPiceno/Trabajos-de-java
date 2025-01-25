package poo;

import java.util.Scanner;

public class TercerEjercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Ingrese su lenguaje de programacion favorito: ");
        String lenguajeFav = scanner.nextLine();
        if ((lenguajeFav.trim()).equalsIgnoreCase("java")) {
            System.out.println("tu lenguaje favorito es el mas popular");
        } else if ((lenguajeFav.trim()).equalsIgnoreCase("c++")){
            System.out.println("tu lenguaje favorito es el segundo lenguaje mas popular");
        } else if ((lenguajeFav.trim()).equalsIgnoreCase("python")){
            System.out.println("tu lenguaje favorito es el tercer lenguaje mas popular");
        } else {
            System.out.println("tu lenguaje favorito no se encontro en la lista");
           }  
    }
}
