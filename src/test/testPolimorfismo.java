package test;

import domain.*;

public class testPolimorfismo {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Alfredo", 5000);
        //System.out.println(empleado.obtenerDetalles());
        imprimir(empleado);
        
        Empleado gerente  = new Gerente("Marlene", 10000, "Contabilidad");
        //System.out.println(gerente.obtenerDetalles());
        imprimir(gerente);
    }
    
    public static void imprimir(Empleado empleado){
        System.out.println("Empleado: " + empleado.obtenerDetalles());
    }
    
}
