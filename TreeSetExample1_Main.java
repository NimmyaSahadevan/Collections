import java.util.*;
public class TreeSetExample1_Main 
{
	public static void main(String[] args)
	{
		int n,i;
		String name;
		int age;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		TreeSet<TreeSetExample1_Employee> hashset=new TreeSet<TreeSetExample1_Employee>(); // Creating Treeset of class as type
		TreeSetExample1_Employee[] emp=new TreeSetExample1_Employee[n];  //creating array of class objects
		//adding elements to treeset
		for(i=0;i<n;i++)
		{
			name=sc.next();
			age=sc.nextInt();
			emp[i]=new TreeSetExample1_Employee();
			emp[i].setAge(age);
			emp[i].setName(name);
			hashset.add(emp[i]);
		}
		for(TreeSetExample1_Employee e:hashset)
		{
			System.out.println(e.getName()+" "+e.getAge());  //getting elements 
		}
		sc.close();
	}

}
