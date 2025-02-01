package poo;

import javax.swing.JOptionPane;

public class SextoEjercicio {
    public static void main(String[] args) {
        //se crean las dos variables que se van a utilizar, una para el numero de operandos (el cual se pide al usuario), y el otro donde se guarda el resultado
        int operandos = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número de operandos con el que desea hacer el cálculo: "));
        float respuesta = 0F;
        //ciclo for, este se repite el numero de veces que indique el usuario 

        for (int i=1 ; i<=operandos ; i++){

            if (i%2==1){
                i=i*2;
                respuesta -= 1F/(i+1F);
               i=i/2;
            }else{
                i=i*2;
                respuesta += 1F/(i+1F);
                i=i/2;
            }

        }
        //se imprime en pantalla el resultado
        JOptionPane.showMessageDialog(null,  respuesta*4);
    }
}    
