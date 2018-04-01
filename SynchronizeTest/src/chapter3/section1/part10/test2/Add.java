package chapter3.section1.part10.test2;

public class Add {
       private String lock;
       public Add(String lock){
    	   super();
    	   this.lock=lock;
       }
       
       public void add(){
    	   synchronized (lock) {
    		   ValueObject.list.add("anyString");
    		   System.out.println("add 了一个");
			lock.notifyAll();
		}
       }
}
