package thread.packages;

public class ThreadDemo extends Thread{
	//job2
//	void Mythread() {
//		for (int doc = 1; doc <=1000; doc++) {
//			System.out.println("$Printing the Document #" +doc +""+" by printer2");
//				
//			}
//			
//	}
	@Override
	public void run() {
		for (int doc = 1; doc <=10; doc++) {
			System.out.println("$$Printing the Doument #" +doc +""+" by printer2");
				
			}
		
	}
	
	
	//IT's a MAin thread in java
	public static void main(String[] args) {
		//Threads always works in sequence
		 ThreadDemo t=new  ThreadDemo();
		//job1
		System.out.println("Application Starts");
		
		//until job2 is not finished below jobs will not be executed
//		t.Mythread();
		//Main and thread works paralley
		t.start();
		
		
		//job3
		for (int doc = 1; doc <=10; doc++) {
		System.out.println("@@Printing the Doument #" +doc +""+" by printer1");
			
		}
		//job4
		System.out.println("Application Ends!");
	}
	
	

}
