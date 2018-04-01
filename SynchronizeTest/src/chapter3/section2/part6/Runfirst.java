package chapter3.section2.part6;

public class Runfirst {
          public static void main(String[] args) {
			ThreadB b=new ThreadB();
			ThreadA a=new ThreadA(b);
			a.start();
			b.start();
		    System.out.println("   main end"+System.currentTimeMillis());
			
		}
}
