package chapter3.section1.part10.test1;

public class ThreadAdd extends Thread{

	private Add p;
	public ThreadAdd(Add p){
		super();
		this.p=p;
	}
	
	public void run(){
		p.add();
	}
	
}
