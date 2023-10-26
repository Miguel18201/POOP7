/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transporte;

/**
 *
 * @author LENOVO
 */
public class MediosDeTransporte {
    private String nombre, color;
    private int capacidadPasajeros;
    /**
     * Constructor vacio de la clase
     */
    public MediosDeTransporte() {
    }
    /**
     * Constructor lleno de la clase MediosDeTransporte
     * @param nombre Representa el nombre del medio de transporte
     * @param capacidadPasajeros La cantidad maxima de pasajeros que pueden abordar 
     * @param color El color del Transporte
     */
    public MediosDeTransporte(String nombre, int capacidadPasajeros, String color) {
        this.nombre = nombre;
        this.capacidadPasajeros = capacidadPasajeros;
        this.color = color;
    }
    /**
     * Metodo getNombre
     * @return regresa el nombre de la persona
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Metodo getCapacidadPasajeros
     * @return la cantidad de pasajeros que puede abarcar el medio de transporte
     */
    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }
    /**
     * Metodo getColor
     * @return el color del transporte
     */
    public String getColor() {
        return color;
    }
    /**
     * Permite modificar el atributo privado nombre
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * Nos indica la cantidad maxima que puede abarcar el transporte
     * @param capacidadPasajeros
     */
    public void setCapacidadPasajeros(int capacidadPasajeros) {
        this.capacidadPasajeros = capacidadPasajeros;
    }
    /**
     * Ingresamos el color del transporte
     * @param color 
     */
    public void setColor(String color) {
        this.color = color;
    }
    //Metodo objetivo
    /**
     * Metodo que sirve para indicar el estado de la capacidad de pasajeros del transporte a traves de un mensaje
     */
    public void Pasajeros(){
        System.out.println("En este momento esta a media capacidad de pasajeros el transporte");
    }
    /**
     * Metodo que nos indica si el transporte esta en movimiento
     */
    public void estado(){
        System.out.println("Esta en movimiento");
    }
    /**
     * Metodo sobre escrito que muestra los valores de los atributos
     * @return regresa en forma de cadena los atributos de la clase de manera ordenada
    */
    @Override
    public String toString() {
        return "MediosDeTransporte{" + "nombre=" + nombre + ", capacidadPasajeros=" + capacidadPasajeros + ", color=" + color + '}';
    }
    
}