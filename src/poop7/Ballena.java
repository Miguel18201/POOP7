/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 *
 * @author LENOVO
 */
public class Ballena extends AnimalAcuatico {
    private int largo;

    public Ballena() {
    }

    public Ballena(int largo, int numeroAletas, String nombre, String lugarOrigen, String color) {
        super(numeroAletas, nombre, lugarOrigen, color);
        this.largo = largo;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }
    public void pelearConPinocho(){
        System.out.println("Estoy peleando");
    }

    @Override
    public String toString() {
        return "Ballena{" + "largo=" + largo + " " + super.toString()+'}';
    }
    
}
    

