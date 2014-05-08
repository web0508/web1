package Company;//declare company package
class Employee
{
	public String name;
	public int salary;
	public String getString()
	{
		String str;
		str="Name:"+name+"\nSalary:"+salary;
		return str;
	}
}
public class Manager extends Employee
{
	public String department;
	public String getSalary()
	{
		return super.getString()+"\nDepartment:"+department;
	}
}