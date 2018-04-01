package chapter3.section1.part14.test1;

public class Run {
       public static void main(String[] args) {
		DBTools dbtools=new DBTools();
		for(int i=0;i<20;i++){
			BackupB b=new BackupB(dbtools);
			b.start();
			BackupA a=new BackupA(dbtools);
			a.start();
			
			BackupC c=new BackupC(dbtools);
			c.start();
		}
	}
}
