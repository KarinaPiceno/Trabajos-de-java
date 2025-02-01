package poo;

public class EjercicioClase {
    public static void main(String[] args) {
       //ejercicios de strings 
            String value="class";
            String value1=value.toUpperCase();
            String value2=value1.trim();
            String value3="class";
            System.out.println(value==value3);
            System.out.println(value==value1);
            System.out.println(value.equals(value2));
            System.out.println(value.equals(value3));

       
        //ejercicios de try catch
            try{
                int c = 10/0;
            }catch(ArithmeticException | NumberFormatException e){
                System.out.println("hubo un error");
            }finally{};
            /*
             * otra forma de mostrar lo anterior es:
             * catch(ArithmeticException){}
             * catch(NumberFormatExcdption){}
             * catch(Exception){}
             */
        
        
        //ejercicios de arrays
            int[] x= new int[] {1,2,3};

       //tipos de imprimir arrays
       // con un for de tres partes
            for (int i=0;i<x.length;i++ ){
                    System.out.println(x[i]);
            }

        // for each
            for (int i : x) {
                System.out.println(i);
            }

         //arrays to strings
            System.out.println(x.toString());
         
        //duplicados
            int[] duplicado;
            duplicado = x.clone();
            duplicado[0]=55;
            System.out.println(duplicado.toString());
            System.out.println(x.toString());
         
        //arrays de dos dimensiones
            float [][] y = new float[][] {
                {1.1F, 1.2F},
                {2.1F, 2.2F}
            }; 
                for (int i=0;i<y.length;i++ ){
                    for (int j=0;j<y.length;j++ ){
                        System.out.println(y[i][j]);
                        }        
                }
    }
}
