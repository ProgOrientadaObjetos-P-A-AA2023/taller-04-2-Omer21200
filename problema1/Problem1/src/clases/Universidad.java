/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author omerb
 */
public class Universidad {

    private String nombre;
    private String direccion;

    public Universidad() {
        nombre = "null";
        direccion = "null"; 
    }

    public Universidad(String nom, String direc) {
        nombre = nom;
        direccion = direc;
    }

    public void establecerNombre(String nom) {
        nombre = nom;
    }

    public void establecerDireccion(String direc) {
        direccion = direc;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerDireccion() {
        return direccion;
    }

}
