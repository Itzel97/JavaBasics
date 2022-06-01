/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package holamundo;

import java.util.Scanner;

/**
 *
 * @author itzel.alonso
 */
public class EstacionesDelAnoIfElse {

    public static void main(String args[]) {
        
        var sc = new Scanner(System.in);
        
        System.out.println("Ingresa el mes:");
        var mes = Integer.parseInt(sc.nextLine());

        var estacion = "Estación desconocida";

        if (mes == 1 || mes == 2 || mes == 12) {

            estacion = "invierno";

        } else if (mes == 3 || mes == 4 || mes == 5) {
            
            estacion = "primavera";

        } else if (mes == 6 || mes == 7 || mes == 8 ){
        
            estacion = "verano";
        
        } else if (mes == 9 || mes == 10 || mes == 11){
        
            estacion = "otono";
            
        }
        
        System.out.println("estacion = " + estacion);

    }
}
