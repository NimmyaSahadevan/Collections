
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.*;

public class Comparator_Main 
{

	public static void main(String[] args)
	{
		int n,i;
		String name;
		int age;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		List<Comparator_Employee> list=new LinkedList<Comparator_Employee>(); // Creating linkedlist of class as type
		Comparator_Employee[] emp=new Comparator_Employee[n];  //creating array of class objects
		//adding elements to linkedlist
		for(i=0;i<n;i++)
		{
			name=sc.next();
			age=sc.nextInt();
			emp[i]=new Comparator_Employee();
			emp[i].setAge(age);
			emp[i].setName(name);
			list.add(emp[i]);
		}
		System.out.println("Name wise comparison");
		Collections.sort(list, new NameComparator());  
		for(Comparator_Employee e:list)
		{
			System.out.println(e.getName()+" "+e.getAge());  //getting elements 
		}
		System.out.println("Age wise comparison");
		Collections.sort(list, new AgeComparator());
		for(Comparator_Employee e:list)
		{
			System.out.println(e.getName()+" "+e.getAge());  //getting elements 
		}
		sc.close();
	}
}

class AgeComparator implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		Comparator_Employee e1=(Comparator_Employee)o1;
		Comparator_Employee e2=(Comparator_Employee)o2;
		if(e1.getAge()==e2.getAge())
		{
			return 0;
		}
		else if(e1.getAge()>e2.getAge())
		{
			return 1;
		}
		else
			return -1;
	}
}

class NameComparator implements Comparator<Comparator_Employee>
{
	public int compare(Comparator_Employee o1,Comparator_Employee o2)
	{
		Comparator_Employee e1=(Comparator_Employee)o1;
		Comparator_Employee e2=(Comparator_Employee)o2;
		return e1.getName().compareTo(e2.getName());
	}
}

