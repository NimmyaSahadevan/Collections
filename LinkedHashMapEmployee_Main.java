import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LinkedHashMapEmployee_Main
{

	public static void main(String[] args) 
	{
		int n,i;
		String name;
		int age;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		Map<Integer,LinkedHashMapEmployee_Employee> linkedhashmap=new HashMap<Integer,LinkedHashMapEmployee_Employee>(); // Creating LinkedHashMap of class as type
		LinkedHashMapEmployee_Employee[] emp=new LinkedHashMapEmployee_Employee[n];  //creating array of class objects
		//adding elements to LinkedHashMap
		for(i=0;i<n;i++)
		{
			name=sc.next();
			age=sc.nextInt();
			emp[i]=new LinkedHashMapEmployee_Employee();
			emp[i].setAge(age);
			emp[i].setName(name);
			linkedhashmap.put(i,emp[i]);
		}
		for(Map.Entry<Integer,LinkedHashMapEmployee_Employee> m:linkedhashmap.entrySet())
		{
			LinkedHashMapEmployee_Employee c=m.getValue();
			System.out.println(m.getKey()+" "+c.getName()+" "+c.getAge());  //getting elements 
		}
		sc.close();

	}

}
