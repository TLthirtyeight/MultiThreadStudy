package chapter3.section1.part10.test1;

public class ThreadSubstract extends Thread {
        private Subtract r;
        public ThreadSubstract(Subtract r){
        	super();
        	this.r=r;
        }
        
        public void run(){
        	r.subtract();
        }
}
