/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5esamueljimenez;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author samuel
 */
public class Ticket {

    private String fechaTicket;
    private String horaTicket;
    private ArrayList<Producto> listaProductos;
    //-----
    private String nombreSuper;
    private int numeroProductosIva4 = 0, numeroProductosIva10 = 0, numeroProductosIva21 = 0;
    private double sumaPrecioProdIva4SinIVA = 0, sumaPrecioProdIva10SinIVA = 0, sumaPrecioProdIva21SinIVA = 0;
    private double sumaPreciosIva4, sumaPreciosIva10, sumaPreciosIva21;
    private DateTimeFormatter formatHora = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
    private DateTimeFormatter formatFecha = DateTimeFormatter.ofPattern("dd - MM - yyyy");

    public Ticket(ArrayList<Producto> p) {
        this.nombreSuper = "";
        this.fechaTicket = LocalDate.now().format(formatFecha);
        this.horaTicket = LocalTime.now().format(formatHora);
        this.listaProductos = p;
    }

    public String getNombreSuper() {
        return nombreSuper;
    }

    public void setNombreSuper(String nombreSuper) {
        this.nombreSuper = nombreSuper;
    }

    public String getFechaTicket() {
        return fechaTicket;
    }

    public String getHoraTicket() {
        return horaTicket;
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    private void catalogadorProductos() {

        for (int i = 0; i < this.listaProductos.size(); i++) {

            switch (this.listaProductos.get(i).IVA()) {
                case 4 -> {
                    numeroProductosIva4 += this.listaProductos.get(i).cantidad();
                    sumaPrecioProdIva4SinIVA += this.listaProductos.get(i).precio() * this.listaProductos.get(i).cantidad();
                    sumaPreciosIva4 += (this.listaProductos.get(i).precio() * 1.04) * this.listaProductos.get(i).cantidad();
                }
                case 10 -> {
                    numeroProductosIva10 += this.listaProductos.get(i).cantidad();
                    sumaPrecioProdIva10SinIVA += this.listaProductos.get(i).precio() * this.listaProductos.get(i).cantidad();
                    sumaPreciosIva10 += (this.listaProductos.get(i).precio() * 1.10) * this.listaProductos.get(i).cantidad();
                }
                default -> {
                    numeroProductosIva21 += this.listaProductos.get(i).cantidad();
                    sumaPrecioProdIva21SinIVA += this.listaProductos.get(i).precio() * this.listaProductos.get(i).cantidad();
                    sumaPreciosIva21 += (this.listaProductos.get(i).precio() * 1.21) * this.listaProductos.get(i).cantidad();
                }
            }

        }
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 19 * hash + Objects.hashCode(this.fechaTicket);
        hash = 19 * hash + Objects.hashCode(this.horaTicket);
        hash = 19 * hash + Objects.hashCode(this.listaProductos);
        hash = 19 * hash + Objects.hashCode(this.nombreSuper);
        hash = 19 * hash + this.numeroProductosIva4;
        hash = 19 * hash + this.numeroProductosIva10;
        hash = 19 * hash + this.numeroProductosIva21;
        hash = 19 * hash + (int) (Double.doubleToLongBits(this.sumaPrecioProdIva4SinIVA) ^ (Double.doubleToLongBits(this.sumaPrecioProdIva4SinIVA) >>> 32));
        hash = 19 * hash + (int) (Double.doubleToLongBits(this.sumaPrecioProdIva10SinIVA) ^ (Double.doubleToLongBits(this.sumaPrecioProdIva10SinIVA) >>> 32));
        hash = 19 * hash + (int) (Double.doubleToLongBits(this.sumaPrecioProdIva21SinIVA) ^ (Double.doubleToLongBits(this.sumaPrecioProdIva21SinIVA) >>> 32));
        hash = 19 * hash + (int) (Double.doubleToLongBits(this.sumaPreciosIva4) ^ (Double.doubleToLongBits(this.sumaPreciosIva4) >>> 32));
        hash = 19 * hash + (int) (Double.doubleToLongBits(this.sumaPreciosIva10) ^ (Double.doubleToLongBits(this.sumaPreciosIva10) >>> 32));
        hash = 19 * hash + (int) (Double.doubleToLongBits(this.sumaPreciosIva21) ^ (Double.doubleToLongBits(this.sumaPreciosIva21) >>> 32));
        hash = 19 * hash + Objects.hashCode(this.formatHora);
        hash = 19 * hash + Objects.hashCode(this.formatFecha);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ticket other = (Ticket) obj;
        if (this.numeroProductosIva4 != other.numeroProductosIva4) {
            return false;
        }
        if (this.numeroProductosIva10 != other.numeroProductosIva10) {
            return false;
        }
        if (this.numeroProductosIva21 != other.numeroProductosIva21) {
            return false;
        }
        if (Double.doubleToLongBits(this.sumaPrecioProdIva4SinIVA) != Double.doubleToLongBits(other.sumaPrecioProdIva4SinIVA)) {
            return false;
        }
        if (Double.doubleToLongBits(this.sumaPrecioProdIva10SinIVA) != Double.doubleToLongBits(other.sumaPrecioProdIva10SinIVA)) {
            return false;
        }
        if (Double.doubleToLongBits(this.sumaPrecioProdIva21SinIVA) != Double.doubleToLongBits(other.sumaPrecioProdIva21SinIVA)) {
            return false;
        }
        if (Double.doubleToLongBits(this.sumaPreciosIva4) != Double.doubleToLongBits(other.sumaPreciosIva4)) {
            return false;
        }
        if (Double.doubleToLongBits(this.sumaPreciosIva10) != Double.doubleToLongBits(other.sumaPreciosIva10)) {
            return false;
        }
        if (Double.doubleToLongBits(this.sumaPreciosIva21) != Double.doubleToLongBits(other.sumaPreciosIva21)) {
            return false;
        }
        if (!Objects.equals(this.fechaTicket, other.fechaTicket)) {
            return false;
        }
        if (!Objects.equals(this.horaTicket, other.horaTicket)) {
            return false;
        }
        if (!Objects.equals(this.nombreSuper, other.nombreSuper)) {
            return false;
        }
        if (!Objects.equals(this.listaProductos, other.listaProductos)) {
            return false;
        }
        if (!Objects.equals(this.formatHora, other.formatHora)) {
            return false;
        }
        return Objects.equals(this.formatFecha, other.formatFecha);
    }

    @Override
    public String toString() {
        catalogadorProductos();
        DecimalFormat df = new DecimalFormat("#.00");
        StringBuilder sb = new StringBuilder();
        String tmp = "|Nombre|\t|Precio|\t|Cantidad|\t|IVA|\t|Precio sin IVA|\n";
        sb.append("-------------\n");
        sb.append("Supermercado ").append(nombreSuper).append("\n");
        sb.append("Fecha: ").append(fechaTicket).append("\t Hora: ").append(horaTicket).append("\n");
        sb.append("-------------\n");
        for (Producto p : listaProductos) {

            if (p != null) {

                tmp += p.nombre() + "|---|" + p.precio() + "|---|" + p.cantidad() + "|---|" + p.IVA() + "|---|" + (p.precio() * p.cantidad() + "|\n");
            }
        }
        sb.append(tmp);
        sb.append("-------------\n");
        sb.append("Nº Prod. Iva 4%: ").append(numeroProductosIva4);
        sb.append(" Precio sin IVA: ").append(sumaPrecioProdIva4SinIVA);
        sb.append(" Precio CON IVA: ").append(df.format(sumaPreciosIva4)).append("\n");
        sb.append("Nº Prod. Iva 10%: ").append(numeroProductosIva10);
        sb.append(" Precio sin IVA: ").append(sumaPrecioProdIva10SinIVA);
        sb.append(" Precio CON IVA: ").append(df.format(sumaPreciosIva10)).append("\n");
        sb.append("Nº Prod. Iva 21%: ").append(numeroProductosIva21);
        sb.append(" Precio sin IVA: ").append(sumaPrecioProdIva21SinIVA);
        sb.append(" Precio CON IVA: ").append(df.format(sumaPreciosIva21)).append("\n");
        sb.append("-------------\n");
        sb.append("Total a Pagar: ").append(df.format(sumaPreciosIva4 + sumaPreciosIva10 + sumaPreciosIva21)).append(" --- Gracias por su visita.");
        return sb.toString();
    }

}
