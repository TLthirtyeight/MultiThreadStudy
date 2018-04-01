package test1;

public class RunTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       MyThread mythread=new MyThread();
       Thread a=new Thread(mythread,"A");
       Thread b=new Thread(mythread,"B");
       Thread c=new Thread(mythread,"C");
       Thread d=new Thread(mythread,"D");
       Thread e=new Thread(mythread,"E");
       a.start();
       b.start();
       c.start();
       d.start();
       e.start();
	}

}
