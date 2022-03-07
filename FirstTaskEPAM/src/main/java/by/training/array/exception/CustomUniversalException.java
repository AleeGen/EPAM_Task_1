package by.training.array.exception;

public class CustomUniversalException extends Exception {
    public CustomUniversalException() {
        super();
    }

    public CustomUniversalException(String message) {
        super(message);
    }

    public CustomUniversalException(Exception e) {
        super(e);
    }

    public CustomUniversalException(String message, Exception e) {
        super(message, e);
    }
}
