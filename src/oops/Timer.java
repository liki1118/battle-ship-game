package oops;

public class Timer implements Runnable{
	public static int i;
	public void run() {
		i=0;
	for(i=0;i<=30;i++) {
		try {
			Thread.sleep(1000);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	while(true);
	}
}
