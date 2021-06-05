package control;

import domain.*;

import java.time.Period;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Planificador {

    private static Planificador instance = null;
    private Empresa empresa;
    private Pedido unPedido;



    // Patron Singleton
    private Planificador() {}

    public static Planificador getInstance() {
        if(instance == null){
            instance = new Planificador();
        }
        return instance;
    }

    public ArrayList<Date> planificar(int cod_cliente, Date fechaPrimerEntrega, int cantidadEntregas, Periodicidad periodicidad){

        //Calculo las fechas de entrega
        ArrayList<Date> fechas = this.calcularFechas(fechaPrimerEntrega, cantidadEntregas, periodicidad);

        //Una vez que tengo las fechas, agrego una entrega por cada fecha
        ArrayList<Entrega> entregas = this.generarEntregas(fechas);

        //Genero el id
        int id = this.generarNuevoId();

        //Creo el pedido

        unPedido = new Pedido(fechaPrimerEntrega, cantidadEntregas, periodicidad, entregas, id);

        return fechas;
    }

    private ArrayList<Entrega> generarEntregas(ArrayList<Date> fechas) {
        //Genero las entregas segun cada fecha
        ArrayList<Entrega> entregas = new ArrayList<>();
        for(Date unaFecha : fechas){
            Entrega nuevaEntrega = new Entrega(unaFecha);
            entregas.add(nuevaEntrega);
        }
    }

    private ArrayList<Date> calcularFechas(Date fechaPrimerEntrega, int cantidadEntregas, Periodicidad periodicidad) {
        //Genero las fechas siguientes de entrega dependiendo la periodicidad y cant de entregas
        ArrayList<Date> fechas = new ArrayList<>();
        Date fechaActual = fechaPrimerEntrega;
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

    private int generarNuevoId() {
        //Genero el id del pedido. CREO que pidiendolo asi siempre habria uno distinto, porque sino no tenemos donde chequear
        return (int)System.currentTimeMillis();
    }

    public boolean validarCliente(int cod_cliente) {
        return empresa.validarCliente(cod_cliente);
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


    public ArrayList<Envase> buscarEnvasesDisponiblesParaElProducto(int cod_articulo) {
        Articulo articulo = empresa.buscarArticuloSegun(cod_articulo);
        return articulo.getEnvasesDisponibles();
    }

    public void generarArtPedido(Envase envase, int cod_articulo, int cantidad, float tolDiametro, float tolAncho, float tolLargo, Date unaFecha) {
        ArtPedido artPedido = new ArtPedido(cod_articulo, cantidad, tolDiametro, tolAncho, tolLargo, envase);
        unPedido.agregarArtPedido(artPedido, unaFecha);
    }

    public int buscarIdDelPedido() {
        return unPedido.getId();
    }
}
