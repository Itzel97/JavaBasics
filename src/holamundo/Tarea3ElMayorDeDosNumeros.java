
package holamundo;

import java.util.Scanner;

public class Tarea3ElMayorDeDosNumeros {
    public static void main (String args[]){
    
        var sc = new Scanner(System.in);
        
        System.out.println("Proporciona el numero1: ");
        int numero1 =Integer.parseInt(sc.nextLine()) ;
        System.out.println("Proporciona el numer2: ");
        int numero2 = Integer.parseInt(sc.nextLine());
        
        var numeroMayor = numero1 > numero2 ? numero1 : numero2;
        
        System.out.println("El numero mayor es = " + numeroMayor);
        
    
    }
}

