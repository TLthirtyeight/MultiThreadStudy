package chapter3.section1.part14.test1;

public class BackupC extends Thread{
	 private DBTools dbtools;
	    public BackupC(DBTools dbtools){
	    	super();
	    	this.dbtools=dbtools;
	    }
	    public void run(){
	    	dbtools.backupC();
	    }
}
