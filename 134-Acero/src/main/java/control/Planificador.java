package control;

import domain.Periodicidad;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Planificador {

    private static Planificador instance = null;

    // Patron Singleton
    private Planificador() {}

    public static Planificador getInstance() {
        if(instance == null){
            instance = new Planificador();
        }
        return instance;
    }

    public ArrayList<Date> calcularFechas(Date fechaPrimerEntrega, int cantidadEntregas, Periodicidad periodicidad){
        //Genero las fechas siguientes de entrega dependiendo la periodicidad y cant de entregas
        Date fechaActual = fechaPrimerEntrega;
        ArrayList<Date> fechas = new ArrayList<>();
        for(int i=0; i<cantidadEntregas; i++){
            if(periodicidad == Periodicidad.SEMANAL){
                fechaActual = this.sumarRestarDiasFecha(fechaActual, 7);
                fechas.add(fechaActual);
            }else if(periodicidad == Periodicidad.UNICAVEZ){
                fechas.add(fechaActual);
            }else if(periodicidad == Periodicidad.MENSUAL){
                fechaActual = this.sumarRestarMesesFecha(fechaActual, 1);
                fechas.add(fechaActual);
            }
        }
        return fechas;
    }

    public Date sumarRestarDiasFecha(Date fecha, int dias){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fecha); // Configuramos la fecha que se recibe
        calendar.add(Calendar.DAY_OF_YEAR, dias);  // numero de días a añadir, o restar en caso de días<0
        return calendar.getTime(); // Devuelve el objeto Date con los nuevos días añadidos
    }

    public Date sumarRestarMesesFecha(Date fecha, int meses){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fecha); // Configuramos la fecha que se recibe
        calendar.add(Calendar.MONTH, meses);  // numero de días a añadir, o restar en caso de días<0
        return calendar.getTime(); // Devuelve el objeto Date con los nuevos días añadidos
    }
}
