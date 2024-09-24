import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {


        DecimalFormat df = new DecimalFormat("0.00000");


        Gerente g1 = new Gerente(" 123456", " Andres", 180000000, " TI");


        Desarrollador d1 = new Desarrollador(" 666666"," Laura", 2500000, " Java");


        g1.mostrarDetalles();
        System.out.println(df.format(g1.calcularBonificacion()));

        d1.mostrarDetalles();
        System.out.println(df.format(d1.calcularBonificacion()));


    }
}