/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 *
 * @author LENOVO
 */
public class AnimalTerrestre extends Animal{
    private int numeroPatas;

    public AnimalTerrestre() {
    }

    public AnimalTerrestre(int numeroPatas, String nombre, String lugarOrigen, String color) {
        super(nombre, lugarOrigen, color);
        this.numeroPatas = numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }
    public void correr(){
        System.out.println("Estoy corriendo");
    }

    @Override
    public void comer() {
        super.comer(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String toString() {
        return "AnimalTerrestre{" + "numeroPatas=" + numeroPatas + " " + super.toString() +'}';
    }
    
    
}