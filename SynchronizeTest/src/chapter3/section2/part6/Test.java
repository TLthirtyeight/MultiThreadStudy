package chapter3.section2.part6;

public class Test {
       public static void main(String[] args) throws InterruptedException {
		Thread A=new Thread( new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
//				while(true){
//				//	System.out.println("run");
//				}
				try {
					//Thread.sleep(5000);
					wait(0);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}    );
		A.start();
		A.join(0);
		System.out.println("join 后 ");
	}
}
