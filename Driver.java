package pack;

import java.util.Random;

public class Driver {

	public static void main(String[] args) {
		MyDoublyLinkedList<Integer> newList = new MyDoublyLinkedList<Integer>();
		Random rand = new Random();
		
		/*for(int i = 0; i < 10; i++) {
			newList.Append(RandomNumberGenerator(rand));
		}*/
		newList.Append(3);
		newList.Append(7);
		newList.Append(1);
		newList.Append(9);
		newList.Append(16);
		newList.Append(6);
		newList.Append(2);
		
		System.out.println("Original list: " + newList.Print());
		System.out.println();
		System.out.println("Reversed list: " + newList.PrintReverse());
		System.out.println();
		
		newList.Prepend(RandomNumberGenerator(rand));
		System.out.println("Prepend list: " + newList.Print());
		System.out.println();
		
		newList.Append(RandomNumberGenerator(rand));
		System.out.println("Append on top of the prepend list: " + newList.Print());
		System.out.println();
		
		System.out.println("Length of list: " + newList.GetLength());
		System.out.println();
		
		System.out.println("List empty? " + newList.IsEmpty());
		System.out.println();
		
		newList.InsertAfter(1, RandomNumberGenerator(rand));
		System.out.println("Insert after list: " + newList.Print());
		System.out.println();
		
		newList.RemoveAfter(16); //also implements Search
		System.out.println("Remove after list: " + newList.Print());
		System.out.println();
		
		System.out.println("Trying to remove: 7");
		System.out.println("Did the number exist able to be removed? " + newList.Remove(7));
		System.out.println("List after removal of items if possible: " + newList.Print());
		System.out.println();
		System.out.println();
		
		/*newList.Sort();
		System.out.println("Sorted list: " + newList.Print());*/
		
		Stack myStack = new Stack();
		
		myStack.Append(5);
		myStack.Append(9);
		myStack.Append(3);
		myStack.Append(17);
		myStack.Append(524);
		myStack.Append(6);
		myStack.Append(8);
		System.out.println("Orginial stack: " + myStack.Print());
		System.out.println();
		
		myStack.push(12);
		System.out.println("Pushed stack: " + myStack.Print());
		System.out.println();
		
		myStack.pop();
		System.out.println("Popped stack: " + myStack.Print());
		System.out.println();
		
		MyDoubleNode<Integer> resultNode = myStack.peek();
		System.out.println("Peek stack: " + resultNode.Data);
		System.out.println();
		
		System.out.println("Stack empty? " + myStack.isEmpty());
		System.out.println();
		
		System.out.println("Length of stack: " + myStack.getLength());
		System.out.println();
		System.out.println();
		
		Queue myQueue = new Queue();
		
		myQueue.Append(18);
		myQueue.Append(25);
		myQueue.Append(3);
		myQueue.Append(29);
		myQueue.Append(46);
		myQueue.Append(356);
		myQueue.Append(17);
		myQueue.Append(1828);
		
		myQueue.enqueue(22);
		System.out.println("Enqueued queue: " + myQueue.Print());
		System.out.println();
		
		myQueue.dequeue();
		System.out.println("Dequeued queue: " + myQueue.Print());
		System.out.println();
		
		resultNode = myQueue.peek();
		System.out.println("Peek queue: " + resultNode.Data);
		System.out.println();
		
		System.out.println("Queue empty? " + myQueue.isEmpty());
		System.out.println();
		
		System.out.println("Length of queue: " + myQueue.getLength());
		System.out.println();
		System.out.println();
	}
	
	public static int RandomNumberGenerator(Random r) {
		int minRange = 1;
		int maxRange = 100;
		int randomRange = r.nextInt(maxRange - minRange + 1) + minRange;
		//System.out.println("Adding: " + randomRange);
		return randomRange;
	}

}