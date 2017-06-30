
package javaadvanced.Viernes.socketTres;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

//Se inicia primero el recibidor
public class DReceiver {
    public static void main(String[] args) throws Exception{
                DatagramSocket ds = new DatagramSocket(3000);
                byte[] b = new byte[1024];
                
                DatagramPacket dp = new DatagramPacket(b, 1024);
                
                ds.receive(dp);
                
                String str = new String(dp.getData(),0,dp.getLength());
                System.out.println(str);
                
                ds.close();
                

    }
}
