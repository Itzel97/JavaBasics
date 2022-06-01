/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package holamundo;

/**
 *
 * @author itzel
 */
public class OperadoresCondicionales {
    public static void main (String args []){
    
        var  a = 8;
        var valorMinimo = 0 ;
        var valorMaximo = 10;
        
        var resultado = (a >= 0)&& (a <= 10);
        if(resultado){
            System.out.println("Dentro del rango.");
        }else{
            System.out.println("Fuera de rango");
        }
        
        var vacaciones = false;
        var diaDescanso = false;
        
        if(vacaciones || diaDescanso){
            System.out.println("Puede ir al juego de su hijo.");
        }else{
            System.out.println("El padre esta ocupado");
        }
        
    }
}
