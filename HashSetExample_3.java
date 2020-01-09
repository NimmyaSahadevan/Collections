import java.util.*;
public class HashSetExample_3 
{
	public static void main(String[] args) 
	{
		Set<String> popularCities=new HashSet<String>();  //creating HashSet
		System.out.println("is popularCities set empty? : "+popularCities.isEmpty());  //checks whether HashSet is empty or not
		//adding elements to HashSet
		popularCities.add("London");
		popularCities.add("New York");
		popularCities.add("Paris");
		popularCities.add("Dubai");
		System.out.println("Number of cities in the HashSet "+popularCities.size());  // returns size of HashSet
		
		//checks whether specified element is in the HashSet
		if(popularCities.contains("Paris"))
		{
			System.out.println("Paris is in the popular cities set");
		}
	}
}
