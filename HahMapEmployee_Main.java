import java.util.Scanner;
import java.util.TreeSet;
import java.util.*;
public class HahMapEmployee_Main 
{

	public static void main(String[] args) 
	{
		int n,i;
		String name;
		int age;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		Map<Integer,HashMapEmployee_Employee> hashmap=new HashMap<Integer,HashMapEmployee_Employee>(); // Creating HashMap of class as type
		HashMapEmployee_Employee[] emp=new HashMapEmployee_Employee[n];  //creating array of class objects
		//adding elements to HashMap
		for(i=0;i<n;i++)
		{
			name=sc.next();
			age=sc.nextInt();
			emp[i]=new HashMapEmployee_Employee();
			emp[i].setAge(age);
			emp[i].setName(name);
			hashmap.put(i,emp[i]);
		}
		for(Map.Entry<Integer,HashMapEmployee_Employee> m:hashmap.entrySet())
		{
			HashMapEmployee_Employee c=m.getValue();
			System.out.println(m.getKey()+" "+c.getName()+" "+c.getAge());  //getting elements 
		}
		sc.close();

	}

}
