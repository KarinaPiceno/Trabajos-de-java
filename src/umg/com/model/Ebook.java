package umg.com.model;

public class Ebook extends Book {
    String url;
    double tamaño;

    public Ebook (String t, String a, String url, double ta ){
        super(t,a);
        if (url.contains(".")){
            this.url=url;
        } else throw new IllegalArgumentException("La url debe contener al menos un punto");
        if (ta>0){
            this.tamaño=ta;
        } else throw new IllegalArgumentException("Tamaño de archivo fuera de rango");
    }
    public Ebook (String tya, String url, double ta ){
        super(tya);
        if (url.contains(".")){
            this.url=url;
        }else throw new IllegalArgumentException("La url debe contener al menos un punto");
        if (ta>0){
            this.tamaño=ta;
        } else throw new IllegalArgumentException("Tamaño de archivo fuera de rango");
    }

    public String getUrl() {
        return url;
    }
    public double getTamaño() {
        return tamaño;
    }
    
    @Override
    public boolean equals(Object o){
        if (this == o){
            return true;
        }
        if (o.getClass() != this.getClass()){
            return false;
        }
        Ebook c = (Ebook) o;
        return Ebook.super.equals(c) && url.equals(c.url) && Double.compare(tamaño, c.tamaño) == 0;
    }

    @Override
    public String toString() {
        return "Título: " + getTitulo() + "(Autor: " + getAutor() + "), Url de descarga: " + url + ", Tamaño: " + tamaño + " MB";
    }
   
    public static void main (String [] args){
    
        Book b1 = new Book("titulo,autor"); // prueba de constructor con un solo string
        Book b3 = new Book("titulo","autor"); //prueba de constructor con dos strings 
        Book b2 = new Book("titulo2,autor2");
        
        System.out.println("Prueba de métodos getTitulo()/getAutor() \n" + b1.getTitulo() + "\n" + b1.getAutor());
        System.out.println("\nPruebas de override de equals() en clase Book \n¿Libro 1 es igual a libro 2? " + b1.equals(b2) + "\n¿Libro 1 es igual a libro 3? " + b1.equals(b3));
        System.out.println("\nPrueba de método getBookDetails() \n" + "Libro 1: " + b1.getBookDetails());
        System.out.println("\nPrueba método toString() de clase libro \n" + b1.toString() + "\n");
   
        
        Ebook e1 = new Ebook("titulo,autor", "www.umg.com", 15.7);
        Ebook e2 = new Ebook("titulo","autor", "www.umg.com", 15.7);
        Ebook e3 = new Ebook("titulo,autor", "www.umg.com", 15.3);
        System.out.println(e1.getAutor()+e1.getBookDetails()+e1.getTitulo());
        System.out.println("Prueba de geters en Ebook \nURL: " + e1.getUrl() + "\nTamaño de archivo: " + e1.getTamaño());
        System.out.println("\nPrueba método toString() de clase Ebook \nElibro 1: " + e1.toString() + "\nElibro 3: " + e3.toString());
        System.out.println("\nPruebas de override de equals() en clase Ebook \n¿Elibro 1 es igual a elibro 2? " + e1.equals(e2) + "\n¿Elibro 1 es igual a elibro 3? " + e1.equals(e3) + "\n");
        
        try{
            Ebook e4 = new Ebook("titulo,autor", "wwwumgcom", 15.3);
            System.out.println(e4.toString());
        }catch (Exception e){
            System.out.println(e);
        }
        try{
            Book b4=new Book("t,autor");
            System.out.println(b4.getBookDetails());
        }catch (Exception e){
            System.out.println(e);
        }
    }

}
