package thread.packages;

import java.util.Iterator;


class Printer{
//	  synchronized
	void printDoc(int numofDoc,String docname ) {
	for (int i = 0; i <= numofDoc; i++) {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	System.out.println(">>>printing " +docname+" "+i);	
	}
	}
}
//creating our own thread

class mythread extends Thread{
	
	Printer pRef;
	
	public mythread(Printer p) {
	//pRef:reference of the printer class
	pRef=p;
	
	}
	
	@Override
	public void run() {
		//Syc Block 
		synchronized (pRef) {
			
		
		pRef.printDoc(10, "RoshanProfile");
	}
	
	}
}	

	class Yourthread extends Thread{

		Printer pRef;
		public Yourthread(Printer p) {
			pRef=p;
		}
        @Override
		public void run() {
        	//syc block
        	synchronized (pRef) {
        		pRef.printDoc(10, "HrithikProfile");
        	}
		}
		
		
	}
	





public class SyncApp {
public static void main(String[] args) {
	System.out.println("==Application Starts==");
	
	//only one obj is created but more than one thread can have the same reference
	Printer print=new Printer();
//	print.printDoc(10, "profile.pdf");
//if multiple threads works on same simple obj it should be synchronized for better outputs	
mythread tRef=new mythread(print);//mythread having the reference of printer object
Yourthread yRef=new Yourthread(print);

tRef.start();
//try {
//	tRef.join();//Synchronized result will be produced
//} catch (InterruptedException e) {
//	
//	e.printStackTrace();
//}
	
yRef.start();
	
	
	
	System.out.println("==Application Ends==");

}
}
