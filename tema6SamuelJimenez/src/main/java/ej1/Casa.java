/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sajm <sjimmaz322 at sjimmaz322@g.educaand.es>
 */
public class Casa {
    
    private String direccion;
    private Puerta puertas;
    private List<Ventana> listaVentanas;
    private List<Calefactor> listaCalefactores;
    //---

    public Casa(String direccion) {
        this.direccion = direccion;
        this.puertas = new Puerta();
        this.listaVentanas = new ArrayList<>();
        this.listaCalefactores = new ArrayList<>();
    }
    
    public Casa(String direccion, Puerta puertas, List<Ventana> listaVentanas, List<Calefactor> listaCalefactores) {
        this.direccion = direccion;
        this.puertas = puertas;
        this.listaVentanas = listaVentanas;
        this.listaCalefactores = listaCalefactores;
    }
    
    public String getDireccion() {
        return direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public Puerta getPuertas() {
        return puertas;
    }
    
    public void setPuertas(Puerta puertas) {
        this.puertas = puertas;
    }
    
    public List<Ventana> getListaVentanas() {
        return listaVentanas;
    }
    
    public void setListaVentanas(List<Ventana> listaVentanas) {
        this.listaVentanas = listaVentanas;
    }
    
    public List<Calefactor> getListaCalefactores() {
        return listaCalefactores;
    }
    
    public void setListaCalefactores(List<Calefactor> listaCalefactores) {
        this.listaCalefactores = listaCalefactores;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("En la casa de la calle ").append(direccion).append("\n");
        sb.append(puertas.toString());
        for (Ventana v : listaVentanas) {
            sb.append(v.toString()).append("\n");
        }
        for (Calefactor c : listaCalefactores) {
            sb.append(c.toString()).append("\n");
        }
        return sb.toString();
    }
    
}
