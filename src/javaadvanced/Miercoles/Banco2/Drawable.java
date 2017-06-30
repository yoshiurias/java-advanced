
package javaadvanced.Miercoles.Banco2;
/**

 */

public interface Drawable {
    void draw();
}

class SuperHeroe implements Drawable {

    public void draw (){
        System.out.println("Dibujando a Superman");
    }   
}

class SuperVillano implements Drawable {
    public void draw () {
        System.out.println("Dibujando a Lex Luthor");
    }
}

class Historia {
    public static void main(String[] args) {
        Drawable d = new SuperHeroe(), 
                d2 = new SuperVillano();
           
        d.draw();
        d2.draw();
        
    }
}