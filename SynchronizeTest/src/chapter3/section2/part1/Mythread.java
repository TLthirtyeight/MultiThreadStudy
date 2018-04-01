package chapter3.section2.part1;

public class Mythread extends Thread{
    
	public void run(){
		try{
			int secondValue=(int)(Math.random()*10000);
			Thread.sleep(secondValue);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}
