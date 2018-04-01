package test8;

import mytask.Task;

import commonutils.CommonUtils;

public class MyThread2 extends Thread {
	   private Task1 task;
       public MyThread2(Task1 task){
       	super();
       	this.task=task;
       }
       
       public void run(){
       	super.run();
      // 	CommonUtils.beginTime2=System.currentTimeMillis();
       	task.doLongTimeTask();
       	//CommonUtils.endTime2=System.currentTimeMillis();
       }
}
