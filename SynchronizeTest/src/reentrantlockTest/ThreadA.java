package reentrantlockTest;

import java.util.concurrent.locks.ReentrantLock;

public class ThreadA extends Thread {
     private ReentrantLock lock;
     
     public  ThreadA(ReentrantLock l) {
		// TODO Auto-generated constructor stub
    	 this.lock=l;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		lock.lock();
		for(int i=0;i<500;i++){
			System.out.println("Thread-A "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		lock.unlock();
		
	}

	
	
}
