package chapter2.section2.part15.test2;



public class TestClass1 {
 	public void method1(TestClass2 class2){
		String threadName=Thread.currentThread().getName();
		synchronized (class2) {
			System.out.println(threadName+" 进入InnerClass1类中的method1方法");
			for(int i=0;i<10;i++){
				System.out.println("i= "+i);
				try{
					Thread.sleep(100);
				}catch(InterruptedException e){
					
				}
			}
			System.out.println(threadName+"离开 InnerClass1类中的method1方法");
		}
	}
	
	
    public synchronized void method2(){
    	String threadName=Thread.currentThread().getName();
    	System.out.println(threadName+" 进入InnerClass1类中的method2方法");
    	for(int j=0;j<10;j++){
    		System.out.println("j= "+j);
			try{
				Thread.sleep(100);
			}catch(InterruptedException e){
				
			}
		}
		System.out.println(threadName+"离开 InnerClass1类中的method2方法");
		
    }
}
