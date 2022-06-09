package palabrathis;

public class PalabraThis {

    public static void main(String[] args) {

        Persona persona = new Persona("itzel", "alonso");

        System.out.println("nombre " + persona.nombre);
        System.out.println("apellido " + persona.apellido);

    }

}

class Persona {

    String nombre;
    String apellido;

    Persona(String nombre, String apellido) {
        //super(); // se encarga de reservar el espacio en memoria llamada implicita al 
        //constructor de la clase padre OBJETC
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("objeto persona this: " + this);
        new Imprimir().imprimir(this);
    } 
}

class Imprimir {

    public Imprimir() {
        super(); // el constructor de la clase object padre para reservar memoria.
    }

    public void imprimir(Persona persona) {

        System.out.println("persona desde imprimir: " + persona);

        System.out.println("impresion del objeto actual this :" + this);
    }
}
