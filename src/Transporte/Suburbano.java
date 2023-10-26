/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transporte;

/**
 *
 * @author LENOVO
 */
public class Suburbano extends Subterraneo {
    private String ruta,horario;
    /**
     * Constructor vacio de la clase Suburbano
     */
    public Suburbano() {
    }
    /**
     * Constructor lleno de la clase Suburbano
     * @param ruta Indica la ruta que va a seguir 
     * @param horario Muestra la hora a la que se inicia el servicio asi como la hora en que termina
     * @param medio Nos indica en que plataforma o con ayuda de que se traslada el transporte, por ejemplo carretera
     * @param numRuedas Representa el numero de llantas con el que cuenta el transporte
     * @param nombre El nombre del transporte
     * @param capacidadPasajeros El numero maximo de personas que puede llevar
     * @param color El color del transporte
     */
    public Suburbano(String ruta, String horario, String medio, int numRuedas, String nombre, int capacidadPasajeros, String color) {
        super(medio, numRuedas, nombre, capacidadPasajeros, color);
        this.ruta = ruta;
        this.horario = horario;
    }
    /**
     * Metodo getRuta
     * @return La ruta que sigue el Suburbano
     */
    public String getRuta() {
        return ruta;
    }
    /**
     * Metodo que nos
     * @param ruta 
     */
    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
    
    public void estacion(){
        System.out.println("Se encuentra en la estacion Fortuna");
    }
    
    public void dormir(){
        System.out.println("zzzzzzzz");
        System.out.println("Nota: Esta dormido en el transporte");
    }
    
    @Override
    public void viaje() {
        super.viaje(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    @Override
    public String toString() {
        return "Suburbano{" + "ruta=" + ruta + ", horario=" + horario + " " + super.toString() + '}';
    }
    
}
