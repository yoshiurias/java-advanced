
package javaadvanced.Jueves.io;

import java.io.FileOutputStream;
import java.io.IOException;

/*
Java I/O
Entrada y Salida
Se utilizan para procesar la entrada y salida.
En java se utiliza el concepto Stream(flujo)
para hacer que las operaciones de E/S sean rapidas.

El paqute java.io contiene todas las clases necesarias para realizar
las operaciones de entrada y salida.

Podemos realizar el manejo de archivos a traves de JAVA I/O Api

Stream
Es un flujo de datos que esta compuesto por bytes. Se llama stream 
porque es como un flujo de agua que sigue corriendo

En java existen 3 streams que se crean para nuestro uso automaticamente.

System.out : flujo de salida estandar.
System.in: flujo de entrada estandar
System.err: Flujo de errores estandar

System.out.print("Error");
System.err.print("Error");

OutputStream vs InpuStream
Input: Lee
Output: Escribee

*/
public class IOTest {
    public static void main(String[] args) {
        try{
           FileOutputStream fos = new FileOutputStream("C:\\hola.txt"); 
           
           fos.write(63);
           fos.close();
        }catch(IOException ioe){
            System.out.println(ioe);
        }
    }
}
