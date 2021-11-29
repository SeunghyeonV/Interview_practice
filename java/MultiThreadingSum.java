import java.util.Random;

public class MultiThreadingSum {
public static void main(String[] args) {
	sumThread1 t1 = new sumThread1(); // This is how you use extends Thread
	Thread t2 = new Thread(new sumThread2()); // This is how you use implements Runnable
	
	t1.start(); //starts a thread t1
	t2.start(); //starts a thread t2
	}
}

class sumThread1 extends Thread{
	static int sum = 0;
	int array [] = new int [100000]; // array size 100000
	Random rand = new Random();
	
	public void run() {
		for(int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(10); // This generates random numbers between 0 to 9
			sum += array[i];
		}
		System.out.println("Sum of integers between 1 and 100000: " + sum);
	}
}

class sumThread2 implements Runnable {
	static int sum = 0;
	int array [] = new int [100000]; // array size 100000
	Random rand = new Random();
	
	public void run() {
		for(int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(10); // This generates random numbers between 0 to 9
			sum += array[i];
		}
		System.out.println("Sum of integers between 1 and 100000: " + sum);
	}
}
