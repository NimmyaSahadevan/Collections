import java.util.*;
public class HashSetExample_1 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.of elements for first set");
		int n= sc.nextInt();
		Set<Integer> set1=new HashSet<Integer>(); //creating first set
		System.out.println("Enter first set");
		//adding elements
		for(int i=0;i<n;i++)
		{
			int n1=sc.nextInt();
			set1.add(n1);
		}
		Set<Integer> set2=new HashSet<Integer>();  //creating second set
		System.out.println("Enter no.of elements for second set");
		int n2= sc.nextInt();
		System.out.println("Enter second set");
		//adding elements
		for(int i=0;i<n2;i++)
		{
			int n3=sc.nextInt();
			set2.add(n3);
		}
		System.out.println("First set : "+set1);
		System.out.println("second set : "+set2); 
		Set<Integer> union=new HashSet<Integer>(set1); //creating another set with first set elements
		union.addAll(set2);        //adding set2 elements to union set
		System.out.println("set after union : "+union);
		Set<Integer> intersection=new HashSet<Integer>(set1); //creating a set for intersection with set1 elements
		intersection.retainAll(set2);      //retaining common elements of set1 and set2
		System.out.println("set after intersection : "+intersection);
		Set<Integer> symmetricdifference=new HashSet<Integer>(set1); //creating a set for symmetric difference with set1 elements 
		symmetricdifference.removeAll(set2);         //removing common elements of set1 with respect to set2
		System.out.println("set after Symmetric Difference : "+symmetricdifference);
	}

}
