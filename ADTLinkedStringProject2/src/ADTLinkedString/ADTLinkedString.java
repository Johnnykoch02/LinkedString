/**
 * 
 */
package ADTLinkedString;

import ADTLinkedStringException.LinkedStringException;
import ADTLinkedStringException.NullNodeAccessException;

/**
 * @author John
 *
 */
public interface ADTLinkedString {
	/**
	 * This method returns type char of inputed int position
	 * @param pos is the specified position in DoublyLinkedString
	 * @return the Char at pos
	 * @throws LinkedStringException if pos is not in DoublyLinkedString
	 */
	public char charAt(int pos) throws LinkedStringException;
	
	/**
	 * This method adds two DL Strings together, and returns the new DoublyLinkedString
	 * @param str
	 * @return the newly created DoublyLinkedString
	 */
	public DoublyLinkedString concat(DoublyLinkedString str);
	
	/**
	 * This method will return a true/false of whether the LinkedString is Empty or not
	 * @return Boolean value regarding empty state
	 */
	public boolean isEmpty();
	
	/**
	 * This method returns an integer value of the size of the LinkedString
	 * @return int value of LS Size
	 */
	public int length();
	
	/**
	 * This method will return a new DoublyLinkedString from a previous LinkedString
	 * @param start is the starting index
	 * @param end is the ending  index
	 * @return the newly create DoublyLinkedString
	 * @throws LinkedStringException if indexes start or end is not in DoublyLinkedString
	 * @throws Custom nullpointer exception 
	 */
	public DoublyLinkedString subString(int start, int end) throws LinkedStringException, NullNodeAccessException;
	
	/**
	 * 
	 * @param index the specified index
	 * @return the Node in correlation with that specific index
	 * @throws LinkedStringException if index is not in DoublyLinkedString
	 * @throws custom nullpointer exception
	 */
	public Node<Character> get(int index) throws LinkedStringException, NullNodeAccessException;
	
	

}
