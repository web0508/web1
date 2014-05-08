//TestString.java
public class TestString
{
	public static void main(String args[])
	{
		String str=new String("The substring being at the specified beinIndex.");
		String str1=new String("string");
		String str2=new String();
		int size=str.length();
		int flag=str.indexOf("substring");
		str2=str.substring(flag,flag+9);
		System.out.println("zifuchuan"+str+"\nzongchangduwei:"+size);
		if(str1.equals(str2))
			System.out.println("jiequde zifuchuanwei:"+str1);
		else
			System.out.println("jiequde zifuchuanwei:"+str2);
	}
}

GUISLY