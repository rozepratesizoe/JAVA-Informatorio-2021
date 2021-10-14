package complementarios1;

import java.util.Scanner;

public class Ejercicio2 {
    
    public static void main(String[] args){

        System.out.println("Ingrese dos numeros: ");

        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        scan.close();

        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        int division = num1/num2;
        int modulo = num1%num2;


        System.out.println(num1 +" + "+ num2+ " = "+ suma);
        System.out.println(num1 +" - "+ num2+ " = "+ resta);
        System.out.println(num1 +" * "+ num2+ " = "+ multiplicacion);
        System.out.println(num1 +" / "+ num2+ " = "+ division);
        System.out.println(num1 +" % "+ num2+ " = "+ modulo);
        
    }

}
