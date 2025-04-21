package poo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Fechas {
    public static void main(String[] args) {
        LocalDate nacimiento = LocalDate.now();
        LocalDate actual = LocalDate.of(2005,3,1);
        long diferencia = ChronoUnit.DAYS.between(actual, nacimiento);
        System.out.println(diferencia);
    }
}
