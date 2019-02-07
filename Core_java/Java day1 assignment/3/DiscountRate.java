package proj1;
import java.sql.Date;
public class DiscountRate extends Visit
{
	public DiscountRate(String name, Date date) 
	{
		super(name, date);
	}
	static double serviceDiscountPremium = 0.2;
	static double serviceDiscountGold = 0.15;
	static double serviceDiscountSilver = 0.1;
	static double productDiscountPremium = 0.1;
	static double productDiscountGold = 0.1;
	static double productDiscountSilver = 0.1;
	double discount;
	
	public DiscountRate()
	{
		
	}
	
	 public static double getServiceDiscountRate(String type) {
	        if(type=="Premium") 
	        {
	            return serviceDiscountPremium;
	        }
	        else if(type=="Gold")
	        {
	                return serviceDiscountGold;
	        } 
	        else if(type=="Silver")
	        {
	                return serviceDiscountSilver;
	        }
	        else
	        {
	        	return 0;
	        }
	}
	 public static double getProductDiscountRate(String type) 
	 {
	        if(type=="Premium")
	        {
	                return productDiscountPremium;
	        } 
	        else if(type=="Gold")
	        {
	                return productDiscountGold;
	        } 
	        else if(type=="Silver")
	        {
	                return productDiscountSilver;
	        } 
	        else
	        {
	        	return 0;
	        }
	}
}
