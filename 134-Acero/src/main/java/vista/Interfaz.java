package vista;

import control.Planificador;
import domain.Envase;
import domain.Periodicidad;
import exceptions.EnvaseNoEncontradoException;

import java.io.IOException;
import java.text.ParseException;
import java.time.Period;
import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

// agrego estos
import java.text.SimpleDateFormat;

public class Interfaz {

    public static void main(String[] args) throws IOException {

        Planificador planificador = Planificador.getInstance();
        Scanner sc = new Scanner(System.in);
        int cod_cliente = 0;
        Date fechaPrimerEntrega = null;
        int cantEntregas;
        Periodicidad period = null;


        // 1) UI pide el codigo al cliente y el planificador valida al cliente
        Boolean validado = false;
        while (!validado) {
            System.out.print("\nIngrese su codigo de cliente: ");
            try {
                cod_cliente = sc.nextInt();
                sc.nextLine();
                if(planificador.validarCliente(cod_cliente)) {
                    validado = true;
                } else {
                    System.out.print("Codigo invalido\n");
                }
            } catch (InputMismatchException e) { // por si ingresa algo no numerico. Hago esta validacion aca porque lo considero tarea de la interfaz
                System.out.print("Error: el codigo ingresado solo debe contener caracteres numericos\n");
                sc.next();
            }
        }


        // 2) UI pide ingresar fecha de la primera entrega al cliente
        validado = false;
        while(!validado) {
            System.out.print("\nIngrese la fecha de la primera entrega en formato dd/mm/aaaa: ");
            String stringDate = sc.next();
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            try {
                fechaPrimerEntrega = formato.parse(stringDate);
                validado = true;
            } catch (ParseException e) {
                //e.printStackTrace();
                System.out.print("Error: utilice el formato dd/mm/aaaa\n");
            }
        }


        // 3) UI pide ingresar cantidad de entregas y la periodicidad de las mismas
        //YA SE QUE ACA NO VALIDO SI ES UN NRO O NO PERO ES LO MISMO DE SIEMPRE. TODO
        System.out.print("\nIngrese la cantidad de entregas: ");
        cantEntregas = sc.nextInt();
        sc.nextLine();

        validado = false;
        while(!validado) {
            System.out.print("\nIngrese la periodicidad de las entregas: (0: UNICA VEZ, 1: SEMANAL, 2: MENSUAL): ");
            try {
                int selec = sc.nextInt();
                sc.nextLine();
                switch (selec) {
                    case 0:
                        period = Periodicidad.UNICAVEZ;
                        validado = true;
                        break;
                    case 1:
                        period = Periodicidad.SEMANAL;
                        validado = true;
                        break;
                    case 2:
                        period = Periodicidad.MENSUAL;
                        validado = true;
                    default:
                        System.out.print("Error: el numero ingresado debe ser 0 - 1 - 2\n");
                }
            } catch (InputMismatchException e) {
                System.out.print("Error: debe ingresar un caracter numerico\n");
                sc.next();
            }
        }

        //ArrayList<Date> fechas = planificador.planificar(cod_cliente, fechaPrimerEntrega, cantEntregas, period);
        
/*
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

 */

    }

}
