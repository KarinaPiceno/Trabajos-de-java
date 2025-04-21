package poo;

public class Matrix {
    private double[][] data;
    private final static int MIN_ROWS=2;
    private final static int MIN_COLS=1;

    public Matrix (int r, int c){
        if (r > 0 || c>0){
            int cols= Math.max(c, MIN_COLS);
            int row = Math.max(r, MIN_ROWS);
            data = new double[row][cols];
        } else throw new IllegalArgumentException ("fuera de rango");
    }

}
