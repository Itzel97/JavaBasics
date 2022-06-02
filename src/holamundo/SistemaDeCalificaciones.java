/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package holamundo;

import java.util.Scanner;

public class SistemaDeCalificaciones {

    public static void main(String args[]) {
        var sc = new Scanner(System.in);

        var calificacion = 0;
        var resultado = "Valor Desconocido";

        System.out.println("Poporciona un valor entre 0 y 10: ");
        calificacion = Integer.parseInt(sc.nextLine());

        if (calificacion >= 9 && calificacion <= 10) {

            resultado = "A";

        } else if ((calificacion < 9 && calificacion >= 8)) {

            resultado = "B";

        } else if (calificacion < 8 && calificacion >= 7) {

            resultado = "C";

        } else if (calificacion < 7 && calificacion >= 6) {

            resultado = "D";

        } else if (calificacion < 6 && calificacion >= 0) {

            resultado = "F";

        }

        System.out.println(resultado);

    }

}
