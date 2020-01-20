import java.util.Scanner;
import java.util.TreeSet;

public class Comparable_Main 
{
	public static void main(String[] args)
	{
		int n,i;
		String name;
		int age;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		TreeSet<Comparable_Employee> hashset=new TreeSet<Comparable_Employee>(); // Creating Treeset of class as type
		Comparable_Employee[] emp=new Comparable_Employee[n];  //creating array of class objects
		//adding elements to treeset
		for(i=0;i<n;i++)
		{
			name=sc.next();
			age=sc.nextInt();
			emp[i]=new Comparable_Employee();
			emp[i].setAge(age);
			emp[i].setName(name);
			hashset.add(emp[i]);
		}
		for(Comparable_Employee e:hashset)
		{
			System.out.println(e.getName()+" "+e.getAge());  //getting elements 
		}
		sc.close();
	}

}
