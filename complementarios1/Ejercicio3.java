package complementarios1;

import java.util.Scanner;

public class Ejercicio3 {
    
    public static void main(String[] args){
        System.out.println("Ingrese un numero: ");

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.close();

        
        int i = 1;
        int j = 1;

        
        for (i = 1; i <= num; i++) {
            for (j = 1; j <= i; j++) {
            System.out.print(j);   
            }

            System.out.println();
            
        }
}
}
