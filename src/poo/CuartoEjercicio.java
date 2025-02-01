package poo;
import javax.swing.JOptionPane;


public class CuartoEjercicio {
    public static void main(String[] args) {
        //declaracion de los arrays de strings que luego se utilizaran para los botones de la ventana.
        //se crean uno por cada posibilidad (mes con 30, 31, 28 o 29 dÍas).
        String[] opcionesf = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28"};
        String[] opcionesfb ={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29"};
        String[] opciones30 ={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30"};
        String[] opciones31 ={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
        
        //se pregunta por el año que desea seleccionar, al mismo tiempo la respuesta del usuario se combierte de un string a un 
        //integer para poder realizar las operaciones para determinar si el año es biciesto.
        int año =Integer.parseInt(JOptionPane.showInputDialog("Escribe el año que deseas seleccionar: "));
        
        //se pregunta al usuario por el mes que desea
        String mes = JOptionPane.showInputDialog("Escribe el mes que deseas seleccionar: ");
        
        // se crea una variable donde se va a guardar el valor del dia que escoja el usuario.
        int dia=1;

        //Se utiliza un switch para determinar cual de los casos se cumple. 
        //En este caso tenemos 12 casos (uno por cada mes) y un default. Los de cada mes nos van a mostrar la ventana de opción correspondiente
        //y el default nos mostrara un mensaje de error si es que no encuentra ninguna coincidencia.
        // en la evaluacion estoy pasando el string a solo minusculas y quitando los espacios que pudiera haber ingresado el usuario para 
        // evitar un error falso.
        //Devido a que la opcion nos devuelve el indice del botón seleccionado, al final se le está sumando 1 para cuadrar el numero de índice con el número que 
        //muestra el botón
        switch (mes.toLowerCase().trim()) {
            case "enero":
                dia=JOptionPane.showOptionDialog(null, "Escoge un dia", "", 0, 3, null, opciones31, opciones31[0])+1;
                break;
            case "febrero":
                if ((año%4==0 && año%100!=0) || (año%400==0)){
                    dia=JOptionPane.showOptionDialog(null, "Escoge un dia", "", 0, 3, null, opcionesfb, opcionesfb[0])+1;
                } else {
                    dia = JOptionPane.showOptionDialog(null, "Escoge un dia", "", 0, 3, null, opcionesf, opcionesf[0])+1;
                }
                break;
            case "marzo":
                dia=JOptionPane.showOptionDialog(null, "Escoge un dia", "", 0, 3, null, opciones31, opciones31[0])+1;
                break;
            case "abril":
                dia=JOptionPane.showOptionDialog(null, "Escoge un dia", "", 0, 3, null, opciones30, opciones30[0])+1;
                break;
            case "mayo":
                dia=JOptionPane.showOptionDialog(null, "Escoge un dia", "", 0, 3, null, opciones31, opciones31[0])+1;
                break;
            case "junio":
                dia=JOptionPane.showOptionDialog(null, "Escoge un dia", "", 0, 3, null, opciones30, opciones30[0])+1;
                break;
            case "julio":
                dia=JOptionPane.showOptionDialog(null, "Escoge un dia", "", 0, 3, null, opciones31, opciones31[0])+1;
                break;
            case "agosto":
                dia=JOptionPane.showOptionDialog(null, "Escoge un dia", "", 0, 3, null, opciones30, opciones30[0])+1;
                break;
            case "septiembre":
                dia=JOptionPane.showOptionDialog(null, "Escoge un dia", "", 0, 3, null, opciones30, opciones30[0])+1;
                break;
            case "octubre":
                dia=JOptionPane.showOptionDialog(null, "Escoge un dia", "", 0, 3, null, opciones31, opciones31[0])+1;
                break;
            case "noviembre":
                dia=JOptionPane.showOptionDialog(null, "Escoge un dia", "", 0, 3, null, opciones30, opciones30[0])+1;
                break;
            case "diciembre":
                dia=JOptionPane.showOptionDialog(null, "Escoge un dia", "", 0, 3, null, opciones31, opciones31[0])+1;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Mes no valido", "Error", 0);
                break;
        }
        //Se muestra la selección completa del usuario para confirmar el funcionamiento del programa
        JOptionPane.showMessageDialog(null, "Escogiste el " + dia + " de " + mes + " del "+ año);
    }
}