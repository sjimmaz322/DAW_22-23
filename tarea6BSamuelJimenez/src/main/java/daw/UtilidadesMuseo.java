/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sajm <sjimmaz322 at sjimmaz322@g.educaand.es>
 */
public class UtilidadesMuseo {

    public static List<Empleado> getListaEmpleados() {
        //---
        List<Empleado> lista = new ArrayList<>();
        //---
        Empleado e1 = new Monitor("Cubismo", "1", "Rasha");
        Empleado e2 = new Monitor("Gótico", "2", "Gonzalo");
        Empleado e3 = new Vigilante("SegurSol", "3", "Carlos");
        Empleado e4 = new Vigilante("SegurSol", "4", "Jairo");
        //---
        lista.add(e1);
        lista.add(e2);
        lista.add(e3);
        lista.add(e4);
        //---
        return lista;
    }

    public static List<Sala> getListaSalas(Humedad h, Temperatura t) {
        //---
        List<Sala> lista = new ArrayList<>();
        //---
        Sala s1 = new Fija("Abierta", "De ayer y hoy", 1, new ArrayList<>(), h, t);
        Sala s2 = new Fija("Cerrada", "Grandes Autores", 2, new ArrayList<>(), h, t);
        Sala s3 = new Temporal(LocalDate.now(), LocalDate.now().plusMonths(1), "Mujeres en el arte", 3, new ArrayList<>(), h, t);
        Sala s4 = new Temporal(LocalDate.now(), LocalDate.now().plusMonths(1), "Arte primitivo", 4, new ArrayList<>(), h, t);
        //---
        lista.add(s1);
        lista.add(s2);
        lista.add(s3);
        lista.add(s4);
        //---
        return lista;
    }

    public static List<Obra> getObras() {
        //---    
        List<Obra> lista = new ArrayList<>();
        //---
        Obra o1 = new Cuadro("Impresionismo", "Ranita nadando en una lata", 1, "Manet");
        Obra o2 = new Cuadro("Abstracto", "Trabajo digno", 2, "Klimt");
        Obra o3 = new Escultura("Bronce", 3, "Michel Angello");
        Obra o4 = new Escultura("Marmol", 4, "Da Vinci");
        //---
        lista.add(o1);
        lista.add(o2);
        lista.add(o3);
        lista.add(o4);
        //---
        return lista;
    }
}
