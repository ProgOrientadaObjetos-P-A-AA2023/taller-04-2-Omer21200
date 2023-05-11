/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author omerb
 */
public class Provincia {

    private String nombre;
    private int numeroHabitantes;

    public Provincia() {
        nombre = "null";
        numeroHabitantes=0;
    }

    public Provincia(String nom, int numHabi) {
        nombre = nom;
        numeroHabitantes = numHabi;
    }

    public void establecerNombre(String nom) {
        nombre = nom;
    }

    public void establecerNumeroHabitantes(int numeroHabitantes) {
        this.numeroHabitantes = numeroHabitantes;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public int obtenerNumeroHabitantes() {
        return numeroHabitantes;
    }

}
