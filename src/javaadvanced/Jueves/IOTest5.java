
package javaadvanced.Jueves;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
La clase Java BufferedOutputStream se utiliza para almacenar 
en un buffer un stream de salida.
Internamente utiliza un buffer para almacenar datos directamente en un stream.
Añade mas eficiencia que escribir de datos de manera directa
en un flujo.
Por lo tanto logar un mejor rendimiento.

Tiene 2 constructores:
-BufferedOutputStream(OutputStream os):
Crea un nuevo flujo de salida almacenando en un buffer. Que se utiliza
para escribir los datos en el stream especializado.
-BufferedOutputStream(OutputStream os, int si):
Crea un nuevo flujo de salida que sera almacenado en buffer
el cual se utiliza para escribir los datos en el stream,
especificando el tamaño del buffer.

Metodos:
void write(int b) Escribe el byte espeficicado en el 
stream de salida almacenado en buffer
void write(byte[ b, int off, int len) Escribe los bytes de la secuencia
de bytes especificada en un arreglo de bytes, comienza con el
desplazamiento dado.

void flush() Borra el flujo de salida almacenado en buffer
Vacia los datos de una secuencia y la envia a otra.
Se necesita si se ha conectdo una secuencia con otra.

*/

public class IOTest5 {
     public static void main(String[] args) {
         try {
            FileOutputStream fos = new FileOutputStream("C:\\magic.txt");
           
             BufferedOutputStream bout = new BufferedOutputStream(fos);
             
             String s = "Hola \n a todos";
             byte[] b = s.getBytes();
             
             bout.write(b);
             bout.flush();
             
             bout.close();
             fos.close();
             
             System.out.println("Listo");
             
             
             
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
