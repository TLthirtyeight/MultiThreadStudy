package chapter2.section2.part10.test1;

public class Run {
       public static void main(String[] args) {
		Service service=new Service();
		ThreadA a=new ThreadA(service);
		a.setName("A");
		
		a.start();
		
		ThreadB b=new ThreadB(service);
		b.setName("B");
		b.start();
	}
}
