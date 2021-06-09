package domain;

import exceptions.ArticuloNoEncontradoException;

import java.util.ArrayList;

public class Empresa {

    private static ArrayList<Articulo> articulos;
    private ArrayList<Integer> clientes = new ArrayList<>();
    private ArrayList<Pedido> pedidos = new ArrayList<>();

    public Boolean validarCliente(int codCli){
        this.clientes.add(3);
        return clientes.contains(codCli);
    }

    public Articulo buscarArticuloSegun(int cod_articulo) {
        return articulos.stream()
                .filter( articulo -> articulo.getCodArticulo() == cod_articulo)
                .findFirst()
                .orElseThrow( () -> new ArticuloNoEncontradoException(String.format("No existe un articulo con el codigo %d", cod_articulo)));
    }

    public void agregarPedido(Pedido unPedido) {
        this.pedidos.add(unPedido);
    }

}
