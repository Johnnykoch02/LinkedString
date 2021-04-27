package ADTLinkedStringException;

public class NullNodeAccessException extends NullPointerException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NullNodeAccessException(String Message) {
		super(Message);
	}
	
	public NullNodeAccessException() {
		super("You are trying to access a null node element.");
	}
}
