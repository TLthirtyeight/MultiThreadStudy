package chapter1.setion7.part4.test1;

public class MyThread extends Thread{
    public void run(){
    	super.run();
    	try{
    		System.out.println("run begin");
    		Thread.sleep(200000);
    	}catch(InterruptedException e){
    		System.out.println("在沉睡中被停止！ 进入catch  "+this.isInterrupted());
    		e.printStackTrace();
    	}
    }
	
}
