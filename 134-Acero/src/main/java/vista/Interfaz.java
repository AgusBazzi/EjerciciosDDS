package vista;

import control.Planificador;
import domain.Envase;
import exceptions.EnvaseNoEncontradoException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Interfaz {

    public static void main(String[] args) throws IOException {

        //Instancio el planificador
        Planificador planificador = Planificador.getInstance();

        // Para el menú
        Scanner sc = new Scanner(System.in);
        int cod_cliente;
        Date fechaPrimerEntrega;
        int cantEntregas;
        int period;

        int clienteValidado = 0;
        while(clienteValidado!= 1){
            System.out.println("\tIngrese su codigo de cliente:");
            cod_cliente = sc.nextInt();
            sc.nextLine();

            if(planificador.validarCliente(cod_cliente)){
                clienteValidado = 1;
            }
        }


        //TODO: Ingrese la fecha de la primera entrega

        System.out.println("\tIngrese la cantidad de entregas:");
        cantEntregas = sc.nextInt();
        sc.nextLine();

        System.out.println("\tIngrese la periodicidad de las entregas: (0:UNICAVEZ, 1:SEMANAL, 2:MENSUAL)");
        period = sc.nextInt();
        sc.nextLine();
        //TODO: Pasar period a Enum
        sc.nextLine();

        ArrayList<Date> fechas = planificador.planificar(cod_cliente, fechaPrimerEntrega, cantEntregas, period);

        for(Date unaFecha: fechas){
            int selec = 1;
            int cod_articulo;
            float tolAncho;
            float tolDiametro;
            float tolLargo;
            int cantidad;


            while(selec != 0){
                System.out.print("\tIngrese el codigo de un articulo para la entrega de la fecha: " + unaFecha);
                cod_articulo = sc.nextInt();
                sc.nextLine();

                System.out.print("\tIngrese la tolerancia en ancho de este articulo para la entrega de la fecha: " + unaFecha);
                tolAncho = sc.nextInt();
                sc.nextLine();

                System.out.print("\tIngrese la tolerancia en diametro de este articulo para la entrega de la fecha: " + unaFecha);
                tolDiametro = sc.nextInt();
                sc.nextLine();

                System.out.print("\tIngrese la tolerancia en largo de este articulo para la entrega de la fecha: " + unaFecha);
                tolLargo = sc.nextInt();
                sc.nextLine();

                System.out.print("\tIngrese la cantidad de este articulo para la entrega de la fecha: " + unaFecha);
                cantidad = sc.nextInt();
                sc.nextLine();

                ArrayList<Envase> envasesDisponibles = planificador.buscarEnvasesDisponiblesParaElProducto(cod_articulo);
                System.out.println("\tEstos son los envases para ese articulo. Elija uno: ");
                for(Envase unEnvase : envasesDisponibles){
                    //System.out.print("\tEnvase: ", (String)unEnvase.capacidad()); TODO: Buscar como se muestra un enum por pantalla
                }
                String envaseElegido = sc.nextLine();



                Envase envase = envasesDisponibles.stream()
                        .filter(unEnvase -> unEnvase.getCapacidad().equals(envaseElegido)).findFirst() //TODO: Buscar como comparar enums
                        .orElseThrow( () -> new EnvaseNoEncontradoException(String.format("No existe un envase con la capacidad %s", envaseElegido)));

                planificador.generarArtPedido(envase, cod_articulo, cantidad, tolDiametro, tolAncho, tolLargo, unaFecha);

                System.out.print("\t¿Desea ingresar otro articulo para esta fecha? 1:SI , 0:NO");
                selec = sc.nextInt();
                sc.nextLine();
            }

        }

        int idPedido = planificador.buscarIdDelPedido();
        System.out.print("\tSe creó el pedido. El identificador es: " + idPedido);
    }

}
