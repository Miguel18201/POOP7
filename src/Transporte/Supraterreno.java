/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transporte;

/**
 *
 * @author LENOVO
 */
public class Supraterreno extends Terrestres {
    private String medio;
    /**
     * Constructor vacio de la clase Supraterreno
     */
    public Supraterreno() {
    }
    /**
     * Constructor lleno de la clase Supraterreno
     * @param medio Nos indica en que plataforma o con ayuda de que se traslada el transporte, por ejemplo carretera
     * @param numRuedas Representa el numero de llantas con el que cuenta el transporte
     * @param nombre El nombre del transporte
     * @param capacidadPasajeros El numero maximo de personas que puede llevar
     * @param color El color del transporte
     */
    public Supraterreno(String medio, int numRuedas, String nombre, int capacidadPasajeros, String color) {
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
    /** Metodo en el que se ingresa la plataforma o con ayuda de que objeto se traslada el transporte
    * @param medio 
    */
    public void setMedio(String medio) {
        this.medio = medio;
    }
    /**
     * Metodo que nos muestra que tanto tiempo se ha atrasado el viaje debido al trafico
     */
    public void trafico(){
        System.out.println("El viaje se ha retrasado 20 minutos debido al trafico");
    }
    /**
     * Metodo sobre escrito que muestra los valores de los atributos
     * @return Regresa en forma de mensaje los atributos de la clase y por medio del metodo super.toString() se imprime el mismo mensaje que en la clase base 
     */
    @Override
    public String toString() {
        return "Supraterreno{" + "medio=" + medio + " " + super.toString()+ '}';
    }
    
}
