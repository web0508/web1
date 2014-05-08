
public class Teacher {
	public String name;
	public int age;
	public void introduce(){
		if(age>22){
			System.out.println("大家好，我叫"+this.name+",今年"+this.age+"岁。");
		} else{
			System.out.println("对不起，你年龄未满22岁！不能当老师！");
		}
	}

}
