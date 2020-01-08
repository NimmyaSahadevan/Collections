import java.util.*;
public class ArrayListExample_1 
{
	public static void main(String[] args) 
	{
		ArrayList<String> stationary=new ArrayList<String>();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)    //getting n number of inputs 
		{
			String s=sc.next();
			stationary.add(s);  //adding inputs to list
		}
		System.out.println(stationary);  //printing values
		ArrayList<String> stationary1=new ArrayList<String>();   //new arraylist
		for(int i=n-1;i>=0;i--)
		{
			stationary1.add(stationary.get(i));   //adding values from 1st list to 2nd list in reverse order
		}
		System.out.println(stationary1);         //printing new list  
	} 
}
        