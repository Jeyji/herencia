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
public class Persona{
    protected int telefono;
    protected String direccion;
    protected String materia;

    public Persona(int telefono, String direccion, String materia) {
        this.telefono = telefono;
        this.direccion = direccion;
        this.materia = materia;
    }
    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getMateria() {
        return materia;
    }

    public void setMatetia(String materia) {
        this.materia = materia;
    }

}
