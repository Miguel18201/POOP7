/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transporte;

/**
 *
 * @author LENOVO
 */
public class Barco extends Acuaticos{
     private String apodo;

    public Barco() {
    }

    public Barco(String apodo, String propulsion, String nombre, int capacidadPasajeros, String color) {
        super(propulsion, nombre, capacidadPasajeros, color);
        this.apodo = apodo;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }
    
    public void anclar(){
        System.out.println("Hemos llegado a nuestro destino");
        System.out.println("Tiren el ancla");
    }
    public void espectaculo(){
        System.out.println("Seleccione una carta");
        System.out.println("Es esta tu carta?");
        System.out.println("Le muestra un 2 de corazones*");
    }
    public void bocina(){
        System.out.println("El barco toca la bocina*");
        System.out.println("brooooom brooooom");
    }
    @Override
    public String toString() {
        return "Barco{" + "apodo=" + apodo + " " + super.toString() + '}';
    }
}
