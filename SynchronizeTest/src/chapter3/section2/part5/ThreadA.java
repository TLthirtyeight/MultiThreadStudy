package chapter3.section2.part5;

public class ThreadA extends Thread{
     
	  private ThreadB b;
	  public ThreadA(ThreadB b){
		  super();
		  this.b=b;
	  }
	  
	  public void run(){
		  try{
			  synchronized (b) {
				b.start();
				Thread.sleep(6000);
			}
			  
		  }catch(InterruptedException e){
			  e.printStackTrace();
		  }
	  }
	
}
