package umg.com;

public class Persona {
    //atributos de la clase persona
    private String nombre = "SN";

    //constructores tanto con paarametros como vacios  
    public Persona (String nombre){
        setNombre(nombre);
    }
    public Persona (){}
    
    //Setter y getter para atributo privado
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    //metodos de la clase persona
    public void estudia(int grado){
        System.out.println("Grado que está cursando: " + grado + "°");
    }
    public void trabaja (int años){
        if (años>18){
            System.out.println("Tiene edad para trabajar");
        } else {
            System.out.println("No tiene edad para trabajar");
        }
    }
    public void ejercita (int horas){
        System.out.println("Horas de ejercicio a la semana: " + horas);
    }
}
