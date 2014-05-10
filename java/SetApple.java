public class SetApple
{
	public static void main(String args[])
	{
		apple a=new apple();
		a.appleweight=0.5;
		System.out.println("mass of apple is 1 kg.");
		System.out.println(a.bite());
		a.appleweight=5;
		System.out.println("mass of apple is 5 kg.");
		System.out.println(a.bite());
	}
}
class apple
{
	long applecolor;
	double appleweight;
	boolean eatup;
	
	public boolean bite()
	{
		if(appleweight<1)
		{
			System.out.println("appple is eatup!");
			eatup=true;
		}
		else
		{
			System.out.println("can't eat!");
			eatup=false;
		}
		return eatup;
	}
}