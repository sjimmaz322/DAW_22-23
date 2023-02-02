/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fechas;

import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

/**
 *
 * @author samuel
 */
public class EjemplosFechas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Clase que guarda fechas
        LocalDate fechaHoy = LocalDate.now();

        System.out.println(fechaHoy);
        System.out.println(fechaHoy.getYear());
        System.out.println(fechaHoy.getMonthValue());
        System.out.println(fechaHoy.getMonth());
        System.out.println(fechaHoy.getDayOfMonth());

        //Fechas Concretas
        LocalDate fecha = LocalDate.of(2000, 11, 10);
        LocalDate fecha2 = LocalDate.of(2022, Month.NOVEMBER, 10);

        System.out.println(fecha);
        System.out.println(fecha2);

        //Comprobación de fechas
        String resultado = fecha.equals(fecha2) ? "Son iguales" : "No son iguales";
        System.out.println(resultado);

        //Una es antes de la otra
        resultado = fecha.isBefore(fecha2) ? fecha + " va antes que " + fecha2 : fecha + " va después que " + fecha2;
        System.out.println(resultado);

        //Clase para guardar mes y día, no el año
        MonthDay nocheVieja = MonthDay.of(12, 31);
        System.out.println(nocheVieja);
        YearMonth caducidadTarjeta = YearMonth.of(2025, 4);
        System.out.println(caducidadTarjeta);

        //Operaciones con fechas
        LocalDate sumarDias = fechaHoy.plusDays(100);
        System.out.println(sumarDias);
        LocalDate sumarMeses = fechaHoy.plusMonths(13);
        System.out.println(sumarMeses);
        LocalDate sumarDosSiglos = sumarMeses.plus(2, ChronoUnit.CENTURIES);
        System.out.println(sumarDosSiglos);

        long diferenciaDias = ChronoUnit.DAYS.between(fecha, fecha2);
        System.out.println(diferenciaDias);
        long diferenciaAnios = ChronoUnit.YEARS.between(fecha, fecha2);
        System.out.println(diferenciaAnios);

        String bisiesto = LocalDate.now().isLeapYear() ? LocalDate.now().getYear() + " es bisiesto" : LocalDate.now().getYear() + " no es bisiesto";
        System.out.println(bisiesto);

        System.out.println(fechaHoy.lengthOfMonth());

        //Poner las cosas en otro idioma
        Locale configLocal = Locale.getDefault();
        System.out.println("El día de la semana de hoy es: " + fechaHoy.getDayOfWeek().getDisplayName(TextStyle.NARROW, configLocal));
        Month mesActual = fechaHoy.getMonth();
        System.out.println(mesActual);
        System.out.println(mesActual.getDisplayName(TextStyle.FULL, configLocal));

        /*
        dd -> día con dos números
        MM -> mes con dos números
        yyyy-> año con cuatro números
         */
        //Creamos un patrón de formato
        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fechaFormateada = fechaHoy.format(formatoFecha);
        System.out.println(fechaFormateada);
    }

}
