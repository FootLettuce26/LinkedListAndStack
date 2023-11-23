package pack;

public interface iQueue {
	public <T> void enqueue(T data);
	
	public <T> T dequeue();
	
	public <T> T peek();
	
	public boolean isEmpty();
	
	public int getLength();
	
	
}
