package chapter3.section1.part11.testStackOnePOneC;

public class Run {
	public static void main(String[] args) {
		   MyStack mystack=new MyStack();
		      P p=new P(mystack);
		      C r=new C(mystack);
		      P_Thread pThread=new P_Thread(p);
		      C_Thread cThread=new C_Thread(r);
		      pThread.start();
		      cThread.start();
	}
   
}
