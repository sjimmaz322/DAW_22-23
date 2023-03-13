/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej2;

import daw.Desfibrilador;
import java.util.ArrayList;
import java.util.Arrays;
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
public class MapDesfibrilador {

    private Map<String, Desfibrilador> mapDesfibri;

    public MapDesfibrilador(Desfibrilador[] arrDes, boolean bool) {

        if (bool) {
            TreeMap<String, Desfibrilador> aux = new TreeMap<>();

            for (Desfibrilador arrDe : arrDes) {
                aux.put(arrDe.getId(), arrDe);
            }
            this.mapDesfibri = aux;

        } else {

            HashMap<String, Desfibrilador> aux = new HashMap<>();

            for (Desfibrilador arrDe : arrDes) {
                aux.put(arrDe.getId(), arrDe);
            }
            this.mapDesfibri = aux;

        }

    }

    public boolean buscadorDesfibrilador(Desfibrilador d) {
        return mapDesfibri.containsKey(d.getId());
    }

    public List<Desfibrilador> listaDesfibriladores() {

        Collection<Desfibrilador> aux = this.mapDesfibri.values();

        List<Desfibrilador> lista = new ArrayList<>();

        for (Desfibrilador d : aux) {
            lista.add(d);
        }
        return lista;

    }

    public Map<String, Integer> numDesfibriladoresAsociados() {
        Map<String, Integer> aux = new TreeMap<>();

        Iterator<Desfibrilador> it = mapDesfibri.values().iterator();
        int num = 0;
        while (it.hasNext()) {
            Desfibrilador d1 = it.next();

            if (mapDesfibri.containsValue(d1)) {
                num++;
            } else {
                num = 0;
            }
            if (d1.getEmail() != null) {
                aux.put(d1.getEmail(), num);
                num=0;
            }
        }

        return aux;

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        Set<String> keys = mapDesfibri.keySet();

        for (String key : keys) {
            Desfibrilador d = mapDesfibri.get(key);
            sb.append(key).append(" -> ").append(d.getNombre()).append(" -> ").append(d.getEmail()).append("\n");
        }
        /*
        for (Map.Entry<String, Desfibrilador> entry : mapDesfibri.entrySet()) {
            String key = entry.getKey();
            Desfibrilador val = entry.getValue();

            sb.append(key).append(" -> ").append(val.getNombre()).append(" -> ").append(val.getEmail()).append("\n");
        }
         */
        return sb.toString();
    }

}
