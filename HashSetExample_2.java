import java.util.*;
public class HashSetExample_2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Integer>list=new ArrayList<Integer>(); //Creating arraylist
		//adding elements to arraylist
		for(int i=0;i<n;i++)
		{
			int n1=sc.nextInt();
			list.add(n1);
		}
		Set<Integer> set=new HashSet<Integer>();  //creating hashset
		set.addAll(list);          //adding all elements of arraylist to hashset
		System.out.println("Set :"+set);
	}
	}
