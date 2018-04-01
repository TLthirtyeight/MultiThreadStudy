package chapter3.section2.part5;

public class ThreadC extends Thread {

	  private ThreadB threadB;
	  public ThreadC(ThreadB threadB){
		  super();
		  this.threadB=threadB;
	  }
	  
	  public void run(){
		  threadB.bService();
	  }
	
}
