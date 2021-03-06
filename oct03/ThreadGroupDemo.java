//package oct03;

public class ThreadGroupDemo {

	public static void main(String[] args) {
		ThreadGroup tg = new ThreadGroup("G-1");
		
		Thread th1 = new Thread(tg,new MyRunnable());
		Thread th2 = new Thread(tg,new MyRunnable());
		Thread th3 = new Thread(tg,new MyRunnable());
		
		th1.start();
		th2.start();
		th3.start();
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		tg.stop();

	}
	

}
class MyRunnable implements Runnable{
	@Override
	public void run() {
		for(int i=1;i<=50;i++) { //value i = 4 --5 , 50 ,100 --<4
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+" -> "+i); 
		}
	
	}
}
