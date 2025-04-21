package com.marista.math;
import java.lang.Math;

import javax.swing.JOptionPane;

public class Cuadratica {
    private int a, b,c;
    boolean tieneSolucion;
    double xPositiva;
    double xNegativa;
    public void setA(int a) {
        this.a = a;
    }
    public int getA() {
        return a;
    }
    public void setB(int b) {
        this.b = b;
    }
    public int getB() {
        return b;
    }
    public void setC(int c) {
        this.c = c;
    }
    public int getC() {
        return c;
    }
    
    public Cuadratica (int a, int b, int c){
            setA(a);
            setB(b);
            setC(c);
            solve();
    }
    public double getxNegativa() {
        return xNegativa;
    }
    public double getxPositiva() {
        return xPositiva;
    }
    public boolean getTieneSolucion(){
        return tieneSolucion;
        }   
    public String toString(){
        if (getTieneSolucion()){
            return this.a + "x^2 " + "+ " + this.b + "x"  + "+ " + this.c +". = (" + xPositiva + ", " + xNegativa + ")";
        }else {
            return this.a + "x^2 " + "+ " + this.b + "x"  + "+ " + this.c +". No tiene solucion real";
        }
    }
    public boolean equals(Cuadratica a){
       return getTieneSolucion();
    }
    private void solve (){
        if(a!=0&&b!=0&&c!=0&&(b==(2*Math.sqrt(a)*Math.sqrt(c)))){
            tieneSolucion=true;
            xPositiva= (-this.b+Math.sqrt(Math.pow(this.b,2)-(4*this.a*this.c))/2*this.a);
            xNegativa= (-this.b-Math.sqrt(Math.pow(this.b,2)-(4*this.a*this.c))/2*this.a);
        }else{
            tieneSolucion=false;
        }
        
    }
     
    public static void main (String[] args){
        Cuadratica c1 = new Cuadratica(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de a")), Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de b")), Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de c")));
        JOptionPane.showMessageDialog(null, c1.toString());
    }
}
