package domain;

public class Simple implements Base {

    private String nombre;
    private int personal;
    private int ambulanciasDisponibles;
    private int tiempoAsistencia;

    @Override
    public int cantAmbulancias() {
        return this.ambulanciasDisponibles;
    }

    @Override
    public int tiempoMedioAsistencia() {
        return this.tiempoAsistencia;
    }

    @Override
    public int cantidadDeBasesSimples() { //Esto no me gusta. Se puede hacer distinto. Como no lo pedia la consigna no importa en realidad, lo hice para hacer un par mas de tests
        return 1;
    }


    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setPersonal(int personal) {
        this.personal = personal;
    }
    public void setAmbulanciasDisponibles(int ambulanciasDisponibles) {
        this.ambulanciasDisponibles = ambulanciasDisponibles;
    }
    public void setTiempoAsistencia(int tiempoAsistencia) {
        this.tiempoAsistencia = tiempoAsistencia;
    }

    public Simple(String n, int p, int a, int t) {
        this.setNombre(n);
        this.setPersonal(p);
        this.setAmbulanciasDisponibles(a);
        this.setTiempoAsistencia(t);
    }

}
