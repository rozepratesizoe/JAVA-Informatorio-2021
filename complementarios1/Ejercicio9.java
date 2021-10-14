package complementarios1;

import java.util.Scanner;

public class Ejercicio9 {
    
    public static void main(String[] args){


        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese una palabra o frase: ");
        
        String fraseinput = scan.nextLine();

        System.out.println("Ingrese una letra: ");

        char letrainput = scan.next().charAt(0);
        scan.close();

        char[] frase = fraseinput.toCharArray();
        int contador = 0;
        
        

            for (char i : frase) {
                int valor = (int) i;

                
                if ((char)valor == letrainput){
                    contador = contador + 1;

                }
                

            }
            System.out.println(contador);
        }
    }

