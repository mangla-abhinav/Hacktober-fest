package New2;

public class longestCommon {

	public static void main(String[] args) {
		String str1="coding";
		String str2="codequotient";
		String arr[]=new String[30];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]="";
		}
		for(int i=0;i<str1.length();i++)
		{
			arr[i]="";
			for(int j=0;j<str2.length();j++)
			{
				if(str1.charAt(i)==str2.charAt(j))
				{
					int i1=i;
					int j1=j;
					if(str1.charAt(i1)==str2.charAt(j1))
					{
						while(str1.charAt(i1)==str2.charAt(j1))
						{
							//System.out.println(str1.charAt(i1)+" "+str2.charAt(j1));
							arr[i]=arr[i]+str1.charAt(i1);
							if(i1<str1.length()-1)
							{
								i1++;
							}
							else
							{
								//System.out.println("break");
								break;
							}
							if(j1<str2.length()-1)
							{
								j1++;
							}
							else
							{
								break;
							}
						}
						//System.out.println("out loop");
						break;
					}
					else
					{
						break;
					}
				}
			}
		}
		String str=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(str.length()<arr[i].length())
			{
				str=arr[i];
			}
		}
		System.out.println(str);

	}

}
