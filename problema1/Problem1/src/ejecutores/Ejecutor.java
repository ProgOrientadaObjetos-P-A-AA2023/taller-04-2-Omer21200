/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejecutores;

import clases.Estudiante;
import clases.Notas;
import clases.Universidad;

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
        Notas not1 = new Notas();
        not1.establecerPromedio();
        Estudiante estu2 = new Estudiante("Omer Benitez");
        Universidad uni2 = new Universidad("Universidad Nacional de Loja", "Sauces Norte");
        Notas not2 = new Notas(7, 9, 6, estu2, uni2);
        not2.establecerPromedio();
        System.out.printf("%s\n", not1);
        System.out.printf("%s\n", not2);

    }

}
