package Java_day5;

class MyThread extends Thread{
	@Override
	public void run() {
		System.out.println("Thread is Running");
	}	
}
public class MultiThreading {
	public static void main(String[] args) {
		
		//creating a thread by extending Thread class
		MyThread thread1= new MyThread();
		thread1.start(); //starting the thread
	}
}
