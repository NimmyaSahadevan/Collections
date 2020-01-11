import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.*;;

public class LinkedHashMapExample_2 
{

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of values to be inserted in map :");
		int n=Integer.parseInt(bf.readLine());   //reading integer using  BufferedReader
		Map<String,Integer> linkedhashmap=new LinkedHashMap<String,Integer>(); //creating LinkedHashMap
		//adding elements
		for(int i=0;i<n;i++)
		{
			String key=bf.readLine();
			int value=Integer.parseInt(bf.readLine());
			linkedhashmap.put(key,value);
		}
		System.out.println(linkedhashmap);
		System.out.println("Enter the index to be removed : ");
		String index=bf.readLine();
		linkedhashmap.remove(index);     //removing an index value
		System.out.println(linkedhashmap);
		System.out.println("size : "+linkedhashmap.size());  //returns size of linkedhashmap
	}

}
