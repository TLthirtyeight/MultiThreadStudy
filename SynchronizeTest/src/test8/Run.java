package test8;

public class Run {
    public static void main(String[] args) {
		Task1 task=new Task1();
		MyThread1 thread1=new MyThread1(task);
		thread1.start();
		
		MyThread2 thread2=new MyThread2(task);
		thread2.start();
	}
}
