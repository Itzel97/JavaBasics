package pasoporreferencia;

import clases.Persona;

public class PasoPorReferencia {

    public static void main(String[] args) {

        Persona persona1 = new Persona();
        persona1.nombre = "itzel";
        System.out.println("persona1 nombre = " + persona1.nombre);
        cambiarValor(persona1);
        System.out.println("persona1 nombre = " + persona1.nombre);

    }

    // en este caso persona1 y el argumento persona, apuntan hacia el mismo objeto
    //en memoria
    public static void cambiarValor(Persona persona) {
        persona.nombre = "karla";
    }
// cambiaron el valor en la memoria del objeto por lo que no es una variable nativa
// como tal es una referencia y puede leerlo con el cambio.
// ambas referencias apuntan al mismo lugar en memoria.
//    persona1 nombre = itzel
//    persona1 nombre = karla
}
