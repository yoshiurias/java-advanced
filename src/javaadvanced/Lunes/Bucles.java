/*
    Un lazo }, es usado para iterar una parte del programa muchas veces.

    Hay 3 tipos de lazos en Java
    Simple for
    For-each
    Labeled For
 */
package javaadvanced.Lunes;

public class Bucles 
{  public static void main(String[] args) 
        {
    
        //simple For
           /*
            for(initialization; condition; inc/dec)
            {acciones}
            */
        for(int i = 1; i<= 10; i++)
        {
           System.out.println("Iterando el elemento " + i);
        }             
        
        //Foreach
        /*
            Recorrer un arreglo o coleccion en java
            for(type var: array)
            {lo que sea}
        */
        int arreglo[] = {12,23,34,45,56,67};
        
        for(int a: arreglo){
            System.out.println(a);
        }
        
        //For Labeled
        aa:
        for(int i = 1; i<=3;i++){
            bb:
            for(int j = 1; j<= 3; j++){
                if(i==2 && j==2){
                   break aa;
                }
                System.out.println(i + " " + j);
                }
            }
        }
}
    
