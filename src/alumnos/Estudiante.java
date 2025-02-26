package alumnos;

//la clase de estudiante se crea como una subclase de herencia
public class Estudiante extends Persona{
    //Atributos adicionales a los de la clase persona
        public int matricula;
        public int semestre;
        public String carrera;

    //constructor con parametros 
        public Estudiante(String nombre, int edad, String direccion, int matricula, int semestre, String carrera){
            super(nombre,edad,direccion);
            this.matricula=matricula;
            this.semestre=semestre;
            this.carrera=carrera;
        }
    //constructor sin parametros
        public Estudiante (){
            this.matricula=0;
            this.semestre=0;
            this.carrera="N/A";
        }

    //metodos
        public void mostrarInfo (){
            System.out.println("Nombre de estudiante: "+nombre+"\n"+"Edad: "+edad+"\n"+"Dirección: "+getDireccion()+"\n"+"Matricula: "+matricula);
            System.out.println("Semestre: "+semestre+"\n"+"Carrera: "+carrera +"\n");
        }
}
