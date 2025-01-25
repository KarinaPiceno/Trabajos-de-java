package poo;

import java.util.Scanner;

/*Velocidad promedio (en kilómetros por hora)​
*Distancia que hace falta (en kilómetros)​
*En cuanto tiempo tiene que llegar (en minutos)​
*Informe al usuario si llegará a tiempo a su destino o no.​ 
 */
public class SegundoEjercicio {
    public static void main(String[] args) {
        Scanner print = new Scanner (System.in);
        System.out.println("ingresa tu velocidad promedio en km/h: ");
        int velProm = print.nextInt();
        System.out.println("ingresa la distancia que te falta recorrer en kilometros: ");
        int distancia = print.nextInt();
        System.out.println("ingresa en cuanto tiempo tienes que llegar a tu destino en minutos: ");
        int tiempoFaltante = print.nextInt();
        
        if (((distancia/velProm)*60)<=tiempoFaltante){
            System.out.println("llegas a tiempo");
        } else {
            System.out.println("no llegas a tiempo");
        }
    }
}
