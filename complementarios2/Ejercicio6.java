package complementarios2;

import java.util.HashSet;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;


public class Ejercicio6 {
    
    public static void main(String[] args){
        
        Map<Integer, Integer> diccionarioEmpleados = new HashMap<>();

        Set<Empleados> listaEmpleados = new HashSet<>();

        listaEmpleados.add(new Empleados("JoseCarrera", 12345678, 7, 360));
        listaEmpleados.add(new Empleados("MariaJuarez", 87654321, 8, 420));
        listaEmpleados.add(new Empleados("MarioRomero", 65432198, 9, 430));
        listaEmpleados.add(new Empleados("AndreaPerez", 65478932, 7, 380));

        for (Empleados empleados : listaEmpleados) {
            
            Integer sueldoCalculado = empleados.getHorasTrabajadas() * empleados.getValorPorHora();

            diccionarioEmpleados.put(empleados.getDni(), sueldoCalculado);

        }

        
        System.out.println(diccionarioEmpleados);


    }
}

class Empleados {

    private String nombreYapellido;
    private Integer dni;
    private Integer horasTrabajadas;
    private Integer valorPorHora;

    public Empleados (String nombreYapellido, Integer dni, Integer horasTrabajadas, Integer valorPorHora){

        this.nombreYapellido = nombreYapellido;
        this.dni = dni;
        this.horasTrabajadas = horasTrabajadas;
        this.valorPorHora = valorPorHora;
    }

    public String getNombreYapellido() {
        return this.nombreYapellido;
    }

    public Integer getDni() {
        return this.dni;
    }

    public Integer getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public Integer getValorPorHora() {
        return this.valorPorHora;
    }
}
    
    



//Se dispone de una lista de Empleados, de cada empleado se conoce:
//○ Nombre y Apellido
//○ DNI
//○ horasTrabajadas
//○ valorPorHora
//Todos los empleados están cargados en un Set (HashSet), se desea calcular el
//sueldo (horasTrabajadas x valorPorHora) de toda esa lista para luego
//almacenar en un Map (o Diccionario) donde la clave (key) es el dni y el valor
//(value) es el sueldo calculado.