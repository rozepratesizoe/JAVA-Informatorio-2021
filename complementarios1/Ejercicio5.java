package complementarios1;

import java.util.Scanner;

public class Ejercicio5 {
    
    public static void main(String[] args){
        System.out.println("Ingrese dos numeros: ");

        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        scan.close();

        
        int multiplicacion= 0;
        
        

        for(int i = 1; i <= num2; i++){
            multiplicacion += num1;

           
        }
        System.out.println(num1 + " x " + num2 + " = " + multiplicacion);
        
    }

    
}
