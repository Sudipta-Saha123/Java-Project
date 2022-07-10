package classes;

import java.lang.*;
import interfaces.*;

public abstract class Product implements IQuantity
{
	protected String barCode;
	protected String productTitle;
	protected int availableQuantity;
	protected double price;
	public static double perTransactionLimit;
	
	public Product()
	{
		System.out.println("Empty Product");
	}
	public Product(String barCode, String productTitle, int availableQuantity, double price)
	{
		System.out.println("Parameterized Product");
		this.barCode = barCode;
		this.productTitle = productTitle;
		this.price = price;
		this.availableQuantity=availableQuantity;
	}
	
	public static void setPerTransactionLimit(double translim)
	{
		perTransactionLimit = translim;
	}
	public static double getPerTransactionLimit()
	{
		return perTransactionLimit;
	}
	
	public void setBarCode(String barCode)
	{
		this.barCode = barCode;
	}
	public void setProductTitle(String productTitle)
	{
		this.productTitle = productTitle;
	}
	public void setAvailableQuantity(int availableQuantity )
	{
		this.availableQuantity = availableQuantity;
	}
	public void setPrice(double price)
	{
		this.price= price;
	}
	
	
	public String getBarCode()
	{
		return barCode;
	}
	public String getProductTitle()
	{
		return productTitle;
	}
	public int getAvailableQuantity()
	{
		return availableQuantity;
	}
	public double getPrice()
    {
		return price;
	}
	
	
	public boolean addQuantity(int amount)
	{
		if(amount>0 && amount<=perTransactionLimit)
		{
			availableQuantity = availableQuantity + amount;
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean sellQuantity(int amount)
	{
		if(amount>0 && amount<= availableQuantity && amount<=perTransactionLimit)
		{
			availableQuantity = availableQuantity - amount;
			return true;
		}
		else
		{
			return false;
		}
	}
	public abstract void showDetails();
}