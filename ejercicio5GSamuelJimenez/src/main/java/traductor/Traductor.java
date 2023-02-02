/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package traductor;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author sajm <sjimmaz322 at sjimmaz322@g.educaand.es>
 */
public class Traductor {

    private Map<String, String> relacion = new TreeMap<>();

    public Traductor() {
    }

    public Map<String, String> getRelacion() {
        return relacion;
    }

    public void setRelacion(Map<String, String> relacion) {
        this.relacion = relacion;
    }

    //-- Añadimos una traducción al diccionario
    public void aniadirRegistro(String original, String traduccion) {
        this.relacion.put(original, traduccion);
    }

    //-- Borramos si existe una traducción del diccionario
    public void borrarRegistro(String clave) {
        this.relacion.remove(clave);
    }

    //-- Actualizamos si existe una traducción
    public void actualizarRegistro(String clave, String actualizacion) {
        this.relacion.replace(clave, actualizacion);
    }

    //-- Creamos una lista con las palabras sin traducir
    public Set<String> listadoPalabrasOriginales() {
        return this.relacion.keySet();
    }

    //-- Creamos una lista (colección) con las palabras traducidas
    public Collection<String> listadoPalabrasTraducidas() {
        return this.relacion.values();
    }

    public void imprimirConjunto() {
        for (String key : this.relacion.keySet()) {
            System.out.printf("Palabra original: %s -/-/- Traducción: %s %n", key, this.relacion.get(key));
        }
    }

    public String traducirPalabra(String clave) {
        if (this.relacion.get(clave) != null) {
            return this.relacion.get(clave);
        } else {
            return "¡ERROR!\nPalabra no contenida en el diccionario.";
        }
    }
}
