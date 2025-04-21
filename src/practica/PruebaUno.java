package practica;

import javax.swing.JOptionPane;

public class PruebaUno {

    public static void main(String[] args) {
        float pi = 3.1416f;
        double radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor asignado al radio: "));
        double area = pi * radio * radio;
        JOptionPane.showMessageDialog(null, "El área del circulo es:" + area );
    
    }
}
