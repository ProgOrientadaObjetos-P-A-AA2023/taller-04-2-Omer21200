/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author omerb
 */
public class Cheque {

    private double valorCheque;
    private double comision;
    private Cliente cliente;
    private Banco banco;

    public Cheque() {
        Cliente cli = new Cliente();
        Banco ban = new Banco();
        valorCheque = 0.0;
        cliente = cli;
        banco = ban;
    }

    public Cheque(double valorChe, Cliente cli, Banco ban) {
        valorCheque = valorChe;
        cliente = cli;
        banco = ban;
    }

    public void establecerValorCheque(double valorChe) {
        valorCheque = valorChe;
    }

    public void establecerComision() {
        comision = valorCheque * 0.003;
    }

    public void establecerCliente(Cliente cli) {
        cliente = cli;
    }

    public void establecerBanco(Banco ban) {
        banco = ban;
    }

    public double obtenerValorCheque() {
        return valorCheque;
    }

    public double obtenerComision() {
        return comision;
    }

    public Cliente obtenerCliente() {
        return cliente;
    }

    public Banco obtenerBanco() {
        return banco;
    }

    @Override
    public String toString() {
        String cadena = String.format("Datos del Cheque\n"
                + "Nombre del Cliente: %s\n"
                + "Banco: %s\n"
                + "Valor del Cheque: %.2f\n"
                + "Comision del Banco: %.2f\n",
                (cliente.obtenerNombre() + " " + cliente.obtenerApellido()),
                banco.obtenerNombre(),
                valorCheque,
                comision);
        return cadena;
    }
}
