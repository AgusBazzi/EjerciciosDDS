package domain;

public class ArtPedido {

    private int codArticulo;
    private int cantidad;
    private float toleranciaDiametro;
    private float toleranciaAncho;
    private float toleranciaLargo;
    private Envase envase;

    public ArtPedido(int codArticulo, int cantidad, float toleranciaDiametro, float toleranciaAncho, float toleranciaLargo, Envase envase) {
        this.codArticulo = codArticulo;
        this.cantidad = cantidad;
        this.toleranciaDiametro = toleranciaDiametro;
        this.toleranciaAncho = toleranciaAncho;
        this.toleranciaLargo = toleranciaLargo;
        this.envase = envase;
    }
}
