/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author omerb
 */
public class Fabricante {

    private String nombre;
    private String ciudad;

    public Fabricante() {
        nombre = "null";
        ciudad = "null";
    }

    public Fabricante(String nom, String ciu) {
        nombre = nom;
        ciudad = ciu;
    }

    public void establecerNombre(String nom) {
        nombre = nom;
    }

    public void establecerCiudad(String ciu) {
        ciudad = ciu;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerCiudad() {
        return ciudad;
    }

}
