package exceptions;

public class WrongParameterException extends Exception {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7033780911137701791L;

	public WrongParameterException() {
		super();
	}
	
	public WrongParameterException(String info) {
		super(info);
	}
}
