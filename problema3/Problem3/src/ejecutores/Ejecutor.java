/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejecutores;

import clases.Automotor;
import clases.Fabricante;

/**
 *
 * @author omerb
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Automotor auto1 = new Automotor();
        auto1.establecerValorMatricula();
        Fabricante fabr2 = new Fabricante("Ferrari", "Quito");
        Automotor auto2 = new Automotor("1251470360", 2022, 150000, fabr2);
        auto2.establecerValorMatricula();
        System.out.printf("%s\n", auto1);
        System.out.printf("%s\n", auto2);
    }

}
