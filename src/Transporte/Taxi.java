/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transporte;

/**
 *
 * @author LENOVO
 */
public class Taxi extends Supraterreno {
    public int tarifa,tarpormin; 

    public Taxi() {
    }

    public Taxi(int tarifa, int tarpormin,String medio, int numRuedas, String nombre, int capacidadPasajeros, String color) {
        super(medio, numRuedas, nombre, capacidadPasajeros, color);
        this.tarifa = tarifa;
        this.tarpormin = tarpormin;
    }

    public int getTarifa() {
        return tarifa;
    }

    public void setTarifa(int tarifa) {
        this.tarifa = tarifa;
    }
    
    public void saludo(){
        System.out.println("Buenas tardes joven, A donde se dirige?");
        System.out.println("Que cree joven......\nNo voy para alla");
    }
    
    public void platica_frase(){
        System.out.println("Animo joven recuerde que....\nLa vida es como andar en bicicleta. Para mantener el equilibrio, debes seguir adelante.");
    }
    public void clima(){
        System.out.println("Como ha sentido el clima ultimamente???");
        System.out.println("Frio verdad? La verdad a mi no me agrada mucho este clima");
    }
    
    @Override
    public String toString() {
        return "Taxi{" + "tarifa incial=" + tarifa + ", tarifa por minuto=" + tarpormin + " " + super.toString() + '}';
    }

    
    
    
}
