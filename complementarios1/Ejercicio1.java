package complementarios1;

import java.util.Scanner;

public class Ejercicio1 {
    
    public static void main(String[] args){

        System.out.println("Ingrese el nombre de usuario: ");

        Scanner scan = new Scanner(System.in);
        String nombre = scan.nextLine();
        scan.close();

        System.out.println("HOLA! " + nombre);
    }
    
}
