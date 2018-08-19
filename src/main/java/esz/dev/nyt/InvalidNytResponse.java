package esz.dev.nyt;

public class InvalidNytResponse extends Exception {
    public InvalidNytResponse(String message) {
        super(message);
    }
}
