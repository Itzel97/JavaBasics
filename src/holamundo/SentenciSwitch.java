/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package holamundo;

/**
 *
 * @author itzel
 */
public class SentenciSwitch {

    public static void main(String args[]) {

        var numero = 3;
        var numeroTexto = "Valor desconocido";

        numeroTexto = switch (numero) {
            case 1 -> "Numero uno";
            case 2 -> "Numero dos";
            case 3 -> "Numero tres";
            case 4 -> "Numero cuatro";
            default -> "Caso no enconrado";
        };
        System.out.println("numeroTexto = " + numeroTexto);
    }
}
