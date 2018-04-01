package chapter1.setion7.part4.test1;

public class Run {
	public static void main(String[] args) {
                   
                    try {
                    	 MyThread thread=new MyThread();
                         thread.start();
						Thread.sleep(200);
					    thread.interrupt();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						System.out.println("main catch");
						e.printStackTrace();
					}
                    System.out.println("end!");
                
	}
}
