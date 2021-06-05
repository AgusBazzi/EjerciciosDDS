package exceptions;

public class ArticuloNoEncontradoException extends RuntimeException {
    public ArticuloNoEncontradoException(String message) {
        super(message);
    }

    public ArticuloNoEncontradoException() {
        super();
    }
}

