package poo;

import java.util.Scanner;

public class PrimerEjercicio {
    public static void main(String[] args) {
        Scanner print = new Scanner (System.in);
        System.out.println("Ingresa tu nombre: ");
        String nombre = print.nextLine();
        System.out.println("Ingresa tu apellido paterno: ");
        String apellidoP = print.nextLine();
        System.out.println("Ingresa tu apellodp materno: ");
        String apellidoM = print.nextLine();
        System.out.println(apellidoP.toUpperCase()+ " " + apellidoM.toUpperCase() + ", " + nombre.toUpperCase()); 
    }
}
