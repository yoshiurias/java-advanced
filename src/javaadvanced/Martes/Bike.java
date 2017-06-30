
package javaadvanced.Martes;

/**
  Constructor de una clase
  *  Es un conjunto de instrucciones diseñado para inicializar 
  * una instancia de una clase. En su declaración puede aceptar parametros
  * 
  * Bike b = new Bike();
  * Bike() <- Hace referencia al constructor por omisión.
  * 
  * Antes de se ejecución b es nulo; al final de la llaba llamada b es un
  * apuntador a un objeto(referencia ) com espacio reservado en RAM para
  * contener sus valores de atributos y sus apuntadores a metodos.
  * 
  * Porque el construcor no es un metodo?
  * No puedo llamar al constructor usando el operacod de indirección
  * 
  * Carece de un valor de retorno distinto a un apuntador.
  * 
  * No puede ser REDEFINIDO ()
  * No puede ser declarado con un type;
 */
public class Bike {

    /**
     * @return the marca
     */
 
    //Propiedad del  objeto
    private int velocidad;
    private String color;
    private String marca;
    
    //Declaro el constructor implícito
    public Bike(){
    
    }
    
    //Inmutable cuando su valor no cambia durante la ejecucion del programa
    
     public Bike(String color, int velocidad){
     this.color = color;
     this.velocidad = velocidad;
    }
     
    public Bike(String color, String marca, int velocidad){
     this.color = color;
     this.velocidad = velocidad;
     this.marca = marca;
    }

    public int getVelocidad() {
        return velocidad;
    }
    public String getColor() {
        return color;
    }
       public String getMarca() {
        return marca;
    }
}

