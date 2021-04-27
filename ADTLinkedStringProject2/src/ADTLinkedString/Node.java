package ADTLinkedString;

public class Node<T> {
	
	private T element;
	private Node<T> next;
	private Node<T> previous;
	
	public Node(Node<T> node) {
		this.element = node.element;
		this.next = node.next;
		this.previous = node.previous;
	}

	public Node(T element, Node<T> Next, Node<T> Previous) {
		this.next = Next;
		this.previous = Previous;
		this.element = element;
	}

	public Node<T> getPrevious() {
		return previous;
	}

	public void setPrevious(Node<T> previous) {
		this.previous = previous;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}

	public T getElement() {
		return element;
	}

	public void setElement(T element) {
		this.element = element;
	}
}
