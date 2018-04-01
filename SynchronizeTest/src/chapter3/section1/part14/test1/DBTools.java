package chapter3.section1.part14.test1;

public class DBTools {
 //    private boolean prevIsA=false;
     private int accessright=0;
    synchronized public void backupA(){
    	try{
    		while(accessright!=0){
    			wait();
    		}
    		
    			System.out.println("A");
    		
    		accessright=1;
    		Thread.sleep(500);
    		notifyAll();
    		
    	}catch(InterruptedException e){
    		e.printStackTrace();
    	}
    }
    
    synchronized public void backupB(){
    	try{
    		
    		while(accessright!=1){
    			wait();
    		}
    	
    			System.out.println("B");
    		
    		accessright=2;
    		Thread.sleep(500);
    		notifyAll();
    	}catch(InterruptedException e){
    		e.printStackTrace();
    	}
    }
    
    synchronized public void backupC(){
    	try{
    		
    		while(accessright!=2){
    			wait();
    		}
    	
    			System.out.println("C");
    	       Thread.sleep(500);
    			accessright=0;
    		notifyAll();
    	}catch(InterruptedException e){
    		e.printStackTrace();
    	}
    }
    
}
