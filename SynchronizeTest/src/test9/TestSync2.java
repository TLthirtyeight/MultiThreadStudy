package test9;

public class TestSync2 implements Runnable {

	int b =

	100;

	synchronized void m1()

	throws

	InterruptedException

	{
		Thread.sleep(500);
		System.out.println("进入m1");
		b =1000;

		
		//Thread.sleep(500);
		

		// 6
          
		System.out.println("b="

		+ b);
		System.out.println("离开m1");
	}

	synchronized void m2()

	throws

	InterruptedException

	{
       System.out.println("进入m2");
		Thread.sleep(250);

		// 5
		b =

		2000;
		System.out.println("离开m2");
	}

	public static void main(String[] args)

	throws

	InterruptedException

	{

		TestSync2 tt =

		new

		TestSync2();

		Thread t =

		new

		Thread(tt);

		// 1
		t.start();

		// 2
		tt.m2();

		// 3

		System.out.println("main thread b="

		+ tt.b);

		// 4

	}

	@Override
	public void run()

	{

		try

		{
			m1();

		}

		catch

		(InterruptedException e)

		{
			e.printStackTrace();

		}

	}
}
