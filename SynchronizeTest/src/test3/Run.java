package test3;

public class Run {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
         MyThread thread=new MyThread();
         thread.start();
         Thread.sleep(1000);
         thread.interrupt();
         System.out.println("!!!!!!!!!!!!!!!!!!!是否停止1："+thread.interrupted());
         System.out.println("是否停止2："+thread.interrupted());
         System.out.println("end");
	}

}
