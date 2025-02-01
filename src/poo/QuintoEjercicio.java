package poo;
import javax.swing.JOptionPane;

public class QuintoEjercicio {
    public static void main(String[] args) {
        
        //Se crea un String donde se va a guardar la contraseña alfanumerica generada aleatoriamente
        String palabra="";

        //Se crea una variable que se va a usar como una bandera para detener el ciclo hasta que se generen el numero de 
        //caracteres especificados en la condicion del ciclo
        int i=0;

        /*
         * En el siguiente ciclo se va a hacer la generacion de la contraseña aleatoria.
         * la logica de este ciclo es generar numeros aleatorios que van a ser interpretados y transformados a caracteres según el 
         * codigo ascii
         */
       do{ 
            //En esta linea solo se esta pidiendo la generacion de un numero aleatrorio en el rango de 48 a 122, ya que en este se 
            //encuentran los numeros y letras minusculas
            int codigoAscii = (int)Math.floor(Math.random()*(122 - 48)+48); 
            
            //Como dentro del rango anterior tambien abarca unos caracteres especiales y letras mayusculas puse un if para poder limitar aun más
            //el rango para que solo tomara los numeros aleatorios que corresponden al rango de los numeros y letras minusculas.
            //una vez que identifica los codigos que nos sirven los combierte de ascii a char y los suma al string donde se va a encontrar la contraseña.
            // Así mismo le suma 1 a la variable que usamos como bandera para simbolizar que agrego un caracter nuevo.
            if ((codigoAscii>47&&codigoAscii<58)||(codigoAscii>96&&codigoAscii<123)) {
                palabra = palabra + (char)codigoAscii;
                i++;
            }
        } while (i<4);

       //Se le explica al usuario como va a funcionar la dinamica del juego.
        JOptionPane.showMessageDialog(null, "Juguemos a las adivinanzas!!"+ "\n" + "Adivina una contraseña, tiene 4 caracteres que incluyen letras minusculas y números."
        + "\n"+ "Mucha suerte" + "\n" + "(Si en cualquier momento te rindes puedes presionar la tecla de escape para cerrar la ventana, además, solo se tomaran en cuenta los intentos que contengan texto,"+"\n"
        + "osea, si das enter sin haber ingresado datos no se contará el intento.)");
        
        //Siendo que la variable i ya no se necesista usar, la reutilice como la variable que lleva la cuenta del número de intentos que a realizado el usuario, iniciando desde 1.
        i=1;

        //se crea la variable que se va a usar para almacenar y comparar la informacion que ingresa el usuario
        String UserImput = "";

        //ciclo que se va a repetir hasta que el usuario logre adivinar 
        do {
            //se le pide al usuario que ingrese su intento
            UserImput = JOptionPane.showInputDialog("Ingresa tu intento: ");
            
            //se evalua si la respuesta del usuario es correcta haciendo un brake para salir del ciclo. En caso de no serlo, se revisa que el usuario haya dado un ingreso de datos, en 
            // caso que no haya ingresado nada se usa un continue para que le vuelva a preguntar sin contar el intento, en caso que sí ingresara algo
            // se da un mensaje de error y se suma 1 a los intentos antes de volver a iniciar el ciclo
            if (UserImput.trim().equals(palabra)==true){
                JOptionPane.showMessageDialog(null, "Felicidades!!!!" + "\n" + "Adivinaste la palabra :)" + "\n" + "Lo lograste en "+i+" intentos");
                break;
            } else if (UserImput.isEmpty()==true){
                continue;
            }else {
                JOptionPane.showMessageDialog(null, "Respuesta incorrecta, intentalo de nuevo");
                i++;
            }
        } while (UserImput.trim().equals(palabra)==false);
    
    }
}
