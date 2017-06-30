/*
Networking es un concepto de conectividad entre dos dispositivos
o más juntos, que comparten recursos-

Programacion de sockets proporciona la facilidad de compartir 
datos entre diferentes dispositivos.

Ventajas del Networking en JAva:
Conpartir recursos.
Centralizar la gestion del software

Conceptos clave:
   Direccion Ip: Numero dinamico asignado a un nodo de una red, 
compuesto por octetos de que van del 0 al 255.
Es una direccion logica que puede ser cambiada.

protocolo: Conjunto de reglas para establecer la comunicacion: 
Ej: FTP, TCP, Telnet, SMTP, POP

Puerto: Esta asociado a la direccion Ip para la comunicacion
entre aplicaciones.

MAC: (;edia Acces Point): Identificador unico del NIC(Network
Interface Controller)
Un nodo de una red puede tener multiples Nic pero solo una MAC
Direccion fisica, estatica.

Oriented Connection Protocol: 
   Es un protocolo de tipo TCP, TCP/IP, confiable pero lento.
El acuse de recibo es enviado por el receptor.

Connection Less Protocol:
    El receptor no envia elacuxe de recibo.
Es rapido, sin embargo no es confiable, pueden o no llegar los
paquetes: Ej: UDP

Socket: Punto final en una conexion bidirecional

La programacion de sockets se utiliza para la comunicacion entre aplicaciones 
que se ejecutan en diferentes JREs. Java Runtime Enviroment

LA programacion de JavaSocket puede estar bajo ambos protocolos
(OCP y OCL)
Las clases Java Socket y ServerSocket se utilizan para la programacion
orientada a la conexion.

Las clasas DatagamSocket y DatagramPacket se utilizan para la programacion
de sockets sin conexion.

El cliente en la programacion necesita saber:
IP Address del Server.
Port Number
Socket class
El socket es un punto final para las comunicaciones entre dispositivos
   Socket Cñass
   MEtodos
     public InputStream getInputStream() 
       regresa el is adjunto con el socket
     public OutputStream getOutputStream()
       regresa el os adjunto al socket
     public synchronized void close()
       cierra el socket

ServerSocket
Metodos
public socket accept()
Establece la conexion entrante
public synchronized void close()
Cierra la conexion del servidos.

    ++

*/
package javaadvanced.Viernes;


public class NT {
    
}
