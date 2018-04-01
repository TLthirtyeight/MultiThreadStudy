package chapter3.section1.part11;

public class ThreadC  extends Thread{
    private C r;
    
    public ThreadC(C r){
 	   super();
        this.r=r;  
    }
    
    @Override
    public void run(){
 	   while(true){
 		  r.getValue();
 	   }
    }
}
