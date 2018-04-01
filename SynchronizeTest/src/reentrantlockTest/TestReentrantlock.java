package reentrantlockTest;

import java.util.concurrent.locks.ReentrantLock;

public class TestReentrantlock {
	
    public static void main(String[] args) throws InterruptedException {
    	ReentrantLock relock=new ReentrantLock();
    	ThreadA tA=new ThreadA(relock);
    	
    	ThreadB tb=new ThreadB(relock);
    	tA.start();
    	Thread.sleep(100);
    	tb.start();
	}      
	
          
           
}
