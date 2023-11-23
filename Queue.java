package pack;

public class Queue extends MyDoublyLinkedList<Integer> implements iQueue {

	@Override
	public <T> void enqueue(T data) {
		MyDoubleNode<Integer> thisNode = new MyDoubleNode<Integer>();
		thisNode.Data = (Integer) data;
		this.Append(thisNode.Data);
	}

	@Override
	public <T> T dequeue() {
		MyDoubleNode<Integer> thisNode = this.Head;
		T result = (T)thisNode.Data;
		this.Remove(thisNode.Data);
		
		return result;
	}

	@Override
	public <T> T peek() {
		MyDoubleNode<Integer> thisNode = this.Head;
		return (T)thisNode;
	}

	@Override
	public boolean isEmpty() {
		if(this.Head == null) {
			return true;
		}
		return false;
	}

	@Override
	public int getLength() {
		MyDoubleNode<Integer> thisNode = this.Head;
		int count = 0;
		while(thisNode.NextNode != null) {
			count++;
			thisNode = thisNode.NextNode;
		}
		return count + 1;
	}

}
