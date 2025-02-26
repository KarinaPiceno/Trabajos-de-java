package alumnos;

//la clase de maestro se crea como una subclase de herencia
public class Maestro extends Persona{
    //Atributos adicionales a los de la clase persona
        public String clase;
        public int horasSemana;

    //constructor con parametros 
        public Maestro (String nombre, int edad, String direccion, String clase, int horasSemana){
            super(nombre,edad,direccion);
            this.clase=clase;
            this.horasSemana=horasSemana;
        }
    //constructor sin parametros
    public Maestro (){
        this.clase="N/A";
        this.horasSemana=0;
    }

    //metodos
        public void mostrarInfo () {
            System.out.println("Nombre de maestro: "+nombre+"\n"+"Edad: "+edad+"\n"+"Dirección: "+getDireccion());
            System.out.println("Clase que imparte: "+clase+"\n"+"Horas por semana: "+horasSemana +"\n");
        }

}
