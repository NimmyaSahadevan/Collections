
public class HashMapEmployee_Employee implements Comparable<HashMapEmployee_Employee> {
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
	public int compareTo(HashMapEmployee_Employee o){
		// TODO Auto-generated method stub
		return 1;
	}
}
