package chapter3.section2.part3;

public class ThreadB extends Thread{
   
	public void run(){
	   try{
		   ThreadA a=new ThreadA();
		   a.start();
		   a.join();
		   System.out.println("线程B在run end处打印了");
	   }catch(InterruptedException e){
		   System.out.println("线程B在catch处打印了");
		    e.printStackTrace();
	   }
   }
}
