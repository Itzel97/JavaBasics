/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package holamundo;

/**
 *
 * @author itzel
 */
public class CicloFor {

    public static void main(String args[]) {
        inicio:

        for (var contador = 0; contador < 3; contador++) {

            if (contador % 2 != 0) {
                continue inicio;//ir a la siguiente iteracion de nuestro ciclo for
            }//ir a la linea de codigo de la etiqueta que se ha agregado.
            System.out.println("contador = " + contador);

        }
        
        // no son convenientes las etiquetas.

//        for (var contador = 0; contador < 3; contador++) {
//
//            if (contador % 2 == 0) {
//                System.out.println("contador2 = " + contador);
//                break inicio; // si encontramos el primer numero par con break rompemos el ciclo
//            }
//
//        }
    }
}
