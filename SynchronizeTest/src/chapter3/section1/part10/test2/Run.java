package chapter3.section1.part10.test2;

public class Run {
       public static void main(String[] args) throws InterruptedException {
		String lock=new String("");
		Add add=new Add(lock);
		Subtract subtract =new Subtract(lock);
		ThreadSubstract subtract1Thread=new ThreadSubstract(subtract);
		subtract1Thread.setName("subtract1Thread");
		
		subtract1Thread.start();
		
		ThreadSubstract subtract2Thread=new ThreadSubstract(subtract);
		subtract2Thread.setName("subtract2Thread");
		
		subtract2Thread.start();
    	   
    	Thread.sleep(1000);
    	ThreadAdd addThread=new ThreadAdd(add);
    	addThread.setName("addThread");
    	addThread.start();
	}
}
