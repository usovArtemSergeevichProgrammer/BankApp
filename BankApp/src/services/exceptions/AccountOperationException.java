package services.exceptions;

public class AccountOperationException extends BankException{
    
    

    /**
	 * 
	 */
	private static final long serialVersionUID = -4435211311036095450L;

	public AccountOperationException() {
        super();
    }

    public AccountOperationException(String message, Throwable cause, int status) {
        super(message, cause, status);
        
    }

    public AccountOperationException(String msg, int status) {
        super(msg, status);
        
        
    }

	

}
