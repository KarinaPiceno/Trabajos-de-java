package shapes3d;
import javax.swing.JOptionPane;
import shapes2d.Rectangle;

public class RectagleTest2 {
        public static void main(String[] args) {
            Rectangle x = new Rectangle();
            Rectangle y = new Rectangle(8, 4);
            x.area();
            x.perimetro();
            x.print();
    
            y.area();
            y.perimetro();
            y.print();
            
            System.out.println(x.getBase());
            System.out.println(x.getHeight());
            
            x.setBase(Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base")));
            x.setHeight(Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base")));
        
            System.out.println(x.getBase());
            System.out.println(x.getHeight());

            System.out.println(x.getArea());
            System.out.println(x.getPerimetro());
        }
}
    


