
package javaadvanced.Martes;

/**
Firma o signatura de un metodo.
Es lo que permite distinguir sin ambiguedad a los metodos tanto 
* en ladeclaracion como en la invocacion (Emision de mensaje) y
* contiene 3 elementos:
* El valor de retorno(tipo) : double
* Nombre del metodo: : pow
* Numero, tipo y orden de los parametros: Math.pow(x,2) Math.pow(2,x)
* 
* En la herencia ademas de producir una clase nueva basada en una antigua
* añadiendo caracteristicas adicionales (especializacion); puedes 
* extender el comportamiento existente de la superclase.
* 
* Si un metodo se define en la subclase de modo que el nombre, el tipo de retorno y su lista
* de parametros coinciden exactamente con algun metodo de la clase ancestro
* , entonces ese nuevo metodo decimos que redefine el comportamiento del
* antiguo.
* 
* Los metodos con el mismo nombre, pero diferente lista de parametros dentro de la
* misma clase se considera simplemente sobrecargados.
* Esto provoca que el compilador utilice los argumentos proporcionados en
* un mensaje para determinar cual metodo ha de llamar
* 
* To Overload<- sobrecargar
* To Override<- redefinir(sobremontar)
* 
* Override: Metodo con la misma signatura ern distintas clases ( de una jerarquia
* de herencias)
* 
* Overload: Metodo con el mismo nombre que la clase antigua y distinta signatura.
* 
* Reglas para redefinir metodos
* 1.- El tipo de retorno del metodo redefinido debe ser identico al del metodo 
* que redefine.
* 2.- Un metodo no definido no puede ser menos accesible que un metodo al que
* redefine.
* superclase es publida, el redefinido no puede ser protected.
* 3.- Un metodo redefinido nop uede lanzar excepciones diferentes al metodo que
* redefine.
* 
* Diferencias entre sobrecarga y redefinicion
* 1.- La sobrecarga(overload) puede codificarse en una sola clase y la 
* redifinicion(override) requiere 2 o mas clases.
* 2.- Los metodos sobrecargados tienen distinta signatura.
* 3.- Los metodos redefinidos tienen la misma signatura.
* 
* 
 */
//Sobrecarga
public class Adder {
    
    //1.-Cambiando el numero de argumentos
    static int add(int a, int b) {
        return a + b;
    }
    
    static int add(int a, int b, int c){
        return a + b + c;
    }
    
    //2.- Cambian do el tipo de dato
    static int suma(int c, int d) {
        return c+d;
    }
    static double suma(double c, double d) {
    return c+d;
    }
    
    
    public static void main(String[] args) {
        System.out.println(Adder.add(111,222));
        System.out.println(Adder.add(111,222,333));
        
        System.out.println(Adder.suma(111.5,222));
        System.out.println(Adder.suma(111,222.2));
    }
            
}
