package alumnos;

public class Persona {
    //Atributos 
        public String nombre;
        public int edad;
        private String direccion;

    //constructor con parametros
        public Persona (String nombre, int edad, String direccion ){
            this.nombre=nombre;
            this.edad=edad;
            this.direccion=direccion;
        }
    //constructor sin parametros 
        public Persona ( ){
            this.nombre="N/A";
            this.edad=0;
            this.direccion="N/A";
        }

    //métodos
        public String getDireccion() {
            return direccion;
        }
        public void setDireccion(String direccion) {
            this.direccion = direccion;
        }
        
}

