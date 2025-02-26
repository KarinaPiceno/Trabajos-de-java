package poo;

import javax.swing.JOptionPane;

public class PrimerPracticaA {

    public static void main(String[] args) {
        boolean flag=true;
        String UserImput = JOptionPane.showInputDialog(null, "Ingrese la palabra que desea verificar");
        for (int i=0, j=UserImput.length()-1; i<UserImput.length()/2; i++, j--){
            if (UserImput.charAt(i)!=UserImput.charAt(j)){
                flag=false;
                break;
            }
        }
        if (flag==true){
            JOptionPane.showMessageDialog(null, "Es un palindromo");
        } else{
             JOptionPane.showMessageDialog(null, "No es un palindromo");
         }
    }



}
