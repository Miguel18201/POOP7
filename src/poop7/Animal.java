
package poop7;

/**
 *
 * @author Sanchez Ramirez Miguel Angel
 */
public class Animal extends Object {
     private String nombre, lugarOrigen,color;

    public Animal() {
    }

    public Animal(String nombre, String lugarOrigen, String color) {
        this.nombre = nombre;
        this.lugarOrigen = lugarOrigen;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public String getLugarOrigen() {
        return lugarOrigen;
    }

    public String getColor() {
        return color;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setLugarOrigen(String lugarOrigen) {
        this.lugarOrigen = lugarOrigen;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void hacersonido(String sonido){
        System.out.println("Sonido:"+sonido);
    }
    public void comer(){
        System.out.println("Estoy comiendo....");
    }

    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + ", lugarOrigen=" + lugarOrigen + ", color=" + color + '}';
    }
    
    
}
