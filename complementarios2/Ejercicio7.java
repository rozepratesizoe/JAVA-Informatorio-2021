package complementarios2;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class Ejercicio7 {
    
    

    public static void main(String[] args){

        System.out.println("Ingrese un número: ");

        Scanner scan = new Scanner (System.in);
        Integer numero1 = scan.nextInt();

        System.out.println("Ingrese un número mayor al anterior: ");
        Integer numero2 = scan.nextInt();
        scan.close();

        List<String> secuenciaTotal = new ArrayList<>();

        for (Integer i = numero1; i < numero2; i++) {
            if(numero1%2==0 && numero1%3==0){
                secuenciaTotal.add("FizzBuzz");
            }
            else if(numero1%2==0) {
                secuenciaTotal.add("Fizz");
            }
            else if(numero1%3==0) {
                secuenciaTotal.add("Buzz");
            }
            
            
        }
        System.out.println(secuenciaTotal);
        
    }

}


//Crear una función que dado 2 argumentos (int, siendo el primero menor al
//segundo), nos devuelva un array de Strings. Con la secuencia de números
//enteros de principio a final. Pero si el número es multiplo de 2 colocara el valor
//“Fizz”, si es múltiplo de 3 “Buzz” y si es a la vez múltiplo de ambos colocara
//“FizzBuzz”.
//Observacion: Los 2 argumentos indican con que valor se arranca a calcular y el
//segundo con qué valor debe frenar (no se incluye en el cálculo)
//Ejemplo: (1, 5) ----> calculará valores de 1, 2, 3, 4