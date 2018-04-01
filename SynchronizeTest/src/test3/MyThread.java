package test3;

public class MyThread extends Thread {
    
	
	@Override
	public void run(){
		for(int i=0;i<500000;i++){
			System.out.println("i="+(i+1));
		}
	}
	synchronized public static void getValue1(){
		
	}
	
	synchronized static public void getValue() {
	    System.out.println("getValue method thread name="
	            + Thread.currentThread().getName() + " username=" + username
	            + " password=" + password);
	}
}
