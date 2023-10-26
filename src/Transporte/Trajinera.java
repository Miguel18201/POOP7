/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transporte;

/**
 *
 * @author LENOVO
 */
public class Trajinera extends Acuaticos {
    private int velocidad;

    public Trajinera() {
    }

    public Trajinera(int velocidad, String propulsion, String nombre, int capacidadPasajeros, String color) {
        super(propulsion, nombre, capacidadPasajeros, color);
        this.velocidad = velocidad;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    
    public void mariachi(){
        System.out.println("Que cancion desea joven?????");
        System.out.println("Amor eterno");
    }
    
    public void tomar(){
        System.out.println("Toma un shot de tequila*");
    }
    
    public void comer(){
        System.out.println("Se come un sandwich*");
    }
    @Override
    public String toString() {
        return "Trajinera{" + "velocidad=" + velocidad + "km/h " + " " + super.toString() +'}';
    }
}
