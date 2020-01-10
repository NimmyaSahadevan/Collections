
public class TreeSetExample1_Employee implements Comparable<TreeSetExample1_Employee>
{
	private String name;
	private int age;
	//getters
	public String getName()  
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	//setters
	public void setAge(int age)
	{
		this.age=age;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	@Override
	public int compareTo(TreeSetExample1_Employee o){
		// TODO Auto-generated method stub
		return 1;
	}
	
}

