/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author omerb
 */
public class Banco {

    private String nombre;
    private int numSucursales;

    public Banco() {
        nombre = "null";
        numSucursales = 0;
    }

    public Banco(String nom, int numSucur) {
        nombre = nom;
        numSucursales = numSucur;
    }

    public void establecerNombre(String nom) {
        nombre = nom;
    }

    public void establecerNumSucursales(int numSucur) {
        numSucursales = numSucur;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public int obtenerNumSucursales() {
        return numSucursales;
    }

}
