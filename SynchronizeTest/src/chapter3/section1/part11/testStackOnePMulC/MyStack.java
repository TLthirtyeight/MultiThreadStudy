package chapter3.section1.part11.testStackOnePMulC;

import java.util.ArrayList;
import java.util.List;

public class MyStack {
      private List list =new ArrayList();
      synchronized public void push(){
    	  try{
    		  while(list.size()==1){
    			  this.wait();
    		  }
    		  list.add("anyString="+Math.random());
    		  this.notify();
    		  System.out.println("push="+list.size());
    		  
    	  }catch(Exception e){
    		  e.printStackTrace();
    	  }
      }
      
      synchronized public String pop(){
    	  System.out.println(Thread.currentThread().getName()+" 进入pop");
    	  String returnValue="";
    	  try{
    		  while(list.size()==0){
    			  System.out.println("pop操作中的:"+Thread.currentThread().getName()+" 线程呈wait状态");
    			  this.wait();
    		  }
    		  returnValue=""+list.get(0);
    		  list.remove(0);
    		  this.notify();
    		  System.out.println("pop="+list.size()+"   由"+Thread.currentThread().getName()+"pop出");
    	  }catch(InterruptedException e){
    		  e.printStackTrace();
    	  }
    	  System.out.println(Thread.currentThread().getName()+" 离开pop");
      return returnValue;
      }
}
