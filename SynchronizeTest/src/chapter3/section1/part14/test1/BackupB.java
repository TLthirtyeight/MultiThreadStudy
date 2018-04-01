package chapter3.section1.part14.test1;

public class BackupB extends Thread{
	  private DBTools dbtools;
	    public BackupB(DBTools dbtools){
	    	super();
	    	this.dbtools=dbtools;
	    }
	    public void run(){
	    	dbtools.backupB();
	    }
}
