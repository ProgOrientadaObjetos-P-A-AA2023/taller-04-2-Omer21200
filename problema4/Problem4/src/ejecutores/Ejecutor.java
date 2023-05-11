/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejecutores;

import clases.Banco;
import clases.Cheque;
import clases.Cliente;

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
        Cheque che1=new Cheque();
        che1.establecerComision();
        Cliente cli2=new Cliente("Alexis", "Cabrera", "1150460259");
        Banco ban2=new Banco("Interncaional",1);
        Cheque che2=new Cheque(500, cli2, ban2);
        che2.establecerComision();
        System.out.printf("%s\n",che1);
        System.out.printf("%s\n",che2);
    }
    
}
