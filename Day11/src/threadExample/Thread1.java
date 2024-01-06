package threadExample;

public class Thread1 extends Thread{
	@Override
	public void run() {
		 try {
	            Thread.sleep(2000);
	    }
	        catch (InterruptedException e) {
	            e.printStackTrace();
	        }
		//while(true) {
			System.out.println("Welcome");
		//for(int i=0;i<10;i++) {
			//System.out.println(i);
		}
	}



