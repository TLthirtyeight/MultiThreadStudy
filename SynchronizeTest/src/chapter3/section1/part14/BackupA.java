package chapter3.section1.part14;

public class BackupA extends Thread {
    private DBTools dbtools;
    public BackupA(DBTools dbtools){
    	super();
    	this.dbtools=dbtools;
    }
    public void run(){
    	dbtools.backupA();
    }
    
}
