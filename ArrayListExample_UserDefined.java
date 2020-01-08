import java.util.*;
class Contact
{
	private String name;
	private String phonenumber;
	public Contact(String name,String phonenumber)  //constructor
	{
		this.name=name;
		this.phonenumber=phonenumber;
	}
	//getters
	public String getName()
	{
		return name;
		
	}
	public String getphonenumber()
	{
		return phonenumber;
	}
}
public class ArrayListExample_UserDefined 
{
	public static void main(String[] args) 
	{
		ArrayList<Contact>contact=new ArrayList<Contact>();  //class as type of arraylist 
		//passing values to constructor using objects of class
		Contact firstcontact=new Contact("tim","123356");    
		Contact secondcontact=new Contact("john","134677");
		contact.add(firstcontact);
		contact.add(secondcontact);
		//getting the values from list
		for(int i=0;i<contact.size();i++)
		{
			System.out.print(contact.get(i).getName()+" ");
			System.out.print(contact.get(i).getphonenumber()+" ");
		}
	}
}
