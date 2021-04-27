/**
 * 
 */
package ADTLinkedString;

import ADTLinkedStringException.LinkedStringException;
import ADTLinkedStringException.NullNodeAccessException;

/**
 * @author John
 * @version 1.0
 * This is a project to demonstrate doubly Linked Lists/Strings
 */
public class DoublyLinkedString implements ADTLinkedString {
	
	private Node<Character> head;
	
	private int count = 0;
	
	public DoublyLinkedString() {
		
	}
	
	public DoublyLinkedString(char[] str) {
		
		
		Node<Character> previousNode = null;
		Node<Character> nextNode = null;
		
		for(int i= 0; i<str.length; i++) {//start setprevious for-loop
			if(head==null)
			{
				head = new Node<Character>(str[i], null, null);
				previousNode = head;
				count++;
			}
		
			else {
				
				nextNode = new Node<Character>(str[i], null, previousNode);
				try {
					get(i-1).setNext(nextNode);
				} catch (LinkedStringException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				previousNode = nextNode;
				count++;
			}
			
		}//end setprevious for-loop
		


		
	}
	
	public DoublyLinkedString(DoublyLinkedString str) {
		this.head = new Node<Character>(str.head);
		this.count = str.length();
	}
	
	public DoublyLinkedString(String str) {
		
		char[] chars = str.toCharArray();
		
		Node<Character> previousNode = null;
		Node<Character> nextNode = null;
		
		for(int i= 0; i<chars.length; i++) {//start setprevious for-loop
			if(head==null)
			{
				head = new Node<Character>(chars[i], null, null);
				previousNode = head;
				count++;
			}
		
			else {
				
				nextNode = new Node<Character>(chars[i], null, previousNode);
				try {
					get(i-1).setNext(nextNode);
				} catch (LinkedStringException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				previousNode = nextNode;
				count++;
			}
			
		}//end setprevious for-loop
		


	}

	@Override
	public char charAt(int pos) throws LinkedStringException {
		// TODO Auto-generated method stub
		char charAt;
		if(this.get(pos).getElement() instanceof Character) {
		charAt = (char) get(pos).getElement();
		return charAt;}
		
		else {
			throw new LinkedStringException();
			}
	}

	@Override
	public DoublyLinkedString concat(DoublyLinkedString str) {
		// TODO Auto-generated method stub
//		int newCount = count + str.length();
//		
//		DoublyLinkedString returnValue = new DoublyLinkedString(this);
//		
//		try {
//			returnValue.get(count-1).setNext(str.head);
//		} catch (LinkedStringException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//		try {
//			str.head.setPrevious(returnValue.get(count-1));
//		} catch (LinkedStringException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		returnValue.count = newCount;		
//		return returnValue;
		
		
		return new DoublyLinkedString(this.toString() + str.toString());
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return (head==null);
	}

	@Override
	public int length() {
		// TODO Auto-generated method stub
		return count;
	}

	@Override
	public DoublyLinkedString subString(int start, int end) throws LinkedStringException, NullNodeAccessException {
		// TODO Auto-generated method stub
		try {
		if(start<0 || end>this.count)
		{
			throw new LinkedStringException("The indicies "+start+" or "+end+" are illegal inputs."); 
		}
		
		else {
			int i = start;
			String str = "";
			while(i <= end)
			{
				if(this.get(i).getElement() == null)
				{
					throw new NullNodeAccessException();
				}
				str+= (char)this.get(i).getElement();
				i++;
			}
			return new DoublyLinkedString(str);
		}	
		}catch(NullPointerException e) {throw new NullNodeAccessException();}
	}
	@Override
	public Node<Character> get(int index) throws LinkedStringException, NullNodeAccessException {
		// TODO Auto-generated method stub
		if(index==0)return head;
		else {
			if(index>this.count)
				throw new LinkedStringException();
			
			Node<Character> temp = head;
			for(int i=0; i<index; i++) {
				temp=temp.getNext();
			}
			return temp;
		}
		
	}
	@Override
	public String toString() {
		int i = 0;
		String str = "";
		while(i < count)
		{
			try {
				str+= (char)this.get(i).getElement();
			} catch (LinkedStringException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			i++;
		}
		return str;
	}

}
