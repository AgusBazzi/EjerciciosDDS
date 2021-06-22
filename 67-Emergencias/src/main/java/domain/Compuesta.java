package domain;

import java.util.List;

public class Compuesta implements Base {

    private String nombre;
    private List<Base> bases;

    @Override
    public int cantAmbulancias() {
        return this.bases.stream().mapToInt(unaBase -> unaBase.cantAmbulancias()).sum();
    }

    @Override
    public int tiempoMedioAsistencia() {
        return this.bases.stream().mapToInt(unaBase -> unaBase.tiempoMedioAsistencia()).sum() / this.bases.size();
    }

    @Override
    public int cantidadDeBasesSimples() {
        return this.bases.stream().mapToInt(unaBase -> unaBase.cantidadDeBasesSimples()).sum();
    }


    //Otros metodos
    private int tiempoDeEsperaTotal() {
        return this.bases.stream().mapToInt(unaBase -> unaBase.tiempoMedioAsistencia()).sum();
    }

    public void addBase(Base unaBase) {
        this.bases.add(unaBase);
    }

    public void eliminarBase(Base unaBase) {
        this.bases.remove(unaBase);
    }


    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setBases(List<Base> bases) {
        this.bases = bases;
    }

    public Compuesta(String n, List<Base> b) {
        this.setNombre(n);
        this.setBases(b);
    }

}
