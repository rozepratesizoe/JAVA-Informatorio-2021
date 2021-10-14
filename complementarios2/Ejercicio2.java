package complementarios2;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio2 {

    public static void main(String[] args){
        
        List<Integer> numeros = new ArrayList<>();


        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);


        for (Integer i : numeros) {
            System.out.println(i);
        }
        System.out.println("Elementos en la lista de números: " + numeros.size());

    
        numeros.add(0, 6);
        numeros.add(7);


        for (Integer i : numeros) {
            System.out.println(i);
        }
        System.out.println("Elementos en la lista de números: " + numeros.size());


    }
    
}

