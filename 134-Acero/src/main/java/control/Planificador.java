package control;

import domain.*;

import java.util.*;

public class Planificador {

    /*  ----    Singleton   ----    */

    private static Planificador instance = null;

    private Planificador() {}

    public static Planificador getInstance() {
        if(instance == null){
            instance = new Planificador();
        }
        return instance;
    }

    private Empresa empresa = new Empresa();


    /*  -----   Metodos     -----   */


    //Para validar al cliente
    public boolean validarCliente(int cod_cliente) {
        return empresa.validarCliente(cod_cliente);
    }


    //Para general el pedido (y varias entregas por un mismo pedido)
    public ArrayList<Date> planificar(int cod_cliente, Date fechaPrimerEntrega, int cantidadEntregas, Periodicidad periodicidad) {
        ArrayList<Date> fechas = this.calcularFechas(fechaPrimerEntrega, cantidadEntregas, periodicidad);
        ArrayList<Entrega> entregas = this.generarEntregas(fechas); //Una vez que tengo las fechas, agrego una entrega por cada fecha
        String id = this.generarNuevoId(); //Genero el id y creo el pedido
        Pedido unPedido = new Pedido(fechaPrimerEntrega, cantidadEntregas, periodicidad, entregas, id);
        empresa.agregarPedido(unPedido);
        System.out.println("Se creo el pedido");
        return fechas;
    }


    //Para calcular las fechas de las entregas del pedido
    private ArrayList<Date> calcularFechas(Date fechaPrimerEntrega, int cantidadEntregas, Periodicidad period) {
        //Genero las fechas siguientes de entrega dependiendo la periodicidad y cant de entregas
        ArrayList<Date> fechas = new ArrayList<>();
        fechas.add(fechaPrimerEntrega);
        Date fechaActual = fechaPrimerEntrega;
        for(int i = 1; i < cantidadEntregas; i++) {
            switch(period) {
                case UNICAVEZ:
                    fechas.add(fechaActual);
                    break;
                case SEMANAL:
                    fechaActual = this.sumarRestarDiasFecha(fechaActual, 7);
                    fechas.add(fechaActual);
                    break;
                case MENSUAL:
                    fechaActual = this.sumarRestarMesesFecha(fechaActual, 1);
                    fechas.add(fechaActual);
                    break;
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


    //Para generar 1 entrega por cada fecha (estas se agregan al pedido)
    private ArrayList<Entrega> generarEntregas(ArrayList<Date> fechas) {
        ArrayList<Entrega> entregas = new ArrayList<>();
        for(Date unaFecha : fechas) {
            Entrega nuevaEntrega = new Entrega(unaFecha);
            entregas.add(nuevaEntrega);
        }
        return entregas;
    }


    //Para generar el id del pedido
    private String generarNuevoId() {
        return UUID.randomUUID().toString();
    }



/*

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
    }*/
}
