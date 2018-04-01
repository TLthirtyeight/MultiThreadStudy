package chapter2.section2.part15.test2;



public class Run {
     public static void main(String[] args) {
 		final TestClass1 in1=new TestClass1();
 		final TestClass2 in2=new TestClass2();
 		Thread t1=new Thread(new Runnable() {
 			
 			@Override
 			public void run() {
 				// TODO Auto-generated method stub
 				in1.method1(in2);
 			}
 		},"T1");
 		
 	Thread t2=new Thread(new Runnable() {
 			
 			@Override
 			public void run() {
 				// TODO Auto-generated method stub
 				in1.method2();
 			}
 		},"T2");
 	
 	Thread t3=new Thread(new Runnable() {
 		
 		@Override
 		public void run() {
 			// TODO Auto-generated method stub
 			in2.method1();
 		}
 	},"T3");
 	
 	t1.start();
 	t2.start();
 	t3.start();
	}
}
