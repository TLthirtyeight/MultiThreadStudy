package chapter3.section1.part11;

public class C {
    private String lock;
    public C(String lock){
 	   super();
 	   this.lock=lock;
    }
    
    public void getValue(){
 	   try{
 		   synchronized (lock) {
 				while(ValueObject.value.equals("")){
 					System.out.println("消费者 "+Thread.currentThread().getName()+"WAITING了☆");
 					
 						lock.wait();
 					
 				}
 			//	System.out.println("消费者 "+Thread.currentThread().getName()+"RUNNABLE了");
				//	String value=System.currentTimeMillis()+"_"+System.nanoTime();
					ValueObject.value="";
					//lock.notifyAll();
					lock.notify();
 				
 				
 			}
 	   }catch(Exception e){
 		   
 	   }
 	
    }
}
