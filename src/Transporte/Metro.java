/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transporte;

/**
 *
 * @author LENOVO
 */
public class Metro extends Subterraneo {
    private String Linea;
    private int vagones;
    /**
     * Constructor vacio de la clase metro
     */
    public Metro() {
    }
    /**
     * Constructor lleno de la clase metro
     * @param Linea Simboliza 1 de las 12 lineas del metro que el objeto sigue
     * @param vagones Cantidad de vagones que contiene el metro
     * @param medio Por donde se desplaza el metro
     * @param numRuedas El nuumero de ruedas que tiene
     * @param nombre El nombre del transporte 
     * @param capacidadPasajeros Capacidad maxima de persona que pueden abordar
     * @param color El color del transporte
     */
    public Metro(String Linea, int vagones, String medio, int numRuedas, String nombre, int capacidadPasajeros, String color) {
        super(medio, numRuedas, nombre, capacidadPasajeros, color);
        this.Linea = Linea;
        this.vagones = vagones;
    }
    /**
     * Metodo getLinea
     * @return La linea a la que pertenece el metro
     */
    public String getLinea() {
        return Linea;
    }
    /**
     * Metodo que nos permite ingresar la linea del metro
     * @param Linea 
     */
    public void setLinea(String Linea) {
        this.Linea = Linea;
    }
    /**
     * Metodo getVagones
     * @return La cantidad de vagones que tiene el metro
     */
    public int getVagones() {
        return vagones;
    }
    /**
     * Metodo que nos deja ingresar un valor numero para asignar la cantidad de vagones que tiene el metro
     * @param vagones 
     */
    public void setVagones(int vagones) {
        this.vagones = vagones;
    }
    /**
     * Metodo que nos indica el estado del metro, si se encuentra sin lugar o no
     */
    public void lleno(){
        System.out.println("El metro esta lleno porque es la hora pico");
    }
    public void bajar(){
        System.out.println("Baja en la siguiente estacion?");
    }
    public void vendedor(){
        System.out.println("Pasale, pasale lleve la funda del celular econonomica, resistente y barata llevale llevele");
    }
    /**
     * Metodo sobre escrito que muestra los valores de los atributos 
     * @return Muestra en forma de cadena los atributos de la clase metro y con el metodo super.toString() los atributos de la clase padre
     */
    @Override
    public String toString() {
        return "Metro{" + "Linea=" + Linea + ", vagones=" + vagones + " " + super.toString() +'}';
    }
    
    
}