package chapter3.section1.part14;

public class Run {
       public static void main(String[] args) {
		DBTools dbtools=new DBTools();
		for(int i=0;i<20;i++){
			BackupB output=new BackupB(dbtools);
			output.start();
			BackupA input=new BackupA(dbtools);
			input.start();
		}
	}
}
