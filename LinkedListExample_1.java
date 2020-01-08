import java.util.*;
public class LinkedListExample_1
{

	public static void main(String[] args) 
	{
		List word=new LinkedList(); //creating linked list
		//adding elements into linked list
		word.add("Competition");
		word.add("Be Positive");
		word.add("Happy Day");
		Iterator itr=word.iterator();//creating iterator object
		while(itr.hasNext())  //checks whether list contains next element
		{
			System.out.println(itr.next()); //prints next element
		}

	}

}
