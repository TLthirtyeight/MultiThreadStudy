package chapter3.section1.part11.testStackOnePMulC;

public class P_Thread extends Thread{
     private P p;
     public P_Thread(P p){
    	 super();
    	 this.p=p;
     }
     public void run(){
    	    while(true){
    	    	 p.pushService();
    	    }
    		
    	 
     }
}
