/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvanced.Lunes;

/**
 *
 * @author CC-05
 */
public class Ejercicios {  
    public static void main(String[] args) 
        {
             Fibonacci(15);
             System.out.println(EsPrimo(13));
             System.out.println(Factorial(4));
             Burbuja();
        }   
    
     public static void Fibonacci(int num)
     {
          int a, b, aux;
             a = 0;
             b = 1;
             System.out.println(a);
             System.out.println(b);
             for (int i = 1; i <= num; i++)
             {             
                 aux = a + b;
                 System.out.println(aux);
                 a = b;
                 b = aux;
             }  
     }
     
     public static boolean EsPrimo(int num)
     {
         for(int i = 2; i < num; i++){
            if(num%i == 0)
                return false;
                 break;
         }     
         return true;
     }
     
     public static int Factorial (int num)
     {
         int result = num;
         for(int i = num; i > 1; i--)
         {
           result *= i-1 ;
         }
         return result;
     }
     
     public static void Burbuja ()
     {
         int arrglo[] = {18, 9, 33, 4, 84, 92, 22, 14, 53, 1, 3};
         int aux;
         int n = arrglo.length;
         
         for(int i = 1; i < n; i++)
         {
             for(int j = 0; j < n-1; j++)
             {
                 if(arrglo[j] > arrglo[j+1])
                 {
                    aux = arrglo[j];
                    arrglo[j] = arrglo[j+1];
                    arrglo[j+1] = aux;  
                  
                 }
             }
         }
         
         for (int i = 0; i < n; i++)
         {
              System.out.println(arrglo[i]);
         }
         
     }
}

