package MultiThreadLab;

public class Insert extends Thread{

	Queue queue;

	Insert(Queue queue)
	{
		this.queue = queue;		
	}	


	public void run()
	{		
		//1초 간격으로 임의의 정수값을 큐에 삽입한다. (100번)
		for(int i=0; i<100; i++) 
		{	
			queue.enqueue(i);			
	
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}	
	}
	
	
}



