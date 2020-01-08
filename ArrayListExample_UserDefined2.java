import java.util.*;
class Customer
{
	private ArrayList<Double>transactions;
	private ArrayList<String>names;
	public Customer(String name,double initialAmount)
	{
		this.names=new ArrayList<String>();
		this.transactions=new ArrayList<Double>();
		addTransaction(initialAmount);
		addName(name);
	}
	//storing the transactions in a seperate arraylist of type double
	public void addTransaction(double amount)
	{
		this.transactions.add(amount);
	}
	//storing the names in a seperate arraylist of type double
	public void addName(String c_name )
	{
		this.names.add(c_name);
	}
	public ArrayList<String> getName()
	{
		return names;
	}
	public ArrayList<Double> getTransactions()
	{
		return transactions;
	}
}
public class ArrayListExample_UserDefined2 
{
	public static void main(String[] args) 
	{
		ArrayList<Customer> customer=new ArrayList<Customer>();
		Customer customer1=new Customer("John",20000D);
		customer1.addTransaction(30000D);
		customer1.addTransaction(50000D);
		customer.add(customer1);
		Customer customer2=new Customer("Tim",15000D);
		customer2.addTransaction(20000D);
		customer.add(customer2);
		for(int i=0;i<customer.size();i++)
		{
			Customer customer3=customer.get(i);
			for(int k=0;k<customer3.getName().size();k++)
			{
				String customer_name=customer3.getName().get(k);
				System.out.println(customer_name);
			}
			for(int j=0;j<customer3.getTransactions().size();j++)
			{
				Double transaction=customer3.getTransactions().get(j);
				System.out.println(transaction);
			}
		}
	}
}

