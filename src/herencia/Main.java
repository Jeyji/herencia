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
public class Main {
    public static void main(String[] args){
        Profesor p1 = new Profesor(3133935,"Carrera 3 # 6-33", "POO");
        double notas[]={5,4.3,2,5};
        Estudiante e1 = new Estudiante(notas, p1, 3132548, "Carrera 28c#22a","POO");
        System.out.println(e1.getDireccion());
        System.out.println(e1.getAsignado().getDireccion());
        System.out.println(e1.getMateria());
        System.out.println(e1.promedio());
    }
}
