/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import ejercicio1.Docente;
import ejercicio1.UtilidadesEjercicio;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author samuel
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        List<Docente> listaDocentes = UtilidadesEjercicio.leerFichero("RelEmpCenAus", "txt", "\\|");
        Map<String, Double> map = generarMap(listaDocentes);

        generarJson(map);
    }

    public static Map<String, Double> generarMap(List<Docente> l) {
        Map<String, Double> mapDocentes = new HashMap<>();
        String tokens[];
        double totalMinutos;
        for (Docente d : l) {
            totalMinutos = 0;

            tokens = d.getHorasTotales().split(":");
            totalMinutos = Integer.parseInt(tokens[0]) * 60 + Integer.parseInt(tokens[1]);

            if (mapDocentes.containsKey(d.getDni())) {
                mapDocentes.replace(d.getDni(), mapDocentes.get(d.getDni()), mapDocentes.get(d.getDni()) + totalMinutos);
            } else {
                mapDocentes.put(d.getDni(), totalMinutos);
            }

            for (Map.Entry<String, Double> entry : mapDocentes.entrySet()) {
                String key = entry.getKey();
                Double val = entry.getValue();

                mapDocentes.replace(key, val / 60);

            }
        }
        return mapDocentes;
    }

    public static void generarJson(Map<String, Double> m) throws IOException {
        ObjectMapper mapeador = new ObjectMapper();

        // Permite a mapeador usar fechas según java time
        mapeador.registerModule(new JavaTimeModule());

        // Formato JSON bien formateado. Si se comenta, el fichero queda minificado
        mapeador.configure(SerializationFeature.INDENT_OUTPUT, true);

        mapeador.writeValue(new File("./totalHorasPorTrabajador.json"), m);
    }
}
