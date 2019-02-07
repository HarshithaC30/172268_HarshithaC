package proj1;
import java.sql.Date;
public class Visit extends Customer
{
	Customer customer;
	Date date;
	double serviceExpense;
	double productExpense;
	public Visit()
	{
	
	}
	public Visit(String name,Date date) 
	{
		super(name);
		this.date=date;
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getServiceExpense() 
	{
		return serviceExpense;
	}
	
	public void setServiceExpense(double serviceExpense) 
	{
		this.serviceExpense = serviceExpense;
	}

	public double getProductExpence() 
	{
		return productExpense;
	}

	public void setProductExpence(double productExpene) 
	{
		this.productExpense = productExpense;
	}
	
	public double getTotalExpense()
	{
		DiscountRate d1=new DiscountRate();
		double productdisount,serviceddiscount=0.0,totalExpense;
		if(Customer.isMember())
		{
			serviceddiscount=d1.getServiceDiscountRate(Customer.getMemberType());
		}
		productdisount=d1.getProductDiscountRate(customer.getMemberType());
		totalExpense=serviceExpense+productExpense-productdisount*productExpense-serviceExpense*serviceddiscount;
		return totalExpense;
	}
	
}
