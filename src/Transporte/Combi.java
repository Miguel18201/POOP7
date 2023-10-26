/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transporte;

/**
 *
 * @author LENOVO
 */
public class Combi extends Supraterreno {
    public int tarifa;

    public Combi() {
    }

    public Combi(int tarifa, String medio, int numRuedas, String nombre, int capacidadPasajeros, String color) {
        super(medio, numRuedas, nombre, capacidadPasajeros, color);
        this.tarifa = tarifa;
    }

    public int getTarifa() {
        return tarifa;
    }

    public void setTarifa(int tarifa) {
        this.tarifa = tarifa;
    }
    
    public void pasaje(){
        System.out.println("¿Podria pasar el dinero porfavor?");
        System.out.println("Le pasa el pasaje*");
    }
    public void musica(){
        System.out.println("Suena Tus jefes no me quieren de Grupo Ensamble*");
    }
    public void bajada(){
        System.out.println("Puede parar en el puente amarillo?");
    }
    @Override
    public String toString() {
        return "Combi{" + "tarifa=" + tarifa + " " + super.toString() + '}';
    }
    
}
