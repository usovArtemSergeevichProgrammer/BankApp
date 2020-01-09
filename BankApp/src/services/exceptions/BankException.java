package services.exceptions;

public class BankException extends Exception {
    
    /**
	 * 
	 */
	private static final long serialVersionUID = -1756231319360154964L;
	private int status;
    
    public int getStatus() {
        return status;
    }
    
    public BankException(String msg, int status) {
        super(msg);
        this.status = status;
    }

    public BankException() {
        super();
    }

    public BankException(String message, Throwable cause, int status) {
        super(message, cause);
        this.status = status;

    }
}
