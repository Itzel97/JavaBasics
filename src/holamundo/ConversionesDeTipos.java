
import java.util.Scanner;

public class ConversionesDeTipos {
    
    public static void main(String args[]) {

        //Convetir un tipo string a un tipo int.
        var edad = Integer.parseInt("20");
        //var edad = "20";
        System.out.println("edad = " + (edad + 1));

        // Convertir un tipo string a un double
        var valorPI = Double.parseDouble("3.1416");
        System.out.println("valorPI = " + valorPI);

        // Pedir un valor
        var consola = new Scanner(System.in);
//        System.out.println("Poporciona tu edad: ");
//        edad = Integer.parseInt(consola.nextLine());
//        System.out.println("Tu edad es de  = " + edad);

        //Convertir un Int a string
        var edadTexto = String.valueOf(10);
        System.out.println("edadTexto = " + edadTexto);
        
        var caracter = "hola".charAt(1);
        System.out.println("caracter = " + caracter);
        
        System.out.println("Proporciona un caracter: ");
        caracter = consola.nextLine().charAt(0);
        System.out.println("caracter = " + caracter);
        
    }
}
