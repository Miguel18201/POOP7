/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transporte;

/**
 *
 * @author LENOVO
 */
public class Subterraneo extends Terrestres {
    private String medio;
    /**
     * Constructor vacio de la clase Terrestres
     */
    public Subterraneo() {
    }
    /**
     * Constructor lleno de la clase Subterraneo
     * @param medio Nos indica en que plataforma o con ayuda de que se traslada el transporte, por ejemplo vias ferreas
     * @param numRuedas Representa el numero de llantas con el que cuenta el transporte
     * @param nombre El nombre del transporte
     * @param capacidadPasajeros El numero maximo de personas que puede llevar
     * @param color El color del transporte
     */
    public Subterraneo(String medio, int numRuedas, String nombre, int capacidadPasajeros, String color) {
        super(numRuedas, nombre, capacidadPasajeros, color);
        this.medio = medio;
    }
    /**
     * Metodo getMedio
     * @return El mensaje que indica en que plataforma o con ayuda de que se traslada el transporte
     */
    public String getMedio() {
        return medio;
    }
    /**
     * Metodo en el que se ingresa la plataforma o con ayuda de que objeto se traslada el transporte
     * @param medio 
     */
    public void setMedio(String medio) {
        this.medio = medio;
    }
    /**
     * Metodo que imprime en forma de mensaje la estacion en la que el usuario se encuentra en ese instante 
     */
    public void viaje(){
        System.out.println("El viaje inicia desde la estacion Central");
    }
    /**
     * Metodo sobre escrito que muestra los valores de los atributos
     * @return Regresa en forma de mensaje los atributos de la clase y por medio del metodo super.toString() se imprime el mismo mensaje que en la clase base 
     */
    @Override
    public String toString() {
        return "Subterraneo{" + "medio=" + medio + " " + super.toString()+ '}';
    }
    
}
