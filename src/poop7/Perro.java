/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 *
 * @author LENOVO
 */
public class Perro extends AnimalTerrestre {
    private String colorCollar;

    public Perro() {
    }

    public Perro(String colorCollar, int numeroPatas, String nombre, String lugarOrigen, String color) {
        super(numeroPatas, nombre, lugarOrigen, color);
        this.colorCollar = colorCollar;
    }

    
    
    public String getColorCollar() {
        return colorCollar;
    }

    public void setColorCollar(String colorCollar) {
        this.colorCollar = colorCollar;
    }
    
    public void hacerTrucos(){
        System.out.println("Estoy haciendo trucos");
    }

    @Override
    public String toString() {
        return "Perro{" + "colorCollar=" + colorCollar + " " + super.toString()+'}';
    }
}
