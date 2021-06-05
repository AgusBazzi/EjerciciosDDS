package domain;

import java.util.ArrayList;

public class Articulo {

    private int codArticulo;
    private int stock;
    private ArrayList<Envase> envasesDisponibles = new ArrayList<>();
    private TipoArticulo tipoArticulo;

    public int getCodArticulo() {
        return codArticulo;
    }

    public void setCodArticulo(int unCodArticulo){
        this.codArticulo = unCodArticulo;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public ArrayList<Envase> getEnvasesDisponibles() {
        return envasesDisponibles;
    }

    public void setEnvasesDisponibles(Envase unEnvase){
        envasesDisponibles.add(unEnvase);
    }
}

