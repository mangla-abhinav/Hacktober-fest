import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner input=new Scanner(System.in);
		int a[]={1,34,56,34,67,876};
		int key=input.nextInt();
		int b=0;
		for(int i=0;i<a.length;i++)
		{
		    if(a[i]==key)
		    {b++;}
		    else
		    {continue;}
		}
		if(b>0)
		System.out.println(key+" is there in the array");
		else
		System.out.println(key+" is not there in the array");
	}
}

