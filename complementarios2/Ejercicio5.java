package complementarios2;

import java.util.ArrayList;
import java.util.List;


public class Ejercicio5 {

    public static void main(String[] args){
        
        Integer[] horasTrabajadas = {3, 5, 6, 4, 8};
        Integer[] valorHora = {230, 520, 150, 370, 260};
        List<Integer> total = new ArrayList<>();


        Integer sueldoSemana = 0;

        for (Integer i = 0; i < valorHora.length; i++) {
            
            Integer pagoDia = horasTrabajadas[i] * valorHora[i];
            total.add(pagoDia);
            
            sueldoSemana +=  pagoDia;


        }

        System.out.println(total);
        System.out.println("El sueldo semanal es: $" + sueldoSemana);
        

    }
    
}


//Dados 2 ArrayList que contienen horas-trabajadas (array1) y
//valor-por-hora(array2) del resumen de carga de horas semanal de un
//empleado. Se debe generar otra lista que contenga los totales y luego
//imprimir el total final a cobrar
//