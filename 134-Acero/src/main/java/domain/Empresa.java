package domain;

import exceptions.ArticuloNoEncontradoException;

import java.util.ArrayList;

public class Empresa {

    private static ArrayList<Articulo> articulos;
    private static ArrayList<Integer> clientes;

    public Boolean validarCliente(int codCli){
        return clientes.contains(codCli);
    }

    public Articulo buscarArticuloSegun(int cod_articulo) {
        return articulos.stream()
                .filter( articulo -> articulo.getCodArticulo() == cod_articulo)
                .findFirst()
                .orElseThrow( () -> new ArticuloNoEncontradoException(String.format("No existe un articulo con el codigo %d", cod_articulo)));
    }
}
