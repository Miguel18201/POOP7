/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transporte;

/**
 *
 * @author LENOVO
 */
public class Avion extends Aereos {
    private String destino;

    public Avion() {
    }

    public Avion(String destino, int altura, String nombre, int capacidadPasajeros, String color) {
        super(altura, nombre, capacidadPasajeros, color);
        this.destino = destino;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }
    
    public void duracion(){
        System.out.println("Llegaremos a nuestro destino dentro de 20 minutos");
    }
    
    public void aperitivo(){
        System.out.println("Desea un aperitivo??? Tenemos nueces o arandanos");
        System.out.println("Arandanos porfavor");
    }
    
    public void azafata(){
        System.out.println("Se encuentra todo bien o hay algo en lo que lo pueda ayudar?");
        System.out.println("Todo bien por el momento, gracias");
    }
    
    @Override
    public String toString() {
        return "Avion{" + "destino=" + destino + " " + super.toString() +'}';
    }
    
    
}
