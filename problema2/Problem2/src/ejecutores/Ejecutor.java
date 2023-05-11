/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejecutores;

import clases.Profesores;
import clases.Provincia;

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
        Profesores profe1 = new Profesores();
        profe1.establecerSueldoTotal();
        Provincia pro2 = new Provincia("Loja", 50000);
        Profesores profe2 = new Profesores("Oscar", "Paute", "1150460358", 400, pro2);
        profe2.establecerSueldoTotal();
        System.out.printf("%s\n", profe1);
        System.out.printf("%s\n", profe2);

    }

}
