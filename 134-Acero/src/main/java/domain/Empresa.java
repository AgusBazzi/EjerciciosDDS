package domain;

import java.util.ArrayList;

public class Empresa {

    private static ArrayList<Articulo> articulos;
    private static ArrayList<Integer> clientes;

    public Boolean validarCliente(int codCli){
        return clientes.contains(codCli);
    }
}
