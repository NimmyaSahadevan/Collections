import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class TreeMapExample_2 
{

	public static void main(String[] args) throws IOException 
	{
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of values to be inserted in map :");
		int n=Integer.parseInt(bf.readLine());   //reading integer using  BufferedReader
		Map<String,Integer> treemap=new TreeMap<String,Integer>(); //creating TreeMap
		//adding elements
		for(int i=0;i<n;i++)
		{
			String key=bf.readLine();
			int value=Integer.parseInt(bf.readLine());
			treemap.put(key,value);
		}
		System.out.println(treemap);
		System.out.println("Enter the index to be removed : ");
		String index=bf.readLine();
		treemap.remove(index);     //removing an index value
		System.out.println(treemap);
		System.out.println("Enter the index to insert : ");
		String index1=bf.readLine();  
		System.out.println("Enter the value to be inserted : ");
		int value1=Integer.parseInt(bf.readLine());
		treemap.put(index1,value1);  //inputing a new element
		System.out.println(treemap);

	}

}
