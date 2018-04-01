package chapter2.section2.part15.test2;

public class TestClass2 {
 	public synchronized void method1(){
	  	String threadName=Thread.currentThread().getName();
    	System.out.println(threadName+" 进入InnerClass2类中的method1方法");
    	for(int k=0;k<10;k++){
    		System.out.println("k= "+k);
			try{
				Thread.sleep(100);
			}catch(InterruptedException e){
				
			}
		}
		System.out.println(threadName+"离开 InnerClass2类中的method1方法");
	
	}
}
