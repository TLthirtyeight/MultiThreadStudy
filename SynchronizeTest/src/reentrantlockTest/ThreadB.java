package reentrantlockTest;

import java.util.concurrent.locks.ReentrantLock;

public class ThreadB extends Thread {
     private ReentrantLock lock;
     
     public  ThreadB(ReentrantLock l) {
		// TODO Auto-generated constructor stub
    	 this.lock=l;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		lock.lock();
		for(int i=0;i<100;i++){
			System.out.println("Thread-B "+i);
		}
		lock.unlock();
		
	}

	
	
}
