package chapter3.section1.part11;

public class ThreadP extends Thread {
       private P p;
       
       public ThreadP(P p){
    	   super();
           this.p=p;  
       }
       
       @Override
       public void run(){
    	   while(true){
    		   p.setValue();
    	   }
       }
     
}
