package chapter3.section2.part6;

public class ThreadA extends Thread{
     private ThreadB b;
     public ThreadA(ThreadB b){
    	 super();
    	 this.b=b;
     }
	public void run(){
		try{
			synchronized (b) {
				System.out.println("begin A ThreadName="+Thread.currentThread().getName()+" "+System.currentTimeMillis());
				Thread.sleep(5000);
				System.out.println("end A ThreadName="+Thread.currentThread().getName()+" "+System.currentTimeMillis());
					
			}
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
	
}
