package poo;
import javax.swing.JOptionPane;

public class PgmF {
	public static void main (String [] args){
		//comienzo definiendo una variable que me va a ayudar a contabilizar los errores a la hora de ingresar los datos 
		//este se usa como una flag para poder controlar el numero de intentos máximos permitidos
		int errores = 0;

		//utilizo un ciclo para que siempre y cuando el usuario se equivoque y aún tenga intentos disponibles el programa le vuelva a 
		//preguntar
		do {

			//se utiliza el try/catch  para que el programa pueda detectar y avisar al usuario si tuvo un error al ingresar el formato requerido
	    	try{
                /*se crea un string donde se va a pedir el ingreso de datos al usuario, primero se crea como string para poder detectar si la entrada es valida.
				 *Aquí se compara con "null" poorque es el valor que se recive si el usuario presiona la tecla de escape o cancelar.
				 */
                String UserImput= JOptionPane.showInputDialog(null,"Comprobemos si un número es par, impar o primo" + "\n" + "Por favor ingrese un número natural del 1 al 100");
				if (UserImput==null) break;

				//se convierte el numero ingresado por el usuario de string a integer para poder usarlo cono un número y no un char
			    int num = Integer.parseInt(UserImput);
				
				//se revisa que el número sea menor a 100 y mayor a 0 para revisar que esté dentro del rango dado, al no cumplir cualquiera de estas dos condiciones 
				//se avisa al usuario y se suma un error
				if (num>100 || num<0){
					errores ++;
					JOptionPane.showMessageDialog(null, "Número fuera de rango, le quedan " + (5-errores) + " intentos"+ "\n"+"Recuerde que solo puede ingresar números naturales del 1 al 100");
					continue;
				}

				// Primero determino si un numero es par, ya que (sin contar el mismo 2) todos los numeros pares son divisibles estre dos, así que si lo podemos 
				//dividir entre dos ya no es posible que sea número primo, que si recordamos la definicion son numeros que solo son divisibles entre si mismos y el 
				//numero 1. Al hacer primero la busqueda de los pares nos desasemos de la necesidad de alargar el proceso buscando los numeros primos cada vez.
				//En caso de que encuentre un numero par imprime el resultado y hace un brake para salir del ciclo y terminar el programa
			    if (num%2==0&&num!=2){
				    JOptionPane.showMessageDialog(null, "El número " + num + " es par");
				    break;

				/*Si el número no era par entonces va a determinar si es primo o solo impar. Para saber esto lo que hace es que mediante un ciclo va a ir dividiendo el 
                 *número con todos los anteriores a el hasta llegar a 0. Cada que encuentre una division que tenga como residuo 0 (que sea exacta) se le agregara uno 
				 *a la variable x que en este caso se usa como un contador de divisores
				 */
			    } else {
					//pongo el caso específico del 2 porque es el único número par y primo a la vez
					if (num==2) {
						JOptionPane.showMessageDialog(null, "El número " + num + " es primo y par");
						break;
					}
				    int x=0;
				    int y=num;
				    do {
					    if (num%y==0) {
						    x++;
					    }
					    y--;
				    } while (y!=0);

					//al final se compara x (contador de divisores) para determiar si era primo o no, la logica es que si solo encontro 2 divisores significa que las 
					//únicas divisiones exactas fueron entre si mismo y 1, por lo que se determina que es primo, si por el contrario tuvo más de 2 divisores entoncees
					//solo es impar. Al igual que con los pares se escribe en pantalla el resultado y se sale del ciclo para terminar el programa.
					if (x==2){
					    JOptionPane.showMessageDialog(null, "El número " + num + " es primo e impar");
					    break;
				    } else 	{
					    JOptionPane.showMessageDialog(null, "El número " + num + " es impar");
					    break;
			        }
		        }

				//se utiliza el catch para detectar los errores de formato en numeros, osea si el usuario intentó utilizar o ingresar letras, números decimales o 
				//caracteres especiales. Si detecta un error por el estilo entonces manda un mensaje de error y le agrega 1 a el contador de errores antes de volver a 
				//pregntar
	        }catch(NumberFormatException e){
			    errores ++;
			    JOptionPane.showMessageDialog(null, "Formato incorrecto, le quedan " + (5-errores) + " intentos"+ "\n"+"Recuerde que solo puede ingresar números naturales del 1 al 100");
		    }
	    }while (errores<5);
	}
}
