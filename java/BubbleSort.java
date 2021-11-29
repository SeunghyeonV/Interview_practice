import java.util.Random;
public class BubbleSort {
	static Random rand = new Random();

	public static void bubbleSort (int array[]) {
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length -i -1; j++) {
				if(array[j] > array[j+1])
				{
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}		
	}
	
	public static void printArray(int array[])
	{
		for(int i = 0; i < array.length; i++)
		{
		System.out.print(array[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		BubbleSort bs = new BubbleSort();
		int array [] = new int [500];
		
		for(int i = 0; i < array.length; i++) 
		{
		array[i] = rand.nextInt(10);
		}
		
		System.out.println("Unsorted array: ");
		for(int i = 0; i < array.length; i++) 
		{
		array[i] = rand.nextInt(10);
		System.out.print(array[i] + " ");
		}
		System.out.println();
		
		long start = System.currentTimeMillis();
		bs.bubbleSort(array);
		System.out.println("Sorted array: ");
		bs.printArray(array);
		long end = System.currentTimeMillis();
		long elapsedTime = end - start;
		System.out.println();
		System.out.println("Elapsed time: " + elapsedTime + " ms");
		
	}

}
