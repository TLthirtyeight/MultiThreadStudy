package chapter3.section3.part2;

public class ThreadB extends Thread{
	public void run(){
		try{
			for(int i=0;i<100;i++){
				Tools.tl.set("ThreadB"+(i+1));
				System.out.println("ThreadB get Value="+Tools.tl.get());
				ThreadA.sleep(200);
			}
		}catch(InterruptedException e){
			
		}
	}
}
