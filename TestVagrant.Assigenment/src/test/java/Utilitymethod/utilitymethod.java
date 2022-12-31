package Utilitymethod;

public class utilitymethod 
{
	public static void waitload (int a) {
		try {
			Thread.sleep(a*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
}

}
