
public class OperadoresUnarios {

    public static void main(String args[]) {

        var a = 3;
        var b = -a;

        System.out.println("b = " + b);
        System.out.println("a = " + a);

        // negacion
        var c = true;
        var d = !c;
        System.out.println("c = " + c);
        System.out.println("d = " + d);

        //increment
        //1. preincremento (simbolo antes de la variable)
        var e = 3;
        var f = ++e; // primero incrementa la variable y despues se usa su valor

        System.out.println("e = " + e);
        System.out.println("f = " + f);

        //2. postincemento (simbolo  despues de la variable)
        var g = 5;
        var h = g++;// primero se utiliza el valor y despues se incrementa
        System.out.println("g = " + g);
        System.out.println("h = " + h);
        
        //decremento
        //1. precremento;
        
        var i = 2;
        var j = --i;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        
        //2. postdecremento
        
        var k = 2;
        var l = k--;
        System.out.println("k = " + k);
        System.out.println("l = " + l);

    }

}
