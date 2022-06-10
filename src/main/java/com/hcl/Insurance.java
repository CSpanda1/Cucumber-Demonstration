package com.hcl;

public class Insurance {
	
	private String customerName;
	private double totalDiscount = 0;
	private final double INSURANCE_PRICE = 2500;
	
	public void setCustomerName(String name)
	{
		System.out.println("Customer is " + name);
		System.out.println("Base price is $" + INSURANCE_PRICE);
		this.customerName = name;
	
	}
	
	public void ageDiscount(int customerAge, int requiredAge, double discountPercentage)
	{
		
		if( customerAge >= requiredAge)
		{
			System.out.println("You got the age discount! Applying " + discountPercentage + "% disount");
			totalDiscount += discountPercentage;
		}
		else
		{
			System.out.println("No age discount");
		}
	}
	
	public void noCrashDiscount(String statement, double discountPercentage)
	{
		
		if(statement.contains("No") == false || statement.contains("false") == false || statement.contains("no") == false )
		{
			System.out.println("You got the no crash discount. Applying " + discountPercentage  + "% dicount");
			totalDiscount += discountPercentage;
		}
		else
		{
			System.out.println("You did not get the no crash discount");
		}
	}
	
	public void creditScoreDiscount(int customerScore, int requiredScore, double discountPercentage)
	{
		if(customerScore >= requiredScore)
		{
			System.out.println("You got the credit score discount. Applying " + discountPercentage + "% discount");
			totalDiscount += discountPercentage;
		}
		else
		{
			System.out.println("You did not get the creidt score discount");
		}
	}
	
	public void incomeDiscount(int customerIncome, int requiredIncome, double discountPercentage)
	{
		if(customerIncome >= requiredIncome)
		{
			System.out.println("You got the income discount. Applying " + discountPercentage + "% discount");
			totalDiscount += discountPercentage;
		}
		else
		{
			System.out.println("You did not get the income discount");
		}
	}
	
	public void militaryDiscount(String customerStatement, double discountPercentage)
	{
		if(customerStatement.contains("Yes") == true || customerStatement.contains("true") == true || customerStatement.contains("yes") == true )
		{
			System.out.println("You got the military discount. Applying " + discountPercentage + "% discount");
			totalDiscount += discountPercentage;
		}
		else
		{
			System.out.println("You did not get the militray discount");
		}
	}
	
	public void studentDiscount(String customerStatement, double discountPercentage)
	{
		if(customerStatement.contains("Yes") == true || customerStatement.contains("true") == true || customerStatement.contains("yes") == true )
		{
			System.out.println("You got the student discount. Applying " + discountPercentage + "% discount");
			totalDiscount += discountPercentage;
		}
		else
		{
			System.out.println("You did not get the student discount");
		}
	}
	
	public void parkedGarageDiscount(String customerStatement, double discountPercentage)
	{
		if(customerStatement.contains("Yes") == true || customerStatement.contains("true") == true || customerStatement.contains("yes") == true )
		{
			System.out.println("You got the parked garage discount. Applying " + discountPercentage + "% discount");
			totalDiscount += discountPercentage;
		}
		else
		{
			System.out.println("You did not get the parked garage discount");
		}
	}
	
	public void accountTenureDiscount(int customerAccountTenure, int requiredAccountTenure, double discountPercentage)
	{
		if(customerAccountTenure >= requiredAccountTenure)
		{
			System.out.println("You got the account tenure dicount. Applying " + discountPercentage + "% discount");
			totalDiscount += discountPercentage;
		}
		else
		{
			System.out.println("You did not get the account tenure discount");
		}
	}
	
	public void safetyDiscount(int customersCar, int requiredSafteyFeatures, double discountPercentage)
	{
		if(customersCar >= requiredSafteyFeatures)
		{
			System.out.println("You got the safety dicount. Applying " + discountPercentage + "% discount");
			totalDiscount += discountPercentage;
		}
		else
		{
			System.out.println("You did not get the saftey discount");
		}
	}
	
	public void autoDraftDiscount(String customerStatement, double discountPercentage)
	{
		if(customerStatement.contains("Yes") == true || customerStatement.contains("true") == true || customerStatement.contains("yes") == true )
		{
			System.out.println("You got the auto draft discount. Applying " + discountPercentage + "% discount");
			totalDiscount += discountPercentage;
		}
		else
		{
			System.out.println("You did not get the auto draft discount");
		}
	}
	
	public void bundleDiscount(String customerStatement, double discountPercentage)
	{
		if(customerStatement.contains("Yes") == true || customerStatement.contains("true") == true || customerStatement.contains("yes") == true )
		{
			System.out.println("You got the bundle discount. Applying " + discountPercentage + "% discount");
			totalDiscount += discountPercentage;
		}
		else
		{
			System.out.println("You did not get the bundle discount");
		}
	}
	
	public void yearlyMileageDiscount(int customersCarMileage, int requiredMileage, double discountPercentage)
	{
		if(customersCarMileage <= requiredMileage)
		{
			System.out.println("You got the yearly mileage dicount. Applying " + discountPercentage + "% discount");
			totalDiscount += discountPercentage;
		}
		else
		{
			System.out.println("You did not get the yearly mileage discount");
		}
	}
	
	
	public void lienDiscount(String customerStatement, double discountPercentage)
	{
		if(customerStatement.contains("Yes") == true || customerStatement.contains("true") == true || customerStatement.contains("yes") == true )
		{
			System.out.println("You got the lien discount. Applying " + discountPercentage + "% discount");
			totalDiscount += discountPercentage;
		}
		else
		{
			System.out.println("You did not get the lien discount");
		}
	}
	
	public void MileageDiscount(int customersCarMileage, int requiredMileage, double discountPercentage)
	{
		if(customersCarMileage <= requiredMileage)
		{
			System.out.println("You got the mileage dicount. Applying " + discountPercentage + "% discount");
			totalDiscount += discountPercentage;
		}
		else
		{
			System.out.println("You did not get the mileage discount");
		}
	}
	
	
	public void electricCarDiscount(String customerStatement, double discountPercentage)
	{
		if(customerStatement.contains("Yes") == true || customerStatement.contains("true") == true || customerStatement.contains("yes") == true )
		{
			System.out.println("You got the electric car discount. Applying " + discountPercentage + "% discount");
			totalDiscount += discountPercentage;
		}
		else
		{
			System.out.println("You did not get the electric car discount");
		}
	}
	
	
	
	/*
	 * BAD PRACTICE! ALWAYS PUT A RETURN TYPE
	 */
	public void getTotalDiscount()
	{
		System.out.println("You got a total discount of " +totalDiscount +"%");
		calulatedDiscount();
		
	}
	
	public void calulatedDiscount()
	{
		double newPrice = INSURANCE_PRICE - (INSURANCE_PRICE * totalDiscount / 100);
		System.out.printf("Your total insurence cost is $%.2f", newPrice);
	}

}
