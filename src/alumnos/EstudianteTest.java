package alumnos;

public class EstudianteTest {
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("Karina", 19, "Francisco Ayala #202", 111741, 2, "Inteligencia Artificial" );
        e1.mostrarInfo();
        Estudiante e2 = new Estudiante();
        e2.mostrarInfo();
        Maestro m1 = new Maestro();
        m1.mostrarInfo();
    }
}
