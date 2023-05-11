/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author omerb
 */
public class Estudiante {

    private String nombre;

    public Estudiante() {
        nombre="null";
    }

    public Estudiante(String nom) {
        nombre = nom;
    }

    public void establecerNombre(String nom) {
        nombre = nom;
    }

    public String obtenerNombre() {
        return nombre;
    }
}
