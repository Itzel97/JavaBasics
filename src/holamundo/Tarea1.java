
import java.util.Scanner;

public class Tarea1 {

    public static void main(String args[]) {

        var nombre = "";
        var id = 0;
        var precio = 0.0;
        var envioGratuito = false;

        var consola = new Scanner(System.in);
        System.out.println("Proporciona el nombre: ");
        nombre = consola.nextLine();
        System.out.println("Proporciona el id: ");
        id = Integer.parseInt(consola.nextLine());
        System.out.println("Proporciona el precio: ");
        precio = Double.parseDouble(consola.nextLine());
        System.out.println("Proporciona el envio gratuito: ");
        envioGratuito = Boolean.parseBoolean(consola.nextLine());

        System.out.println("*************************** ");
        System.out.println("Proporciona el nombre: " + nombre);
        System.out.println("Proporciona el id: " + id);
        System.out.println("Proporciona el precio: " + precio);
        System.out.println("Proporciona el envio gratuito: " + envioGratuito);

    }
}
