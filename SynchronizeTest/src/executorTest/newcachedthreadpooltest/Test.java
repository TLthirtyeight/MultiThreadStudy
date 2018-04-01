package executorTest.newcachedthreadpooltest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Test {
	public static void test1(){
		  ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
   	   for (int i = 0; i < 10; i++) {
   	      // final int index = i;
   	        final int index = i;
   	       try {
   	           Thread.sleep(index * 1000);
   	       } catch (InterruptedException e) {
   	           e.printStackTrace();
   	       }

   	       cachedThreadPool.execute(new Runnable() {

   	           @Override
   	           public void run() {
   	               System.out.println(index);
   	           }
   	       });
   	   }
	}
	
	public static void test2(){
		   for (int i = 0; i < 3; i++) {
		   	      // final int index = i;
		   	        final int index = i;
		   	       try {
		   	           Thread.sleep(index * 1000);
		   	       } catch (InterruptedException e) {
		   	           e.printStackTrace();
		   	       }

		   	       new Thread(new Runnable() {

		   	           @Override
		   	           public void run() {
		   	               System.out.println(index);
		   	           }
		   	       }).start();;
		   	   }
	}
	
	public static void test3(){        //感觉挺神奇的，
		ExecutorService fixedThreadPool = Executors.newFixedThreadPool(5);
		for (int i = 0; i < 10; i++) {
		    final int index = i;
		    System.out.println("for 循环  的i"+" "+i+" "+Thread.currentThread().getName());
		    fixedThreadPool.execute(new Runnable() {


		        @Override
		        public void run() {
		            try {
		                System.out.println("正在打印"+index+" "+Thread.currentThread().getName());   //打印后发现是只有5个线程
		                System.out.println("线程"+Thread.currentThread().getName()+"准备休眠");
		                Thread.sleep(2000);
		                System.out.println("线程"+Thread.currentThread().getName()+"休眠完毕");
		            } catch (InterruptedException e) {
		                // TODO Auto-generated catch block
		                e.printStackTrace();
		            }
		        }
		    });
		}
		fixedThreadPool.shutdown();
		while(fixedThreadPool.isTerminated()){
			System.out.println("while");
			break;
		}
     
	}
	
	public static void test4(){
		ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(5);
		scheduledThreadPool.schedule(new Runnable() {

		    @Override
		    public void run() {
		        System.out.println("delay 3 seconds");
		    }
		}, 3, TimeUnit.SECONDS);
	}
           public static void main(String[] args) {
        	 test4();
		}
}
