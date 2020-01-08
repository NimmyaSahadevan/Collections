import java.util.*;
public class LinkedListExample_2 
{
	public static void main(String[] args)
	{
		LinkedList<String> list=new LinkedList<String>();  //Creating linked list
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(); 
		// adding elements to linked list
		for(int i=0;i<n;i++)
		{
			String s=sc.next();
			list.add(s);
		}
		ArrayList<String> list1=new ArrayList<String>();   //Creating array list
		int m=sc.nextInt();
		//adding elememts to array list
		for(int i=0;i<m;i++)
		{
			String s1=sc.next();
			list1.add(s1);
		}
		System.out.println("Actual LinkedList:"+list);  //prints linked list
		list.addAll(list1);   //copies array list into linked list
		System.out.println("After copy:"+list);  //prints modified linked list
	}
}
