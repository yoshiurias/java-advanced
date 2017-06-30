
package javaadvanced.Martes;
/*
   La palabra reservada static es usada para la administracion de memoria principalmente
   Es aplicada a variables, metodos, bloques y clases anidadas.
   La palabra static pertenece a la clase que la instancía

Para variables: se puede utilizar para referir una propiedad
comun eb todos los objetos.
La variable static obtiene memoria solo una vez en el area de la clase 
en el momento que la crea.

Promueve la eficiencia en el rendimiento del programa.
*/

public class Estudiante {
    int matricula;
    String nombre;
    static String universidad = "Tec Guasave";
    
    Estudiante(int m, String n){
    matricula = m;
    nombre = n;
    }
    
    void show() {
    System.out.println(matricula + " " + nombre + " " + universidad);
    }
    
    public static void main(String[] args) {
        Estudiante s1 = new Estudiante(111, "Yoshi");
        Estudiante s2 = new Estudiante(112, "Pedrito");
        
        s1.show();
        s2.show();
    }
}
