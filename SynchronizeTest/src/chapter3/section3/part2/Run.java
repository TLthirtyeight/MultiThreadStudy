package chapter3.section3.part2;

public class Run {
    public static void main(String[] args) {
    	 try{
    		 ThreadA a=new ThreadA();
    		 ThreadB b=new ThreadB();
    		 a.start();
    		 b.start();
    		 for(int i=0;i<100;i++){
    			 Tools.tl.set("Main"+(i+1));
 				System.out.println("Main get Value="+Tools.tl.get());
 				ThreadA.sleep(200);
    		 }
    		 
    		 
    	 }catch(InterruptedException e){
    		 e.printStackTrace();
    	 }
	}
	
	
	
}
