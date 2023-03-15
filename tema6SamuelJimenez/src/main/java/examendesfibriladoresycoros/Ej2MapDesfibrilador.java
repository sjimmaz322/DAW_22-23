/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examendesfibriladoresycoros;

import java.util.ArrayList;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author samuel
 */
public class Ej2MapDesfibrilador {

    //--- Ponemos el atributo final para no poder modificarlo
    private final Map<String, Desfibrilador> mapDesfibri;

    //--- Creamos el constructor según los requisitos
    public Ej2MapDesfibrilador(Desfibrilador[] arrDes, boolean bool) {

        if (bool) {//--- Si el booleano es true creamos un TreeMap, o sea, Map con orden
            TreeMap<String, Desfibrilador> aux = new TreeMap<>();
            //--- Por cada elemento del Array creamos un registro del Map
            for (Desfibrilador arrDe : arrDes) {
                aux.put(arrDe.getId(), arrDe);
            }
            //--- Devolvemos el map
            this.mapDesfibri = aux;

        } else {//--- Si el booleano es falso creamos un HashMap, donde no importa el orden

            HashMap<String, Desfibrilador> aux = new HashMap<>();

            for (Desfibrilador arrDe : arrDes) {
                aux.put(arrDe.getId(), arrDe);
            }
            this.mapDesfibri = aux;

        }

    }

    public boolean buscadorDesfibrilador(Desfibrilador d) {
        //--- Usamos el método containsKey para saber si el desfibrilador está en el Map
        return mapDesfibri.containsKey(d.getId());
        //--- Podemos hacerlo de esta manera también si queremos
        //--- return mapDesfibri.containsValue(d);
    }

    public List<Desfibrilador> listaDesfibriladores() {
        //--- Guardamos todos los values del Map, o sea, los desfibriladores en un Collection
        Collection<Desfibrilador> aux = this.mapDesfibri.values();
        //--- Creamos la lista para devolverla al final
        List<Desfibrilador> lista = new ArrayList<>();
        //--- Rellenamos la lista con los desfibriladores
        for (Desfibrilador d : aux) {
            lista.add(d);
        }
        //--- Devolvemos la lista
        return lista;

    }

    public Map<String, Integer> numDesfibriladoresAsociados() {
        //--- Creamos un Map que contendrá nuestra información
        Map<String, Integer> aux = new TreeMap<>();
        //--- Creamos un Iterator para trabajar con los values del Map
        Iterator<Desfibrilador> it = mapDesfibri.values().iterator();
        //---
        while (it.hasNext()) {//--- Mientras haya elementos en el Iterator
            Desfibrilador d1 = it.next();//--- Guardamos el Desfibrilador en una variable para trabajar con ella
            if (d1.getEmail() != null) {//--- Si el email del Desfibrilador no es null
                if (aux.containsKey(d1.getEmail())) {//--- Si el email ya está dentro del Map
                    aux.put(d1.getEmail(), aux.get(d1.getEmail()) + 1);//--- Sumamos 1 al número de veces que está
                } else {//--- En caso de que no esté en el Map
                    aux.put(d1.getEmail(), 1); //--- Creamos el Entry dándole como veces que aparece un 1
                }
            }
        }
        //--- Devolvemos el Map
        return aux;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        //--- Guardamos las keys del Map en un Set
        Set<String> keys = mapDesfibri.keySet();

        for (String key : keys) {//--- Por cada key
            Desfibrilador d = mapDesfibri.get(key);//--- Obtenemos el Desfibrilador asociado a la key
            //--- Con el Desfibrilador creamos el mensaje del toString() como solicitaba el ejercicio
            sb.append(key).append(" -> ").append(d.getNombre()).append(" -> ").append(d.getEmail()).append("\n");
        }

        return sb.toString();
    }

}
