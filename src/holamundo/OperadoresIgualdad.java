
public class OperadoresIgualdad {

    public static void main(String args[]) {

        var a = 3;
        var b = 2;
        
       var c = (a == b);
        System.out.println("c = " + c);
        
        
       var d = a != b;
        System.out.println("d = " + d);
        
        var cadena = "Hola";
        var cadena2 = "Adios";
        
        var e = cadena == cadena2; //compara erferencias de objetos.
        
        System.out.println("e = " + e);
        

    }
}
