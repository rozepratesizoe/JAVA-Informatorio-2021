package complementarios1;


import java.util.Scanner;

public class Ejercicio7 {
    
    public static void main(String[] args){

        System.out.println("Ingrese una palabra: ");

        Scanner scan = new Scanner(System.in);
        String palabra = scan.nextLine();
       
        scan.close();


        char[] letra = palabra.toCharArray();

        for (char i : letra) {
            int valor = (int) i;

            if (valor >= 97 && valor < 122){
                valor = valor - 32;
                System.out.println((char) valor);
            } else{
                System.out.println((char) valor);
            }
        }
    }


}

