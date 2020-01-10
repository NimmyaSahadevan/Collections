
import java.util.*;

public class LinkedHashMapExample_1
{
	public static void main(String[] args) 
	{
		Map<String,Integer> map=new LinkedHashMap<String,Integer>();  //creating LinkedHashMap
		//adding keys and values
		map.put("ONE",1);
		map.put("TWO",2 );
		map.put("THREE",3);
		map.put("FOUR",4);
		for(Map.Entry m:map.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());  //getting elements 
		}

	}

}
