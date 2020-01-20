
public class Comparator_Employee implements Comparable<Comparator_Employee>{

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
	public int compareTo(Comparator_Employee o)
	{
		if(age>o.getAge())
		{
			return 1;
		}
		else if(age<o.getAge())
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
}
