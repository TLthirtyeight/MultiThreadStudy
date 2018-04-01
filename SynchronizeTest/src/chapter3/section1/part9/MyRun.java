package chapter3.section1.part9;

import reentrantlockTest.ThreadB;

public class MyRun {
     private String lock=new String("");
     private Runnable runnableA=new Runnable() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			try{
				synchronized (lock) {
					System.out.println("begin wait");
					lock.wait();
					System.out.println("end wait");
				}
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	};
	
	
    private Runnable runnableB=new Runnable() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			
				synchronized (lock) {
					System.out.println("begin wait");
					lock.notify();
					System.out.println("end wait");
				}
			
		}
	};
	
	public static void main(String[] args) {
		MyRun run=new MyRun();
	   
	    
	}
}
