/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej13;

/**
 *
 * @author samuel
 */
public class Direccion {

    private String nombreCalle, nombreCiudad, codPosta, nombrePais;

    public Direccion() {
    }

    public Direccion(String nombreCalle, String nombreCiudad, String codPosta, String nombrePais) {
        this.nombreCalle = nombreCalle;
        this.nombreCiudad = nombreCiudad;
        this.codPosta = codPosta;
        this.nombrePais = nombrePais;
    }

    public String getNombreCalle() {
        return nombreCalle;
    }

    public void setNombreCalle(String nombreCalle) {
        this.nombreCalle = nombreCalle;
    }

    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }

    public String getCodPosta() {
        return codPosta;
    }

    public void setCodPosta(String codPosta) {
        this.codPosta = codPosta;
    }

    public String getNombrePais() {
        return nombrePais;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Direccion{");
        sb.append("nombreCalle=").append(nombreCalle);
        sb.append(", nombreCiudad=").append(nombreCiudad);
        sb.append(", codPosta=").append(codPosta);
        sb.append(", nombrePais=").append(nombrePais);
        sb.append('}');
        return sb.toString();
    }
    
    
}
