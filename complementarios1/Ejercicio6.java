package complementarios1;

import java.util.Scanner;

public class Ejercicio6 {
    

    public static void main(String[] args){

    
        System.out.println("Ingrese dos numeros: ");

        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        scan.close();

        int potencia = 1;

        for(int i = 1; i <= num2; i++){
            potencia = potencia * num1;
        }
        System.out.print(num1 +" elevado a " + num2 +" = "+ potencia);
        
}
}
