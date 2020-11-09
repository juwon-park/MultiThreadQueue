package MultiThreadLab;

public class Queue {
	
	
	static final int MAX_SIZE = 5;
	
	private int front=0;	//�������� ����� ���
	private int rear=0;		//�������� �Է��� ���
	
	int[] queue = new int[MAX_SIZE];	
	
		
	synchronized void enqueue(int data)
	{		
		if((rear+1) == front)
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		rear = (rear + 1) % MAX_SIZE;
		queue[rear] = data;
	
		notifyAll();	
		
		System.out.print("insert �� �� : " + data + " ");		
		displayQueue();
	}
	
	synchronized int dequeue() 	
	{			
		if(front == rear)
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
		front = (front + 1) % MAX_SIZE;
		int data = queue[front]; //���� ������	
		
		notifyAll();
		
		System.out.print("delete �� �� : " + data+ " ");		
		displayQueue();
					
		return data;
	}
	
	void displayQueue() 
	{	
		System.out.print("{ ");
		for(int i=0 ; i<MAX_SIZE ; i++) 
		{
			System.out.print(queue[i]+" ");			
		}
		System.out.println("} ");
	}
		
}
