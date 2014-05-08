//import src.Human;

public class TestDemo
{
	public static void main(String[] args) {
		//build a object Wein
		Human Wein=new Human();
		Wein.age=25;
		Wein.weight=70;
		Wein.eat();
		Wein.say();
		System.out.println("Wein's age is:"+Wein.age);
		System.out.println("Wein's weight is:"+Wein.weight);
		System.out.println(Wein.eat(););
		System.out.println(Wein.say(););
	}
	
}
public class Human 
{
	public int age;
	
	public float weight;
	
	public void eat(){
		System.out.println("Eat apples!");
		
	}
	
	public void say(){
		System.out.println("Be good at Chinese!");
	}

}
