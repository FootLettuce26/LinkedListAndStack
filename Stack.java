package pack;

public class Stack extends MyDoublyLinkedList<Integer> implements iStack {

	@Override
	public <T> void push(T data) {
		MyDoubleNode<Integer> thisNode = new MyDoubleNode<Integer>();
		thisNode.Data = (Integer)data;
		this.Prepend(thisNode.Data);
	}

	@Override
	public <T> T pop() {
		MyDoubleNode<Integer> thisNode = this.Head;
		T result = (T)thisNode.Data;
		this.Remove(thisNode.Data);
		//will return null if there is nothing there, no need for conditional
		return result;
	}

	@Override
	public <T> T peek() {
		MyDoubleNode<Integer> thisNode = this.Head;
		return (T)thisNode;
	}

	@Override
	public boolean isEmpty() {
		MyDoubleNode<Integer> thisNode = this.Head;
		if(thisNode == null) {
			return true;
		}
		return false;
	}

	@Override
	public int getLength() {
		int count = 0;
		MyDoubleNode<Integer> thisNode = this.Head;
		while(thisNode.NextNode != null) {
			thisNode = thisNode.NextNode;
			count++;
		}
		return count + 1;
	}

}
