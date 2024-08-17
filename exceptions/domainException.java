package exceptions;

public class domainException extends RuntimeException{
    private static final long serialVersionUNID = 1L;

    public domainException(String msg){
        super(msg);
    }
}
