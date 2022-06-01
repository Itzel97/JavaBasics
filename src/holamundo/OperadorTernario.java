/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package holamundo;

/**
 *
 * @author itzel
 */
public class OperadorTernario {
    public static void main (String args[]){
    
        var resultado = (1 > 2)? "verdadero":"falso" ;
        System.out.println("Resultado = " + resultado);
        
        var numero = 9;
        
        resultado = ((numero % 2) == 0)? "numero par":"numero impar";
        System.out.println("Resultado = " + resultado);
        
    }
}
