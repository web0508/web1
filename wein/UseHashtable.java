import java.util.Hashtable;

public class UseHashtable
{
	public static void main(String args[])
	{
		Hashtable hScore=new Hashtable();
		hScore.put("Wujing","1992");
		hScore.put("Weinbery","1988");
		hScore.put("Weixuejiao","1990");
		System.out.println("after transfer to string:"+hScore.toString());
		hScore.put("Weinbery","1991");
		hScore.remove("Wujing");
		System.out.println("after modify and delete");
		System.out.println("after transfer to string:"+hScore.toString());
	}
}