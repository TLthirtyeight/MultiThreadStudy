package chapter3.section2.part1;

import chapter1.setion7.part4.test1.MyThread;

public class Test {
        public static void main(String[] args) {
			MyThread threadTest=new MyThread();
			threadTest.start();
			
			//Thread.sleep();
			System.out.println("我想当threadTest对象执行完毕后我再执行");
			System.out.println("但上面代码中的sleep()中的值应该写多少呢");
			System.out.println("答案是根本不能确定");
		}
}
