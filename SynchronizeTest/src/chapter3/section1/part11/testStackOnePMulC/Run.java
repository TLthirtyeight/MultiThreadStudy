package chapter3.section1.part11.testStackOnePMulC;

public class Run {
	public static void main(String[] args) {
		   MyStack mystack=new MyStack();
		      P p=new P(mystack);
		      C r1=new C(mystack);
		      C r2=new C(mystack);
		      C r3=new C(mystack);
		      C r4=new C(mystack);
		      C r5=new C(mystack);
		      
		      P_Thread pThread=new P_Thread(p);
		      C_Thread cThread1=new C_Thread(r1);
		      C_Thread cThread2=new C_Thread(r2);
		      
		      C_Thread cThread3=new C_Thread(r3);
		      C_Thread cThread4=new C_Thread(r4);
		      C_Thread cThread5=new C_Thread(r5);
		      pThread.start();
		      cThread1.start();
		      cThread2.start();
		      cThread3.start();
		      cThread4.start();
		      cThread5.start();
		  
	}
   
}
