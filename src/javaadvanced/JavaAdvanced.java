
package javaadvanced;


public class JavaAdvanced {

    static int edad = 12;
    
    public static void main(String args) 
    {
        /*
        if(edad > 18){
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }*/
        String nombre;
        nombre = "Walter";
        if(!nombre.isEmpty()){
        System.out.println(nombre);
        } else {
            System.out.print("Esta vacío");
        }
    }
    
    public static void main(String[] args) 
    {
       int calif = 65;
       
       if(calif >=70 && calif <=75){
       System.out.println("Panzó");
       }
       else if(calif >=75 && calif <=85)
       {
       System.out.println("Panzó");
       }
    }
    
}
