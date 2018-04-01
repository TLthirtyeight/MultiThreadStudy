package chapter3.section1.part11.testStackOnePOneC;

public class C {
      private MyStack myStack;
      public C(MyStack myStack){
    	  super();
    	  this.myStack=myStack;
      }
      public void popService(){
    	  System.out.println("pop= "+myStack.pop());
      }
}
