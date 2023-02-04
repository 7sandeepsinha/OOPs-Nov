package parkingLot.exception;

public class NoParkingSpotAvailableException extends RuntimeException{
    public NoParkingSpotAvailableException() {
    }

    public NoParkingSpotAvailableException(String message) {
        super(message);
    }

    public NoParkingSpotAvailableException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoParkingSpotAvailableException(Throwable cause) {
        super(cause);
    }

    public NoParkingSpotAvailableException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
