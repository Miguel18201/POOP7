/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transporte;

/**
 *
 * @author LENOVO
 */
public class Helicoptero extends Aereos {
    private String modelo;

    public Helicoptero() {
    }

    public Helicoptero(String modelo, int altura, String nombre, int capacidadPasajeros, String color) {
        super(altura, nombre, capacidadPasajeros, color);
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public void mensaje(){
        System.out.println("piloto a base, repito piloto a base, pedimos un informe sobre el estado del clima");
    }
    public void descripcion(){
        System.out.println("Como pueden observar estamos volando sobre la selva mas grande del mundo, donde cabe mencionar tiene una fauna variada");
    }
    public void estraccion(){
        System.out.println("Lanza una soga para recuperar a una persona*");
    }
    
    @Override
    public String toString() {
        return "Helicoptero{" + "modelo=" + modelo + " " + super.toString() + '}';
    }
    
    
}
