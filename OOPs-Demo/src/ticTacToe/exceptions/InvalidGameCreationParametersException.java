package ticTacToe.exceptions;

public class InvalidGameCreationParametersException extends RuntimeException{
    public InvalidGameCreationParametersException() {
    }

    public InvalidGameCreationParametersException(String message) {
        super(message);
    }

    public InvalidGameCreationParametersException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidGameCreationParametersException(Throwable cause) {
        super(cause);
    }

    public InvalidGameCreationParametersException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
