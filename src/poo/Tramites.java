package poo;

public class Tramites <T> {
    int i=0;
    T[] materiasRegistradas; 
    public void registrarMateria (T materia){
                materiasRegistradas[i] = materia;
        i++;
    }
    public void imprimirMaterias (){
        for (T dato : materiasRegistradas ){
            System.out.println( dato+ " ");
        }
    }

    public static void main(String[] args) {
        Tramites  array = new Tramites<>();
        String semestre1 = ("Cálculo");
        array.registrarMateria(semestre1);
    }
}
