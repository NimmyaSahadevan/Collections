import java.util.*;
import java.lang.Math;
public class HashSetExample_4 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		Set<Integer> hashset=new HashSet<Integer>();  //creating HashSet
		//addding elements to HashSet
		for(int i=0;i<n;i++)
		{
			int n1=sc.nextInt();
			hashset.add(n1);
		}
		System.out.println("numbers: "+hashset);
		hashset.remove(10);  //removing 10th index 
		System.out.println("After remove(10):"+hashset);
		Set<Integer> hashset1=new HashSet<Integer>();//creating new hashset
		for(int n1:hashset)
		{
			int num=n1;
			int n3=(int)Math.sqrt(num);  //finding square root
			if(n3*n3==n1)
			{
				hashset1.add(num);    //adding perfectsquares into hashset1
			}
		}
		hashset.removeAll(hashset1);  //removing elements of hashset1 from hashset
		System.out.println("After remove(perfectsquares)"+hashset);
		hashset.clear();  //clearing hashset
		System.out.println(hashset);
	}

}
