/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

/**
 *
 * @author sajm <sjimmaz322 at sjimmaz322@g.educaand.es>
 */
public class Pictorico extends Conservador {

    public Pictorico(String numColegiado, String nif, String nombre) {
        super(numColegiado, nif, nombre);
    }

    @Override
    public void restaurarObra(Obra o) {
        if (o instanceof Cuadro) {
            o.setNumRestauraciones(o.getNumRestauraciones() + 1);
            System.out.println("La obra " + ((Cuadro) o).getTitulo() + " ha sido restaurada.");
        } else {
            System.out.println("No es mi especialidad, no puedo restaurar esta obra.");
        }
    }

}
