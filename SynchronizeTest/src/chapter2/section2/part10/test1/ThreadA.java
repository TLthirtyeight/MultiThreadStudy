package chapter2.section2.part10.test1;

public class ThreadA extends Thread {
      private Service service;
      public ThreadA(Service service){
    	  super();
    	  this.service=service;
      }
      
      public void run(){
    	  service.print("AA");
      }
}
