

package Transporte;

/**
 *
 * @author LENOVO
 */
public class Acuaticos extends MediosDeTransporte {
    private String propulsion;

    public Acuaticos() {
    }

    public Acuaticos(String propulsion, String nombre, int capacidadPasajeros, String color) {
        super(nombre, capacidadPasajeros, color);
        this.propulsion = propulsion;
    }

    public String getPropulsion() {
        return propulsion;
    }

    public void setPropulsion(String propulsion) {
        this.propulsion = propulsion;
    }

    @Override
    public void Pasajeros() {
        super.Pasajeros(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    @Override
    public String toString() {
        return "Acuaticos{" + "propulsion=" + propulsion + " " + super.toString() + '}';
    }
    
}
