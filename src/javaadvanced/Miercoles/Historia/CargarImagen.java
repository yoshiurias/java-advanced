
package javaadvanced.Miercoles.Historia;

import javaadvanced.Miercoles.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;

/**
 * This class demonstrates how to load an Image from an external file
 */
public class CargarImagen extends Component {
          
    BufferedImage img;

    public void paint(Graphics g) {
        g.drawImage(img, 0, 0, null);
    }

    public CargarImagen(String ruta) {
       try {
           img = ImageIO.read(new File(ruta));
       } catch (IOException e) {
       }

    }

    public Dimension getPreferredSize() {
        if (img == null) {
             return new Dimension(100,100);
        } else {
           return new Dimension(img.getWidth(null), img.getHeight(null));
       }
    }

    public void muestra(String ruta) {

        JFrame f = new JFrame("Load Image Sample");
            
        f.addWindowListener(new WindowAdapter(){
                public void windowClosing(WindowEvent e) {
                    System.exit(0);
                }
            });
        
        f.add(new CargarImagen(ruta));
        f.pack();
        f.setVisible(true);
        
        try {
            Thread.sleep(1000);
        }catch (InterruptedException ie) {
            System.out.println(ie);
        }
        f.setVisible(false);
    }
    
   
}