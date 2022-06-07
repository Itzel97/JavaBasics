package pasoporvalor;

public class PasoPorValor {
// no importa si pasamos un valor de una variable de un metodo a la copia de otro metodo
// siempre al terminar el metodo la variable no estara accesible para el otro.
    public static void main(String[] args) {

        var x = 10;
        System.out.println("x = " + x);

        cambioValor(x);
        
        System.out.println("nuevo valor x = " + x);

    }

    public static void cambioValor(int arg1) {

        System.out.println("arg1 = " + arg1);

        arg1 = 15;
    }

}
