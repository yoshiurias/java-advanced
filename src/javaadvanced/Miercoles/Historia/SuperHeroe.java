package javaadvanced.Miercoles.Historia;


public class SuperHeroe implements SuperPoderes {
     int Vida = 100;
     String Nombre;
    public void Volar() {
        try{
        Thread.sleep(100);
        System.out.println("Mama estoy volando...");
        String ruta = "C:\\Users\\CC-05\\Desktop\\img\\vuela.jpg";
            CargarImagen c = new CargarImagen(ruta);
            c.muestra(ruta);
        } catch (InterruptedException ie) {
            System.out.println(ie);
        }
    }

    public int Fuerza() {
        try {
            Thread.sleep(1000);
            System.out.println("Heroe: Te pego");
            String ruta = "C:\\Users\\CC-05\\Desktop\\img\\supergolpe.jpg";
            CargarImagen c = new CargarImagen(ruta);
            c.muestra(ruta);
            return 30;
        } catch (InterruptedException ie) {
            System.out.println(ie);
            return 0;
        }
    }

    public void Velocidad() {
         try {
            Thread.sleep(1000);
            System.out.println("Heroe: Soy rapido");
            String ruta = "C:\\Users\\CC-05\\Desktop\\img\\velocidad2.jpg";
            CargarImagen c = new CargarImagen(ruta);
            c.muestra(ruta);
          
        } catch (InterruptedException ie) {
            System.out.println(ie);
         
        }
    }

    public void Invisible() {
        System.out.println("On toy (//_\\)");
    }

    @Override
    public void run() {
      
    }

}
