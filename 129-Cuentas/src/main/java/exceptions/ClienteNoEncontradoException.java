package exceptions;

public class ClienteNoEncontradoException extends RuntimeException {

    public ClienteNoEncontradoException() {
        super();
    }
    public ClienteNoEncontradoException(String message) {
        super(message);
    }

}
