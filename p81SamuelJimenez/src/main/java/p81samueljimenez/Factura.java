/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package p81samueljimenez;

import java.time.LocalDate;
import java.util.Random;
import java.util.stream.DoubleStream;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author samuel
 */
// Anotación @XmlRootElement, nombre de la etiqueta XML raíz.
//@XmlRootElement(name = "factura")
// Anotación @XmlAccesorType define el elemento que usará JAXB durante el 
// procesamiento de datos (en este caso por atributo)
//@XmlAccessorType(XmlAccessType.FIELD)
public class Factura {

    private int codigoUnico;
    //@XmlJavaTypeAdapter(value = LocalDateAdapter.class)
    private LocalDate fechaEmision;
    private String descripcion;
    private double totalImporte;
    private static int contador = 1;

    public Factura() {
        DoubleStream importe = new Random().doubles(1, 100, 1000);
        this.codigoUnico = contador;
        this.fechaEmision = LocalDate.now();
        this.descripcion = RandomStringUtils.randomAlphabetic(10, 30);
        this.totalImporte = importe.findFirst().getAsDouble();
        ++contador;
    }

    public LocalDate getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(LocalDate fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getTotalImporte() {
        return totalImporte;
    }

    public void setTotalImporte(double totalImporte) {
        this.totalImporte = totalImporte;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Factura.contador = contador;
    }

    public int getCodigoUnico() {
        return codigoUnico;
    }

    public void setCodigoUnico(int codigoUnico) {
        this.codigoUnico = codigoUnico;
    }

    @Override
    public String toString() {
        return codigoUnico + ";" + fechaEmision + ";" + descripcion + ";" + totalImporte + ";";
    }

}
