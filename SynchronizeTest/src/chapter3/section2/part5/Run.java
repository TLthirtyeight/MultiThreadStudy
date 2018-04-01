package chapter3.section2.part5;

public class Run {
            public static void main(String[] args) {
				try{
					ThreadB b=new ThreadB();
					ThreadA a=new ThreadA(b);
					a.start();
					Thread.sleep(1000);
					ThreadC c=new ThreadC(b);
					c.start();
				}catch(InterruptedException e){
					
				}
			}
}
