package poo;

import javax.swing.JOptionPane;

public class PrimerPracticaB {
    public static void main(String[] args) {
        try{
            int array[]= new int[5];
            int resultado=0;
            for (int i=0; i<5; i++){
                array[i]=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número que desea sumar: "));
                resultado+=array[i];
            }
            JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
