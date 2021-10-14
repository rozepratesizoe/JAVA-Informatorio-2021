package complementarios1;

import java.util.Scanner;

public class Ejercicio8 {
    
    public static void main(String[] args){
        System.out.println("Ingrese Nombre y Apellido: ");
        Scanner scan = new Scanner(System.in);
        String nombre = scan.nextLine();
        

        System.out.println("Ingrse Edad: ");
        Scanner ingreseedad = new Scanner(System.in);
        String edad = ingreseedad.nextLine();
        

        System.out.println("Ingrese Dirección: ");
        Scanner ingresedireccion = new Scanner(System.in);
        String direccion = ingresedireccion.nextLine();
        

        System.out.println("Ingrese la Ciudad: ");
        Scanner ingreseciudad = new Scanner(System.in);
        String ciudad = ingreseciudad.nextLine();


        scan.close();
        ingreseedad.close();
        ingreseciudad.close();
        ingreseciudad.close();
        

        System.out.println(ciudad +" - "+ direccion +" - "+ edad +" - "+ nombre);
        
        

    }
}
