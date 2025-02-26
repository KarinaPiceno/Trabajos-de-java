package shapes2d;

public class Rectangle {
    //atributos
    private double base;
    private double height;

    //contructores
    public Rectangle (){
        this.base=4;
        this.height=2;
    }
    public Rectangle (double base, double height){
        this.base=base;
        this.height=height;
    }

    //metodos
    public double area (){
        return base*height;
    }
    public double perimetro (){
        return 2*(base+height);
    }
    public void print(){
    System.out.println("Resultados: "+"\n"+ "Area: " + area() + "\n" + "Perimetro: " + perimetro());
    }

    
    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        if (base<101&&base>=0) this.base = base;
    }

    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        if (height==2){
            this.height = height;
        } else {
            int x=0;
            double y=height;
            do {
                if (height%y==0) {
                    x++;
                }
                y--;
            } while (y!=0);
            if (x==2){
                this.height = height;
            }
        }
    }

    public double getArea (){
        return area();
    }
    public double getPerimetro (){
        return perimetro();
    }
}
