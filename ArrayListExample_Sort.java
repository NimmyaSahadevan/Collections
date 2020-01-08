import java.util.*;
public class ArrayListExample_Sort 
{
	public static void main(String[] args)
	{
		ArrayList<Integer>marks=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		//adding inputs into list using for loop
		for(int i=0;i<n;i++)
		{
			int a=sc.nextInt();
			marks.add(a);        
		}
		System.out.println("Actual List:"+marks);
		ArrayList<Integer>duplicatemarks=(ArrayList<Integer>)marks.clone();  //creating duplicate list using clone() method
		Collections.sort(duplicatemarks);         //sorting the duplicated list
		System.out.println("Sorted List:"+duplicatemarks);  //printing duplicated list
	}

}
