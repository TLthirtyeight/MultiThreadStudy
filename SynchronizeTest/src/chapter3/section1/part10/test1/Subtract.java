package chapter3.section1.part10.test1;

public class Subtract {
     private String lock;
     public Subtract(String lock){
    	 super();
    	 this.lock=lock;
     }
     public void subtract(){
    	 
    	 try{
    		 synchronized (lock) {
    				if(ValueObject.list.size()==0){
    					System.out.println("wait begin ThreadName="+Thread.currentThread().getName());
    				        lock.wait();
    				    	System.out.println("wait end ThreadName="+Thread.currentThread().getName());
    				    
    				    	System.out.println("再次wait="+Thread.currentThread().getName());
    				        lock.wait(2000);
    				     
    				
    				}
    				
    				ValueObject.list.remove(0);
    				System.out.println("list size"+ValueObject.list.size());
    			}
    	 }catch(Exception e){
    		 e.printStackTrace();
    	 }
    
     }
}
