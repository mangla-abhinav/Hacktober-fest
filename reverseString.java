package New2;

public class reverseString {

	public static void main(String[] args) {
		String str = "hello how are you";
		String str1 = "";
		String arr[]= str.split(" ");
		for(int i=arr.length-1;i>=0;i--)
		{
			str1 = str1 + arr[i] + " ";
		}
		System.out.println(str1);
	}

}
