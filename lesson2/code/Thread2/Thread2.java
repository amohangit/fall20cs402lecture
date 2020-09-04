class MyThread implements Runnable{
  public void run(){
    try{
      System.out.println("#Processing on thread: " + Thread.currentThread().getId());
      Thread.sleep(2000);
      System.out.println("#Completed thread: " + Thread.currentThread().getId());
    }
    catch (Exception ex){}
  }
}
public class Thread2{
  public static void main(String[] args){
    MyThread obj = new MyThread();
    for (int i = 0; i < 5; i++){
      Thread mt = new Thread(obj);
      mt.start();
    }
  }
}