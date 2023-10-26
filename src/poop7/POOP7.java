package poop7;

import Transporte.Acuaticos;
import Transporte.Aereos;
import Transporte.Avion;
import Transporte.Barco;
import Transporte.Combi;
import Transporte.Helicoptero;
import Transporte.MediosDeTransporte;
import Transporte.Metro;
import Transporte.Subterraneo;
import Transporte.Suburbano;
import Transporte.Supraterreno;
import Transporte.Taxi;
import Transporte.Terrestres;
import Transporte.Trajinera;
/**
 *
 * @author Miguel
 */
public class POOP7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Animal animal = new Animal("Jaguar","Mexico","Amarillo con manchas cafes");
        
        Animal animal1 = new Animal();
        animal1.setNombre("Max");
        animal1.setLugarOrigen("CDMX");
        animal1.setColor("Cafe");
        
        System.out.println(animal);
        
        System.out.println(animal1.toString());
        
        
        AnimalAcuatico animal2 = new AnimalAcuatico();
        animal2.setNombre("Escamas");
        animal2.setLugarOrigen("Canada");
        animal2.setColor("Verde");
        animal2.setNumeroAletas(2);
        animal2.comer();
        System.out.println(animal2);
        
        Ballena ballena = new Ballena(30,2,"Wilson","Rusia","Gris");
        System.out.println(ballena);
        ballena.pelearConPinocho();
        
        AnimalTerrestre animal3 = new AnimalTerrestre(4,"Caballo","Guadalajara","Cafe");
        System.out.println(animal3);
        
        Perro perro = new Perro("Rojo",4,"Zeus","CDMX","Gris");
        System.out.println(perro);
        
        AnimalAereo animal4 = new AnimalAereo(2,"murcielago","Ucrania","Negro");
        System.out.println(animal4);
        
        Pajaro pajaro = new Pajaro("Tubular",2,"colibri","Brasil","Amarrilo");
        System.out.println(pajaro);
        
        MediosDeTransporte transporte = new MediosDeTransporte("Barco",80,"Gris con azul");
        System.out.println(transporte);
        transporte.Pasajeros();
        transporte.estado();
        
        Terrestres terrestre = new Terrestres(20,"Metrobus",100,"Rojo");
        System.out.println(terrestre);
        terrestre.estado();
        
        Subterraneo subterraneo = new Subterraneo("Vias ferreas",12,"Ferrocarril",1000,"Negro");
        System.out.println(subterraneo);
        
        Supraterreno objeto = new Supraterreno("Carretera",2,"Motocicleta",2,"Morado");
        System.out.println(objeto);
        
        Metro metro = new Metro("Linea 1",11,"Vias subterraneas",22,"Metro",1500,"Naranja");
        System.out.println(metro);
        
        Suburbano suburbano = new Suburbano("Buenavista-Cuautitlan","5:00 hrs a 0:30 hrs", "Vias ferreas", 28, "Suburbano", 200, "Rojo con blanco");
        System.out.println(suburbano);
        suburbano.estacion();
        
        Taxi taxi = new Taxi(9,2,"Carretera",4,"Taxi", 4, "Rosa con blanco");
        System.out.println(taxi);
        taxi.saludo();
        taxi.platica_frase();
        
        Combi combi = new Combi(15,"Carretera",4,"Combi", 15, "Verde");
        System.out.println(combi);
        
        Acuaticos acuaticos = new Acuaticos("Motor","Moto acuatica",3,"Azul con gris");
        System.out.println(acuaticos);
        
        Trajinera trajinera = new Trajinera(9,"Remos","Trajinera",18,"Amarillo");
        System.out.println(trajinera);
        trajinera.mariachi();
        
        Barco barco = new Barco("El cazador de Tormentas", "Motor","Barco",10000,"Blanco con rojo y negro");
        System.out.println(barco);
        barco.anclar();
        
        Aereos aereo = new Aereos(10000,"Planeador",5,"Blanco");
        System.out.println(aereo);
        
        Avion avion = new Avion("Desde Mexico a Francia",12000,"Avion",400,"Blanco con lineas azules");
        System.out.println(avion);
        
        Helicoptero helicoptero = new Helicoptero("Airbus H145",3000,"Helicoptero",6,"Blanco con lineas rojas");
        System.out.println(helicoptero);
    }
    
}