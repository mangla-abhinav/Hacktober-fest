public class Main
{
	public static void main(String[] args) {
	int a[][]=new int[2][]; //create an array with variables no. of columns
	a[0]=new int[3];//determine no. of elements in each row.
	a[1]=new int[2];
	a[0][0]=1;
	a[0][1]=2;
	a[0][2]=3;
	a[1][0]=4;
	a[1][1]=5;
	for(int i=0;i<a.length;i++)//length of array is determined by no. of rows
	{
	    for(int j=0;j<a[i].length;j++)
	    {
	        System.out.print(a[i][j]+" ");
	    }
	    System.out.println();
	}
	
	}
}

