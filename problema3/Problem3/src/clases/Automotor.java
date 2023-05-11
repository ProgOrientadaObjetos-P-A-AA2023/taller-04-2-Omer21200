/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author omerb
 */
public class Automotor {

    private String cedulaDuenio;
    private int anioFabricacion;
    private double valoVehiculo;
    private double valorMatricula;
    private Fabricante fabricante;

    public Automotor() {
        Fabricante fabri = new Fabricante();
        cedulaDuenio = "null";
        anioFabricacion = 0;
        valoVehiculo = 0.0;
        fabricante = fabri;
    }

    public Automotor(String cedDuenio, int anioFabri, double valoVehi, Fabricante fabri) {
        cedulaDuenio = cedDuenio;
        anioFabricacion = anioFabri;
        valoVehiculo = valoVehi;
        fabricante = fabri;
    }

    public void establecerCedulaDuenio(String cedulaDuenio) {
        this.cedulaDuenio = cedulaDuenio;
    }

    public void establecerAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public void establecerValoVehiculo(double valoVehiculo) {
        this.valoVehiculo = valoVehiculo;
    }

    public void establecerValorMatricula() {
        valorMatricula = (valoVehiculo * 0.002) * (2023 - anioFabricacion);
    }

    public void establecerFabricante(Fabricante fabri) {
        fabricante = fabri;
    }

    public String obtenerCedulaDuenio() {
        return cedulaDuenio;
    }

    public int obtenerAnioFabricacion() {
        return anioFabricacion;
    }

    public double obtenerValoVehiculo() {
        return valoVehiculo;
    }

    public double obtenerValorMatricula() {
        return valorMatricula;
    }

    public Fabricante obtenerFabricante() {
        return fabricante;
    }
 @Override
    public String toString() {
        String cadena = String.format("Datos del Automotor\n"
                + "Cedula del Dueño: %s\n"
                + "Fabricante del vehículo: %s\n"
                + "Año de Fabricación: %d\n"
                + "Valor del Vehiculo: %.2f\n"
                + "Valor de la Matricula: %.2f\n",
                cedulaDuenio,
                fabricante.obtenerNombre(),
                anioFabricacion,
                valoVehiculo,
                valorMatricula);
        return cadena;
    }
}
