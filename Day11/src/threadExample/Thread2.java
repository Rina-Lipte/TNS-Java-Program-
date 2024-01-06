package threadExample;

public class Thread2  implements Runnable{
	@Override
	public void run() {
		try {
            Thread.sleep(2000);
    }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
		 
		//while(true) {
			System.out.println("Good Morning");
		}
		
		//for(int i=11;i<20;i++) {
			//System.out.println(i);
		}
	 


