
public class MountainBike {
        private int velocidad;
    private String color;
    
    protected int getVelocidad() {
        return velocidad;
    }

    protected boolean setVelocidad(int velocidad) {
        if(velocidad > 0) {
        this.velocidad = velocidad;
        return true;
        } else {
        return false;
        }
    }

    protected String getColor() {
        return color;
    }
    
    protected boolean setColor(String color) {
          if(!color.isEmpty()) {
        this.color = color;
        return true;
        } else {
        return false;
        }
    }
}

