
package holamundo;

import java.util.Scanner;

public class Tarea2PerimetroRectangulo {

    public static void main(String args[]) {
        var i = new Scanner(System.in);
        int alto;
        int ancho;
        System.out.println("Proporciona el alto del rectangulo: ");
        alto = Integer.parseInt(i.nextLine());
        System.out.println("Proporciona el ancho del rectangulo: ");
        ancho = Integer.parseInt(i.nextLine());

        var area = alto * ancho;
        var perimetro = (alto + ancho) * 2;

        System.out.println("Area: " + area);
        System.out.println("Perimetro: " + perimetro);

    }
}
