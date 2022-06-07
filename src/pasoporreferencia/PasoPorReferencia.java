package pasoporreferencia;

import clases.Persona;

public class PasoPorReferencia {

    public static void main(String[] args) {

        //Persona persona1 = new Persona();
        Persona persona1=null;
//        persona1.nombre = "itzel";
//        System.out.println("persona1 nombre = " + persona1.nombre);
        persona1 = cambiarValor(persona1);
//        System.out.println("persona1 nombre = " + persona1.nombre);

    }

    // en este caso persona1 y el argumento persona, apuntan hacia el mismo objeto
    //en memoria
    public static Persona cambiarValor(Persona persona) {
        if (persona == null) {
            System.out.println("Valor de persona igual a null");
            return null;
        }

        persona.nombre = "karla";
        return persona;

    }
// cambiaron el valor en la memoria del objeto por lo que no es una variable nativa
// como tal es una referencia y puede leerlo con el cambio.
// ambas referencias apuntan al mismo lugar en memoria.
//    persona1 nombre = itzel
//    persona1 nombre = karla
}
