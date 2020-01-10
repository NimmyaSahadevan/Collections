import java.util.*;
public class TreeMapExample_1 
{
	public static void main(String[] args) 
	{
		Map<Integer,String> map=new TreeMap<Integer,String>();  //creating TreeMap
		//adding keys and values
		map.put(1,"Amit");
		map.put(2, "Jai");
		map.put(5, "Rahul");
		map.put(6, "Amit");
		for(Map.Entry m:map.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());  //getting elements 
		}
	}
}
