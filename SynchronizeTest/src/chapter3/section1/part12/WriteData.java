package chapter3.section1.part12;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class WriteData {
       public void writeMethod(PipedOutputStream out){
    	   try{
    		   System.out.println("write: ");
    		   for(int i=0;i<300;i++){
    			   String outData=""+(i+1);
    			   out.write(outData.getBytes());
    			   System.out.println("bytes length:  "+outData.getBytes().length);
    			   System.out.println(outData);
    		   }
    		   System.out.println();
    		   out.close();
    	   }catch(IOException e){
    		   e.printStackTrace();
    	   }
       }
}
