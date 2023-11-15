package pack;

import java.util.ArrayList;

public class MyDoublyLinkedList<T> {
	public MyDoubleNode<T> Head;
	public MyDoubleNode<T> Tail;
	public int Size;
	
	public MyDoublyLinkedList() {
		this.Head = null;
		this.Tail = null;
		this.Size = 0;
	}
	
	//insert after
	public void InsertAfter(T x, T y) {
		MyDoubleNode<T> cNode = Search(x);
		MyDoubleNode<T> nNode = cNode.NextNode;
		MyDoubleNode<T> newNode = new MyDoubleNode<T>(y);
		cNode.NextNode = newNode;
		newNode.NextNode = nNode;
		newNode.PreviousNode = cNode;
		if (nNode != null) {
			nNode.PreviousNode = newNode;
		}
		this.Size++;
	}
	
	
	//remove after
	public void RemoveAfter(T x) {
		MyDoubleNode<T> node = Search(x);
		if (node.NextNode == null) {
			return;
		}
		MyDoubleNode<T> cNode = node.NextNode;
		MyDoubleNode<T> nNode = cNode.NextNode;
		//delete cNode
		cNode.NextNode = null;
		cNode.PreviousNode = null;
		
		node.NextNode = nNode;
		nNode.PreviousNode = node;
		this.Size--;
	}
	
	
	//search
	public MyDoubleNode<T> Search(T tar){
		MyDoubleNode<T> current = this.Head;
		while(current != null) {
			if (current.Data.equals(tar)) {
				return current;
			}
			current = current.NextNode;
		}
		return null;
	}
	
	public void Append(T tar) {
		MyDoubleNode<T> node = new MyDoubleNode<T>(tar);
		//when there is no node there
		if (this.Head == null) {
			this.Head = node;
			this.Tail = node;
		}
		this.Tail.NextNode = node;
		node.PreviousNode = this.Tail;
		this.Tail = node;
		this.Size++;
	}
	
	public void Prepend(T tar) {
		MyDoubleNode<T> node = new MyDoubleNode<T>(tar);
		if (this.Head == null) {
			this.Head = node;
			this.Tail = node;
		}
		MyDoubleNode<T> headNode = this.Head;
		this.Head = node;
		node.NextNode = headNode;
		headNode.PreviousNode = node;
		this.Size++;
	}
	
	public String Print() {
		MyDoubleNode<T> currNode = this.Head;
		String result = "";
		while(currNode != null) {
			result += currNode.Data + " ";
			currNode = currNode.NextNode;
		}if(result.length() == 0) {
			return "There is nothing here!";
		}else {
			return result;
		}
		
	}
	
	public String PrintReverse() {
		MyDoubleNode<T> currNode = this.Head;
		String result = "";
		while(currNode != null) {
			//this line is the only difference between this and Print()
			result = currNode.Data + " " + result; 
			currNode = currNode.NextNode;
		}if(result.length() == 0) {
			return "There is nothing here!";
		}else {
			return result;
		}
		
	}
	
	public boolean Remove(T x) {
	    MyDoubleNode<T> currNode = this.Head;

	    // if the node that needs to be removed is the head
	    if (currNode != null && currNode.Data == x) {
	        this.Head = currNode.NextNode;
	        return true;
	    }

	    // Search for the node with the value x
	    while (currNode != null && currNode.NextNode != null) {
	    	MyDoubleNode<T> nextNode = currNode.NextNode;
	        if (nextNode.Data == x) {
	            // Found the node to remove
	            currNode.NextNode = nextNode.NextNode;
	            return true;
	        }
	        currNode = nextNode;
	    }

	    // Node with value x not found
	    return false;
	}

	
	public boolean IsEmpty() {
		MyDoubleNode<T> currNode = this.Head;
		if(currNode != null) {
			return false;
		}else {
			return true;
		}
	}
	
	public int GetLength() {
		int count =  0;
		MyDoubleNode<T> currNode = this.Head;
		while(currNode.NextNode != null) {
			currNode = currNode.NextNode;
			count++;
		}
		return count + 1;
	}
	
	/*public void Sort() {
		MyDoubleNode<T> smallestNode = this.Head;
		MyDoubleNode<T> currNode = this.Head;
		MyDoubleNode<T> nextNode = currNode.NextNode;
		ArrayList<MyDoubleNode<T>> resultList = new ArrayList<MyDoubleNode<T>>();
		while(nextNode != null) {
			if(nextNode.Data < smallestNode.Data) {
				smallestNode = nextNode;
			}
			currNode = currNode.NextNode;
			nextNode = currNode.NextNode;
		}
		
		resultList.add(smallestNode);
		Remove(smallestNode.Data);
		smallestNode.NextNode = null;
	}*/
}