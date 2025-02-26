package shapes2d;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle x = new Rectangle();
        Rectangle y = new Rectangle(8, 4);
        x.area();
        x.perimetro();
        x.print();

        y.area();
        y.perimetro();
        y.print();
    
    }
}
