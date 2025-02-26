package com.marista.math;
import java.lang.Math;

public class Cuadratica {
    private int a, b,c;
    boolean tieneSolucion;
    double xPositiva;
    double xNegativa;
    public void setA(int a) {
        this.a = a;
    }
    public void setB(int b) {
        this.b = b;
    }
    public void setC(int c) {
        this.c = c;
    }
    public Cuadratica (int a, int b, int c){
            setA(a);
            setB(b);
            setC(c);
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
        if (tieneSolucion){
            return this.a + "x^2 " + "+ " + this.b + "x"  + "+ " + this.c;
        }
    }
    public boolean equals(Cuadratica a){
        if(this.a!=0&&this.b!=0&&c+this.c!=0&&b==(2*a*c)){
            tieneSolucion
        }
    }
    public static void main (String[] args){

    }
}
