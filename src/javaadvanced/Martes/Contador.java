
package javaadvanced.Martes;
/*

Restricciones de static:
No puede utilizar miembres no estaticos para referencia.
This y super no pueden ser usadas en un contexto estatico.
*/

public class Contador {
    static int i = 0;

    public Contador() {
        i ++;
        System.out.println(i);
    }
    
    public static void main(String[] args) {
        Contador c1 = new Contador();
        Contador c2 = new Contador();
        Contador c3 = new Contador();
                
    }
}