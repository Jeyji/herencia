/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author Estudiante
 */
public class Estudiante extends Persona {
    private double[] notas;
    private Profesor asignado; 

    public Estudiante(double[] notas, Profesor asignado, int telefono, String direccion, String materia) {
        super(telefono, direccion, materia);
        this.notas = notas;
        this.asignado = asignado;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public Profesor getAsignado() {
        return asignado;
    }

    public void setAsignado(Profesor asignado) {
        this.asignado = asignado;
    }
    
    public double promedio(){
        double resultado= 0;
        for(double nota : notas){
            resultado += nota;
        }
        return resultado/notas.length;
    }
    
}
