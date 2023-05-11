/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author omerb
 */
public class Notas {

    private double calificacionMateria1;
    private double calificacionMateria2;
    private double calificacionMateria3;
    private double promedio;
    private Estudiante estudiante;
    private Universidad universidad;

    public Notas() { 
        Estudiante estu1=new Estudiante();
        Universidad uni1= new Universidad();
        calificacionMateria1 = 0.0;
        calificacionMateria2 = 0.0;
        calificacionMateria3 = 0.0;
        estudiante=estu1;
        universidad=uni1;
    }

    public Notas(double caliMateria1, double caliMateria2, double caliMateria3, Estudiante estu, Universidad uni) {
        calificacionMateria1 = caliMateria1;
        calificacionMateria2 = caliMateria2;
        calificacionMateria3 = caliMateria3;
        estudiante = estu;
        universidad = uni;
    }

    public void establecerCalificacionMateria1(double caliMateria1) {
        calificacionMateria1 = caliMateria1;
    }

    public void establecerCalificacionMateria2(double caliMateria2) {
        calificacionMateria2 = caliMateria2;
    }

    public void establecerCalificacionMateria3(double caliMateria3) {
        calificacionMateria3 = caliMateria3;
    }

    public void establecerPromedio() {
        promedio = (calificacionMateria1 + calificacionMateria2 + calificacionMateria3) / 3;
    }

    public void establecerEstudiante(Estudiante estu) {
        estudiante = estu;
    }

    public void establecerUniversidad(Universidad uni) {
        universidad = uni;
    }

    public double getCalificacionMateria1() {
        return calificacionMateria1;
    }

    public double getCalificacionMateria2() {
        return calificacionMateria2;
    }

    public double getCalificacionMateria3() {
        return calificacionMateria3;
    }

    public double getPromedio() {
        return promedio;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public Universidad getUniversidad() {
        return universidad;
    }

    @Override
    public String toString() {
        String cadena = String.format("Notas del Estudiante\n"
                + "Nombre: %s\n"
                + "Universidad: %s\n"
                + "Calificacion de la materia 1: %.2f\n"
                + "Calificacion de la materia 2: %.2f\n"
                + "Calificacion de la materia 3: %.2f\n"
                + "Promedio: %.2f\n",
                estudiante.obtenerNombre(),
                universidad.obtenerNombre(),
                calificacionMateria1,
                calificacionMateria2,
                calificacionMateria3,
                promedio);
        return cadena;
    }
}
