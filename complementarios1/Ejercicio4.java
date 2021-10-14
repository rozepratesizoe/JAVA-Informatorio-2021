package complementarios1;

import java.util.Scanner;

public class Ejercicio4 {
    

    public static void main(String[] args){

        System.out.println("Ingrese un numero: ");

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.close();

        int fact = 1;

        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println("El factorial de " + num + " es: " + fact);

    }
}
    

