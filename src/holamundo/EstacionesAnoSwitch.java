/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package holamundo;

/**
 *
 * @author itzel
 */
public class EstacionesAnoSwitch {
    public static void main (String args[]){
    
        var mes = 6;
        var estacion = "Estacion desconocida";
        
        switch(mes){
        
            case 1: case 2: case 12:
                estacion = "invierno";
                break;
                
            case 3: case 4: case 5:
                estacion = "primavera";
                break;
                
            case 6: case 7: case 8:
                estacion = "verano";
                break;
                
            case 9: case 10: case 11:
                estacion = "otono";
                break;
           
        }
        
        System.out.println("estacion = " + estacion);
    }
}
