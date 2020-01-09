package services.exceptions;

public class ClientOperationException extends BankException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6284655278867872272L;

	public ClientOperationException() {
		super();
		
	}

	public ClientOperationException(String msg, int status) {
		super(msg, status);
		
	}

	public ClientOperationException(String message, Throwable cause, int status) {
		super(message, cause, status);
		
	}

}
