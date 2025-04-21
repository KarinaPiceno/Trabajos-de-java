package umg.com.model;

public class Book {
    private String titulo;
    private String autor;
    public static final int MIN_TITLE_LENGHT = 2;
    public static final int MAX_TITLE_LENGHT = 50;
    public static final int MIN_AUTOR_LENGHT = 5;
    public static final int MAX_AUTOR_LENGHT = 40;
      
        
        public Book (String t, String a){
            if (t.length()<=MAX_TITLE_LENGHT && t.length()>=MIN_TITLE_LENGHT){
                this.titulo = t;
            }
            if (a.length()<=MAX_AUTOR_LENGHT && a.length()>=MIN_AUTOR_LENGHT){
                this.autor = a;
            }
        }
        public Book (String tya){
            String[] datos = tya.split(",");
            if (datos[0].length()<=MAX_TITLE_LENGHT && datos[0].length()>=MIN_TITLE_LENGHT){
                this.titulo=datos[0];
            } else throw new IllegalArgumentException("El titulo no está dentro del minimo y maximo de caracteres requeridos");
            if (datos[1].length()<=MAX_AUTOR_LENGHT && datos[1].length()>=MIN_AUTOR_LENGHT){
                this.autor=datos[1];
            } else throw new IllegalArgumentException("El autor no está dentro del minimo y maximo de caracteres requeridos");
        }

        public String getAutor() {
            return autor;
        }
        public String getTitulo() {
            return titulo;
        }

        public String getBookDetails(){
            return "Título: " + titulo + ", Autor: " + autor;
        }

        @Override
        public boolean equals(Object o) {
            if (o == this) {
                return true;
            }
            if (o.getClass() != this.getClass()) {
                return false;
            }
            Book c = (Book) o;
            return autor.equals(c.autor)
                    && titulo.equals(c.titulo);        
        }

        @Override
        public String toString() {
            return ("Título: " + titulo + " (Autor: "+ autor+ ")");
        }    
}
