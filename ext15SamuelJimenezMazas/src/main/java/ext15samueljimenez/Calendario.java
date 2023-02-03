/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package ext15samueljimenez;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.time.format.TextStyle;
import java.util.Arrays;
import java.util.Locale;

/**
 *
 * @author samuel
 */
public class Calendario {

    private int[][] calendario;
    private Month mes;
    private Year anio;

    public Calendario(Month mes, Year anio) {
        this.setAnio(anio);
        this.setMes(mes);

        this.calendario = new int[6][7];

    }

    public int[][] getCalendario() {
        return calendario;
    }

    public void setCalendario(int[][] calendario) {
        this.calendario = calendario;
    }

    public Month getMes() {
        return mes;
    }

    public void setMes(Month mes) {
        this.mes = mes;
    }

    public Year getAnio() {
        return anio;
    }

    public void setAnio(Year anio) {
        this.anio = anio;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Arrays.deepHashCode(this.calendario);
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
        final Calendario other = (Calendario) obj;
        return Arrays.deepEquals(this.calendario, other.calendario);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Locale configLocal = Locale.getDefault();

        sb.append("Calendario de: ").append(mes.getDisplayName(TextStyle.FULL, configLocal)).append(" del ").append(anio).append("\n");
        sb.append("L\tM\tX\tJ\tV\tS\tD\n");

        for (int i = 0; i < calendario.length; i++) {
            for (int j = 0; j < calendario[i].length; j++) {
                if (calendario[i][j] == 0) {
                    sb.append(" " + "\t");
                } else {
                    sb.append(calendario[i][j] + "\t");
                }
            }
            sb.append("\n");

        }
        return sb.toString();
    }

    public static String diaSemana(int dia, Calendario c) {
        if (dia < 1 || dia > c.mes.maxLength()) {
            throw new IllegalArgumentException("El día introducido no existe");
        }

        int numDia = LocalDate.of(c.anio.getValue(), c.mes, dia).getDayOfWeek().getValue();
        String diaSemana = "";

        switch (numDia) {
            case 1 -> {
                diaSemana = "Lunes";
            }
            case 2 -> {
                diaSemana = "Martes";
            }
            case 3 -> {
                diaSemana = "Mieŕcoles";
            }
            case 4 -> {
                diaSemana = "Jueves";
            }
            case 5 -> {
                diaSemana = "Viernes";
            }
            case 6 -> {
                diaSemana = "Sábado";
            }
            case 7 -> {
                diaSemana = "Domingo";
            }

        }

        return diaSemana;

    }

    public static void rellenarCalenario(Calendario c) {
        int dia = LocalDate.of(c.anio.getValue(), c.mes, 1).getDayOfWeek().getValue();
        int uno = 1;

        for (int i = 0; i < c.calendario.length; i++) {

            for (int j = 0; j < c.calendario[i].length; j++) {
                if (uno <= c.mes.maxLength()) {
                    if (i == 0 && j < dia - 1) {
                        c.calendario[i][j] = 0;

                    } else {
                        c.calendario[i][j] = uno;
                        uno++;
                    }
                }

            }

        }

    }

    public static String[] calendarioAnual(int anio) {
        String[] anioCompleto = new String[12];

        Calendario c1 = new Calendario(Month.JANUARY, Year.of(anio));
        rellenarCalenario(c1);
        anioCompleto[0] = c1.toString();
        //--
        Calendario c2 = new Calendario(Month.FEBRUARY, Year.of(anio));
        rellenarCalenario(c2);
        anioCompleto[1] = c2.toString();
        //--
        Calendario c3 = new Calendario(Month.MARCH, Year.of(anio));
        rellenarCalenario(c3);
        anioCompleto[2] = c3.toString();
        //--
        Calendario c4 = new Calendario(Month.APRIL, Year.of(anio));
        rellenarCalenario(c4);
        anioCompleto[3] = c4.toString();
        //--
        Calendario c5 = new Calendario(Month.MAY, Year.of(anio));
        rellenarCalenario(c5);
        anioCompleto[4] = c5.toString();
        //--
        Calendario c6 = new Calendario(Month.JUNE, Year.of(anio));
        rellenarCalenario(c6);
        anioCompleto[5] = c6.toString();
        //--
        Calendario c7 = new Calendario(Month.JULY, Year.of(anio));
        rellenarCalenario(c7);
        anioCompleto[6] = c7.toString();
        //--
        Calendario c8 = new Calendario(Month.AUGUST, Year.of(anio));
        rellenarCalenario(c8);
        anioCompleto[7] = c8.toString();
        //--
        Calendario c9 = new Calendario(Month.SEPTEMBER, Year.of(anio));
        rellenarCalenario(c9);
        anioCompleto[8] = c9.toString();
        //--
        Calendario c10 = new Calendario(Month.OCTOBER, Year.of(anio));
        rellenarCalenario(c10);
        anioCompleto[9] = c10.toString();
        //--
        Calendario c11 = new Calendario(Month.NOVEMBER, Year.of(anio));
        rellenarCalenario(c11);
        anioCompleto[10] = c11.toString();
        //--
        Calendario c12 = new Calendario(Month.DECEMBER, Year.of(anio));
        rellenarCalenario(c12);
        anioCompleto[11] = c12.toString();
        //--

        return anioCompleto;
    }

}
