
package javaadvanced.Martes;

//Relacion entre clase: Agregacion HAS - A
public class Usuario {
    int id;
    String nombre;
    Direccion direccion;
    
    Usuario(int id, String nombre, Direccion direccion){
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
    }
    
    void show(){
        System.out.println(id + " " + nombre);
        System.out.println(direccion.ciudad + " \n " + direccion.estado + " \n" + direccion.pais);
    }
    
    public static void main(String[] args) {
        Direccion d = new Direccion("Culiacan", "Sinaloa", "Mexico");
        Direccion d2 = new Direccion("Leon", "Guanajuato", "Mexico");
        
        Usuario u = new Usuario(111, "Yoshi", d);
        Usuario u2 = new Usuario(112, "Fulanito", d2);
        
        u.show();
        u2.show();
        
    }
}

class Direccion {
    String ciudad, estado, pais;
    
    Direccion(){
        
    }
    
    Direccion(String ciudad, String estado, String pais){
        this.ciudad = ciudad;
        this.estado = estado;
        this.pais = pais;
        
    }
}