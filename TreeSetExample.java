import java.util.*;
public class TreeSetExample 
{
	public static void main(String[] args)
	{
		int n,i;
		String name;
		int age;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		TreeSet<Employee> hashset=new TreeSet<Employee>(); // Creating Treeset of class as type
		Employee[] emp=new Employee[n];  //creating array of class objects
		//adding elements to treeset
		for(i=0;i<n;i++)
		{
			name=sc.next();
			age=sc.nextInt();
			emp[i]=new Employee();
			emp[i].setAge(age);
			emp[i].setName(name);
			hashset.add(emp[i]);
		}
		for(Employee e:hashset)
		{
			System.out.println(e.getName()+" "+e.getAge());  //getting elements 
		}
		sc.close();
	}

}
