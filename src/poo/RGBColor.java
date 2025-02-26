package poo;

public class RGBColor {
    //atributos
    int rojo=127;
    int verde=127;
    int azul=127;
    String nombre= "Gris";

    //constructores
    public RGBColor (){
        this.rojo=127;
        this.verde=127;
        this.azul=128;
    }
    public RGBColor (int rojo, int verde, int azul){
        if (0<=rojo&&rojo<256){
            this.rojo=rojo;
        }
        if (0<=verde&&verde<256){
            this.verde=verde;
        }
        if (0<=azul&&azul<256){
            this.azul=rojo;
        }
    }
    public RGBColor (int rojo, int verde, int azul, String nombre){
        if (0<=rojo&&rojo<256){
            this.rojo=rojo;
        }
        if (0<=verde&&verde<256){
            this.verde=verde;
        }
        if (0<=azul&&azul<256){
            this.azul=rojo;
        }
        this.nombre=nombre;
    }
    
    //metodos
    public void setRojo(int rojo) {
        if (0<=rojo&&rojo<256){
            this.rojo=rojo;
        }
    }
    public void setVerde(int verde) {
        if (0<=verde&&verde<256){
            this.verde=verde;
        }
    }
    public void setAzul(int azul) {
        if (0<=azul&&azul<256){
            this.azul=rojo;
        }
    }
    public int getMagenta (int rojo, int verde, int azul){
        //Respuesta pendiente
        return 1;
    }
    public int getAmarillo (int rojo, int verde, int azul){
        //Respuesta pendiente
        return 2;
    }
    public int getCyan (int rojo, int verde, int azul){
        //Respuesta pendiente
        return 3;
    }
    public int getRGB(){
        //codigo en binario pendiente de hacer
        return 3;
    }
    
    public String toString(){
        return this.rojo + " " + this.verde + " " + this.azul + " " + this.nombre;
    }
    
    public static void main(String[] args) {
        RGBColor myC1 = new RGBColor();
        RGBColor myC2 = new RGBColor(10, 20, 300);
        System.out.println(myC1.toString());
        System.out.println(myC2.toString());

    }

}
