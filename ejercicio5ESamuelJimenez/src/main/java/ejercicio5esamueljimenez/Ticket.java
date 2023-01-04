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

/**
 *
 * @author samuel
 */
public class Ticket {

    private String fechaTicket;
    private String horaTicket;
    private Caja cajaCobro;
    private String nombreSuper;
    private int numeroProductosIva4 = 0, numeroProductosIva10 = 0, numeroProductosIva21 = 0;
    private double sumaPrecioProdIva4SinIVA = 0, sumaPrecioProdIva10SinIVA = 0, sumaPrecioProdIva21SinIVA = 0;
    private double sumaPreciosIva4, sumaPreciosIva10, sumaPreciosIva21;
    private DateTimeFormatter formatHora = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
    private DateTimeFormatter formatFecha = DateTimeFormatter.ofPattern("dd - MM - yyyy");

    public Ticket(Caja cajaCobro) {
        this.nombreSuper = "";
        this.fechaTicket = LocalDate.now().format(formatFecha);
        this.horaTicket = LocalTime.now().format(formatHora);
        this.cajaCobro = cajaCobro;
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

    public Caja getCajaCobro() {
        return cajaCobro;
    }

    private void catalogadorProductos() {

        for (int i = 0; i < cajaCobro.getListaProductos().size(); i++) {

            switch (cajaCobro.getListaProductos().get(i).IVA()) {
                case 4:
                    numeroProductosIva4++;
                    sumaPrecioProdIva4SinIVA += cajaCobro.getListaProductos().get(i).precio() * cajaCobro.getListaProductos().get(i).cantidad();
                    sumaPreciosIva4 += (cajaCobro.getListaProductos().get(i).precio() * 1.04) * cajaCobro.getListaProductos().get(i).cantidad();

                    break;
                case 10:
                    numeroProductosIva10++;
                    sumaPrecioProdIva10SinIVA += cajaCobro.getListaProductos().get(i).precio() * cajaCobro.getListaProductos().get(i).cantidad();
                    sumaPreciosIva10 += (cajaCobro.getListaProductos().get(i).precio() * 1.1) * cajaCobro.getListaProductos().get(i).cantidad();

                    break;
                default:
                    numeroProductosIva21++;
                    sumaPrecioProdIva21SinIVA += cajaCobro.getListaProductos().get(i).precio() * cajaCobro.getListaProductos().get(i).cantidad();
                    sumaPreciosIva21 += (cajaCobro.getListaProductos().get(i).precio() * 1.21) * cajaCobro.getListaProductos().get(i).cantidad();

                    break;
            }
        }
    }

    @Override
    public String toString() {
        catalogadorProductos();
        DecimalFormat df = new DecimalFormat("#.00");
        StringBuilder sb = new StringBuilder();
        sb.append("-------------\n");
        sb.append("Supermercado ").append(nombreSuper).append("\n");
        sb.append("Fecha: ").append(fechaTicket).append("\t Hora: ").append(horaTicket).append("\n");
        sb.append("-------------\n");
        sb.append(cajaCobro);
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
