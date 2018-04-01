package chapter3.section1.part12;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class Run {
     public static void main(String[] args) {
		try{
			WriteData writeData=new WriteData();
			ReadData readData=new ReadData();
			PipedInputStream inputStream =new PipedInputStream();
			PipedOutputStream outputStream =new PipedOutputStream();
			
			inputStream.connect(outputStream);//连接这一步很关键 
		//	outputStream.connect(inputStream);//连接这一步很关键 
			ThreadRead threadRead=new ThreadRead(readData, inputStream);
			threadRead.start();
			Thread.sleep(2000);
			
			ThreadWrite threadWrite=new ThreadWrite(writeData, outputStream);
			threadWrite.start();
			
		}catch(IOException e){
			e.printStackTrace();
		}catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
