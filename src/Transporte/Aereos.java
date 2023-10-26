/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transporte;

/**
 *
 * @author LENOVO
 */
public class Aereos extends MediosDeTransporte {
     private int altura;

    public Aereos() {
    }

    public Aereos(int altura, String nombre, int capacidadPasajeros, String color) {
        super(nombre, capacidadPasajeros, color);
        this.altura = altura;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public void Pasajeros() {
        super.Pasajeros(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String toString() {
        return "Aereos{" + "altura=" + altura + "m " + super.toString() + '}';
    }
    
    
}
