package cdx.olympp.war;

public class WarException extends RuntimeException {
    public WarException(String message) {
        super(message);
    }

    public WarException(String message, Throwable cause) {
        super(message, cause);
    }
}
