package pack;

public class MyDoubleNode<T> {
	public T Data; //data type of T, use T to get to this Data of the node
	public MyDoubleNode<T> NextNode;
	public MyDoubleNode<T> PreviousNode;
	
	public MyDoubleNode() {
		NextNode = null;
		PreviousNode = null;
	}
	
	public MyDoubleNode(T data){
		this.Data = data; //passing in a variable of type T to this constructor
		this.NextNode = null;
		this.PreviousNode = null;
	}

}