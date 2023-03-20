/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package museo;

import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author sajm <sjimmaz322 at sjimmaz322@g.educaand.es>
 */
public class PruebaMuseo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //---
        List<Empleado> listaEmp = UtilidadesMuseo.getListaEmpleados();
        List<Sala> listaSalas = UtilidadesMuseo.getListaSalas(new Humedad(60, 30, 1), new Temperatura(25, 15, 2));
        //---
        Museo m1 = new Museo("Primer Museo", "Calle Falsa 123", listaSalas, listaEmp);
        //---
        System.out.println(m1);
        //---
        System.out.println(m1.getSalasMuseo().size());
        m1.quitarSala(m1.getSalasMuseo().get(1));
        System.out.println(m1.getSalasMuseo().size());
        m1.aniadirSala(new Temporal());
        System.out.println(m1.getSalasMuseo().size());
    }

}
