public class ReverseString {
	static void reverse(String str) 
	{
		char [] arr = new char[str.length()];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(arr.length-i-1);  
			System.out.print(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		String str = new String("cookies we have");
		reverse(str);
	}
}
