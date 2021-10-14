package complementarios2;

import java.util.ArrayList;
import java.util.*;
import java.util.List;

public class Ejercicio3 {

    public static void main(String[] args){

        List<String> baraja = new ArrayList<>();

        baraja.add("1 Corazón");
        baraja.add("2 Corazones");
        baraja.add("3 Corazones");
        baraja.add("4 Corazones");
        baraja.add("5 Corazones");
        baraja.add("6 Corazones");
        baraja.add("7 Corazones");
        baraja.add("8 Corazones");
        baraja.add("9 Corazones");
        baraja.add("10 Corazones");
        baraja.add("11 Corazones");
        baraja.add("12 Corazones");
        baraja.add("1 Diamante");
        baraja.add("2 Diamantes");
        baraja.add("3 Diamantes");
        baraja.add("4 Diamantes");
        baraja.add("5 Diamantes");
        baraja.add("6 Diamantes");
        baraja.add("7 Diamantes");
        baraja.add("8 Diamantes");
        baraja.add("9 Diamantes");
        baraja.add("10 Diamantes");
        baraja.add("11 Diamantes");
        baraja.add("12 Diamantes");
        baraja.add("1 Pica");
        baraja.add("2 Picas");
        baraja.add("3 Picas");
        baraja.add("4 Picas");
        baraja.add("5 Picas");
        baraja.add("6 Picas");
        baraja.add("7 Picas");
        baraja.add("8 Picas");
        baraja.add("9 Picas");
        baraja.add("10 Picas");
        baraja.add("11 Picas");
        baraja.add("12 Picas");
        baraja.add("1 Trebol");
        baraja.add("2 Treboles");
        baraja.add("3 Treboles");
        baraja.add("4 Treboles");
        baraja.add("5 Treboles");
        baraja.add("6 Treboles");
        baraja.add("7 Treboles");
        baraja.add("8 Treboles");
        baraja.add("9 Treboles");
        baraja.add("10 Treboles");
        baraja.add("11 Treboles");
        baraja.add("12 Treboles");


        System.out.println("Baraja ordenada: ");
        for (String i : baraja) {
            System.out.print(" - " + i);
        }
        System.out.println("--------------------------");

        System.out.println("Baraja al revés: ");


        
        Collections.reverse(baraja);
        System.out.println(baraja);

        System.out.println("--------------------------");

        System.out.println("Baraja desordenada: ");

        Collections.shuffle(baraja);
        System.out.println(baraja);
    }

    

    
}

//Crear una lista que contenga como elementos la numeración de cartas de una
//baraja francesa (solo los valores, no figuras). Se deberá cargar el ArrayList (en
//orden), imprimir, imprimir en orden inverso (reverse), desordenar (mezclar) el
//arrayList y volver a imprimir.