package MultiThreadLab;

public class Delete extends Thread {
	
	Queue queue;

	Delete(Queue queue)
	{
		this.queue = queue;		
	}	

	public void run()
	{		
		//1�� �������� ť���� �׸��� �����Ѵ�.	 (100��)
		for(int i=0; i<100; i++) 
		{	
			 queue.dequeue();
			
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			
		}	
	}
}
