package poo;
import java.util.Scanner;

public class SegundoEjercicio {
    public static void main(String[] args) {
        Scanner print = new Scanner (System.in);

        //se pide al usuario que ingrese los diferentes datos necesarios
        System.out.println("ingresa tu velocidad promedio en km/h: ");
        int velProm = print.nextInt();
        System.out.println("ingresa la distancia que te falta recorrer en kilometros: ");
        int distancia = print.nextInt();
        System.out.println("ingresa en cuanto tiempo tienes que llegar a tu destino en minutos: ");
        int tiempoFaltante = print.nextInt();
        
        //se analizan los datos y se determina si el usuario llegará a tiempo para luego imprimirlo en pantalla
        if (((distancia/velProm)*60)<=tiempoFaltante){
            System.out.println("llegas a tiempo");
        } else {
            System.out.println("no llegas a tiempo");
        }
    }
}
