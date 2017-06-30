package javaadvanced.Miercoles.Historia;


public class Villano implements Ataques{
    int Vida = 100;
    String Nombre;
    
  
    public void Volar() {
        try{
        Thread.sleep(500);
        System.out.println("Mama estoy volando...");
        String ruta = "C:\\Users\\CC-05\\Desktop\\img\\vuela2.jpg";
            CargarImagen c = new CargarImagen(ruta);
            c.muestra(ruta);
        } catch (InterruptedException ie) {
            System.out.println(ie);
        }
    }

    public int Fuerza() {
         try {
            Thread.sleep(1000);
            System.out.println("Villano: Te pego");
            String ruta = "C:\\Users\\CC-05\\Desktop\\img\\villanogolpejpg.jpg";
            CargarImagen c = new CargarImagen(ruta);
            c.muestra(ruta);
            return 12;
        } catch (InterruptedException ie) {
            System.out.println(ie);
            return 0;
        }
    }

    public void Velocidad() {
         try {
            Thread.sleep(1000);
            System.out.println("Villano: Soy rapido");
            String ruta = "C:\\Users\\CC-05\\Desktop\\img\\velocidad.jpg";
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

    
    public void Pierde() {
         try {
            Thread.sleep(1000);
            System.out.println("Villano: Rayos");
            String ruta = "C:\\Users\\CC-05\\Desktop\\img\\muerte.jpg";
            CargarImagen c = new CargarImagen(ruta);
            c.muestra(ruta);
          
        } catch (InterruptedException ie) {
            System.out.println(ie);
         
        }
    }
}
