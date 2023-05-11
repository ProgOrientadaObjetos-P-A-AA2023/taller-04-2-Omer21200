/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author omerb
 */
public class Profesores {

    private String nombre;
    private String apellido;
    private String cedula;
    private double sueldoBasico;
    private double sueldoTotal;
    private Provincia provincia;

    public Profesores() {
        Provincia pro = new Provincia();
        nombre = "null";
        apellido = "null";
        cedula = "null";
        sueldoBasico = 0.0;
        provincia = pro;
    }

    public Profesores(String nom, String ape, String ced, double sueldoBas, Provincia pro) {
        nombre = nom;
        apellido = ape;
        cedula = ced;
        sueldoBasico = sueldoBas;
        provincia = pro;
    }

    public void establecerNombre(String nombre) {
        this.nombre = nombre;
    }

    public void establecerApellido(String apellido) {
        this.apellido = apellido;
    }

    public void establecerCedula(String cedula) {
        this.cedula = cedula;
    }

    public void establecertSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public void establecerSueldoTotal() {
        sueldoTotal = (sueldoBasico * 0.20) + sueldoBasico;
    }

    public void establecerProvincia(Provincia provincia) {
        this.provincia = provincia;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public String obtenerCedula() {
        return cedula;
    }

    public double obtenerSueldoBasico() {
        return sueldoBasico;
    }

    public double obtenerSueldoTotal() {
        return sueldoTotal;
    }

    public Provincia obtenerProvincia() {
        return provincia;
    }

    @Override
    public String toString() {
        String cadena = String.format("Datos del Docente\n"
                + "Nombre: %s\n"
                + "Apellido: %s\n"
                + "Cedula: %s\n"
                + "Provincia: %s\n"
                + "Sueldo Basico: %.2f\n"
                + "Sueldo Total: %.2f\n",
                nombre,
               apellido,
                cedula,
                provincia.obtenerNombre(),
                sueldoBasico,
                sueldoTotal);
        return cadena;
    }
}
