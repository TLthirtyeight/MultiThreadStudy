package chapter3.section1.part12;

import java.io.PipedInputStream;

public class ThreadRead extends Thread{
     private ReadData read;
     private PipedInputStream input;
     
     public ThreadRead(ReadData read,PipedInputStream input){
    	 super();
    	 this.read=read;
    	 this.input=input;
     }
     
     public void run(){
    	 read.readMethod(input);
     }
}
