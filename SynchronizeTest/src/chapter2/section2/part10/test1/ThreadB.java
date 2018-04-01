package chapter2.section2.part10.test1;

public class ThreadB extends Thread{
	  private Service service;
      public ThreadB(Service service){
    	  super();
    	  this.service=service;
      }
      
      public void run(){
    	  service.print("AA");
      }
}
