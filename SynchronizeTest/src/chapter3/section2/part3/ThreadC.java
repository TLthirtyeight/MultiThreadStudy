package chapter3.section2.part3;

public class ThreadC extends Thread {
     private ThreadB threadB;
     public ThreadC(ThreadB threadB){
    	 super();
    	 this.threadB=threadB;
     }
	
     public void run(){
    	 threadB.interrupt();
     }
	
}
