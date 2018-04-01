package test9;


class ThreadA extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("子线程"+System.currentTimeMillis());
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		System.out.println("子线程"+System.currentTimeMillis());
	}
	
	
}

public class Test {
     public static void main(String[] args) throws InterruptedException {
		ThreadA a=new ThreadA();
		a.start();
		System.out.println("主线程"+System.currentTimeMillis());
		
		//Thread.sleep(2000);
		
		System.out.println("主线程"+System.currentTimeMillis());
	}
}
