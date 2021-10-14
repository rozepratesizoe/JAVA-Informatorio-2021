package complementarios2;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio4 {
    
    public static void main(String[] args){

        List<String> nombres = new ArrayList<>();

        nombres.add("Estefanía");
        nombres.add("José");
        nombres.add("María Sofía");
        nombres.add("Andrés");
        nombres.add("Adriana");
        nombres.add("Esteban");
        nombres.add("Luisa");
        nombres.add("Juan Carlos");
        nombres.add("Ana María");
        nombres.add("Federico");
        nombres.add("Estela");
        nombres.add("Salvador");

        List<String> curso1 = nombres.subList(0, 4);
        List<String> curso2 = nombres.subList(4, 8);
        List<String> curso3 = nombres.subList(8, 12);

        System.out.println("Alumnos/as en el curso número 1 son: " + curso1);
        System.out.println("Alumnos/as en el curso número 2 son: " + curso2);
        System.out.println("Alumnos/as en el curso número 3 son: " + curso3);


    }
}
