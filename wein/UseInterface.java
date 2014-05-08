public class UseInterface
{
	public static void main(String args[])
	{
		Computer p=new Computer();
		System.out.print(p.ADDRESS);
		System.out.print("\n");
		System.out.print(p.MAKER);
		System.out.println("\nPrice of Computer:"+p.getPrice()+"Million");
	}
}
class Computer implements Product
{
	public int getPrice()
	{
		return 100;
	}
}