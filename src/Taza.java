/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CC-05
 */
public class Taza {

    private String color;
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
  
     public static void main(String[] args) {
         Taza t = new Taza();
         t.setColor("Verde");
     t.show();
    }
     
     public void show() {
     String msg = "";
     
     Arete arete = new Arete();
     arete.setMaterial("plata");
     arete.setPeso(350);
     
     
     Cafe cafe = new Cafe();
     cafe.setEstado("Solido");
     
     if(cafe.getEstado() == "Solido")
     {
         arete.setMojado(false);
     } else {
         arete.setMojado(true);
     }
     
     if(arete.getMojado()){
         msg += "El arete de " + arete.getMaterial() + " está mojado porque el café es " + cafe.getEstado();
     } else {
         msg += "El arete de " + arete.getMaterial() + " no está mojado porque el café es " + cafe.getEstado();
     }
     
            System.out.println(msg);
     
     }
}

class Arete {

    /**
     * @return the mojado
     */

    private String material;
    private int peso;
    private boolean mojado;
    
    public String getMaterial() {
        return material;
    }
    
    public void setMaterial(String material) {
        this.material = material;
    }
    
    public int getPeso() {
        return peso;
    }
    
    public void setPeso(int peso) {
        this.peso = peso;
    }
    
        public boolean getMojado() {
        return mojado;
    }
    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }
}

class Cafe{
    private String Estado;
    
    public String getEstado() {
        return Estado;
    }
    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

}


