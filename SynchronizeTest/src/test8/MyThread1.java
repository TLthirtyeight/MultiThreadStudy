package test8;

import commonutils.CommonUtils;

import mytask.Task;

public class MyThread1 extends Thread {
        private Task1 task;
        public MyThread1(Task1 task){
        	super();
        	this.task=task;
        }
        
        public void run(){
        	
        	super.run();
        	//CommonUtils.beginTime1=System.currentTimeMillis();
        	task.doLongTimeTask();
        	//CommonUtils.endTime1=System.currentTimeMillis();
        }
}
