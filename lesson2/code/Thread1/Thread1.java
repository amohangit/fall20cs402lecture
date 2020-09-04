class MyThread extends Thread{
	public void run(){
		try{
			System.out.println("#Processing on thread: " + Thread.currentThread().getId());
			Thread.sleep(2000);
			System.out.println("#Completed thread: " + Thread.currentThread().getId());
		}
		catch (Exception ex){}
	}
}
public class Thread1{
	public static void main(String[] args){
		for (int i = 0; i < 5; i++){
			MyThread mt = new MyThread();
			mt.start();
		}
	}
}