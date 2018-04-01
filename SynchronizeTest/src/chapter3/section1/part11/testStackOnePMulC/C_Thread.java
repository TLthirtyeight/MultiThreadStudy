package chapter3.section1.part11.testStackOnePMulC;

public class C_Thread extends Thread {
     private C r;
     public C_Thread(C r){
    	 super();
    	 this.r=r;
     }
     public void run(){
    	 while(true){
    		 r.popService();
    	 }
     }
	
}
