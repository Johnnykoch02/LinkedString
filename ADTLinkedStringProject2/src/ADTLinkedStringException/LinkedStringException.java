package ADTLinkedStringException;

public class LinkedStringException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Constructer for Exception LinkedStringException
	 * @param Message is Overriden Message for LinkedStringException
	 */
	public LinkedStringException(String Message) {
		super(Message);
	}
	/**
	 * Constructer for Exception LinkedStringException with default message
	 */
	public LinkedStringException() {
		super("You are trying to access an illegal pointer, please revise.");
	}
	
	

}
