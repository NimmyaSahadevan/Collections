import java.util.*;
public class HashMapExample_1 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int key;
		System.out.println("Enter the size:");
		int n=sc.nextInt();
		String value;
		Map<Integer,String> map=new HashMap<Integer,String>();  //creating HashMap
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++)
		{
			key=sc.nextInt();
			value=sc.next();
			map.put(key, value);
		}
		System.out.println(map);
		System.out.println("Enter the key to be searched:");
		int n1=sc.nextInt();
		System.out.println("Enter the value to be searched:");
		String s=sc.next();
		System.out.println(map.containsKey(n1));  //checks specified key contained in the HashMap
		System.out.println(map.containsValue(s)); //checks specified value contained in the HashMap
	}

}
