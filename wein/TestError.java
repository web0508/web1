public class TestError
{
	public static void main(String[] args) 
	{
		//int Result=5/0;
		try {
			int Result=5/0;
			System.out.println("The result is:"+Result);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("This is a Exception!!!");
		}
		//System.out.println("The result is:"+Result);
		//return Result; 
	}
}