package vista;

import control.Planificador;
import domain.Empresa;

import java.io.IOException;
import java.util.Scanner;

public class Interfaz {

    public static void main(String[] args) throws IOException {

        //Instancio el planificador
        Planificador planificador = Planificador.getInstance();

        // Para el menú
        Scanner sc = new Scanner(System.in);
        int cod_cliente;

        System.out.println("Ingrese su codigo de cliente:");
        cod_cliente = sc.nextInt();
        sc.nextLine(); // El nextInt() no consume el cambio de linea. Lo consumo aca sino el proximo nextLine() en case 1 no funcionaria pues agarraria este barra n que dejo el nextInt()



    }
}
