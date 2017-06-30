
package javaadvanced.Martes;
/*
Es una variable de autoreferencia.
This tiene 6 usos en java.
This, se usa para referir a la variable de la instancia de la clase actual.
This, para invocar al constructor de una clase.
This, se puede pasar como argumento en la llamada al constructor.
This se puede utilizar para devolver la instancia de la clase actrual del metodo
This puede pasar como argumento en la llamada al metodo.
This() para invocar al constructor de una clase actual-
*/

public class Student {
    int matricula;
    String nombre;
    String universidad = "Tec Guasave";
    
    //Caso 6 
    public Student() {
        
    }
    
    Student getStudent () {
        return this;
    }
    
    void msg () {
        System.out.println("Soy un mensaje");
    }
    
    //Caso 5 This
    PruebaEstudiante obj;
    
    public Student(PruebaEstudiante obj){
        this.obj = obj;
    }
    
    void s () {
        System.out.println(obj.dato);
    }
            
//    public Student (){
//        System.out.println("Soy el constructor default");
//    }
    
    //This constructor
     public Student(int matricula, String nombre, String universidad, int a){
       // this();
        this(matricula, nombre, universidad);
        System.out.println(matricula + nombre + universidad);
    }
    
    public Student(int matricula, String nombre, String universidad) {
        //This caso 1;
        this.matricula = matricula;
        this.nombre = nombre;
        this.universidad = universidad;
    }
    
    void display(){
        
        String msg = "La matrícula " + matricula;
        msg+="\n El nombre es: " + nombre;
        msg+="\n La universidad es: " + universidad;
        System.out.println(msg);
    }
    
    void mensaje (){
        //This caso 2
        System.out.println("Soy un mensajito");
        this.display();
    }
}
  
  
    

