package umg.com;

public class Estudiante extends Persona {
    
    //atributos clase estudiante
    private int  id;
    private String universidad;
    private String carrera;

    //Constructores. Se tiene en cuenta la posibilidad que nos manden todos los parametros o que los manden incompletos
    public Estudiante (int id, String universidad, String carrera){
      setCarrera(carrera);
      setId(id);
      setUniversidad(universidad);          
    }
    public Estudiante (String nombre,int id, String universidad, String carrera){
      super(nombre);
      setCarrera(carrera);
      setId(id);
      setUniversidad(universidad);          
    }
    public Estudiante (){}
    
    //Setterrs y Getters de todos los atributos privados
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    public String getCarrera() {
        return carrera;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }
    public String getUniversidad() {
        return universidad;
    }
    
    //Metodos clase estudiante
    public void practica (int horas){
        System.out.println("Horas de practica por semana: " + horas);
    }

    //Clase main para hacer pruebas
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("Karina", 111741, "UMG", "Inteligencia artificial");
        System.out.println(e1.getNombre() + "\n"+ e1.getId() + "\n"+e1.getUniversidad() +"\n"+ e1.getCarrera());
        e1.ejercita(15);
        e1.estudia(2);
        e1.trabaja(19);
        e1.practica(20);

        Estudiante e2 = new Estudiante( 111741, "UMG", "Inteligencia artificial");
        System.out.println(e1.getNombre() + "\n"+ e1.getId() + "\n"+e1.getUniversidad() +"\n"+ e1.getCarrera());
        e2.ejercita(15);
        e2.estudia(2);
        e2.trabaja(19);
        e2.practica(20);

    }
}
