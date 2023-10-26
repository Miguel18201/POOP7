/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transporte;

/**
 *
 * @author LENOVO
 */
public class Terrestres extends MediosDeTransporte {
    private int numRuedas;
    /**
     * Constructor vacio de la clase Terrestres
     */
    public Terrestres() {
    }
    /**
     * Constructor lleno de la clase Terrestres
     * @param numRuedas Representa el numero de llantas con el que cuenta el transporte
     * @param nombre El nombre del transporte
     * @param capacidadPasajeros El numero maximo de personas que puede llevar
     * @param color El color del transporte
     */
    public Terrestres(int numRuedas, String nombre, int capacidadPasajeros, String color) {
        super(nombre, capacidadPasajeros, color);
        this.numRuedas = numRuedas;
    }
    /**
     * Metodo getNumRuedas
     * @return El numero de ruedas del transporte
     */
    public int getNumRuedas() { 
        return numRuedas;
    }
    /**
     * Metodo que nos deja acceder al atributo numRuedas para poder ingresarle el numero de ruedas del transporte
     * @param numRuedas 
     */
    public void setNumRuedas(int numRuedas) {
        this.numRuedas = numRuedas;
    }
    /**
     * Metodo heredado de la clase padre MedioDeTrasporte 
     * @return Como anteriormente se habia indicado nos da la cantidad de pasajeros que tiene el transporte en ese momento
     */
    @Override
    public int getCapacidadPasajeros() {
        return super.getCapacidadPasajeros(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    /**
     * Metodo sobre escrito que muestra los valores de los atributos
     * @return Regresa en forma de mensaje los atributos de la clase y por medio del metodo super.toString() se imprime el mismo mensaje que en la clase base
     */
    
    @Override
    public String toString() {
        return "Terrestres{" + "numRuedas=" + numRuedas + " " + super.toString() + '}';
    }
    
}