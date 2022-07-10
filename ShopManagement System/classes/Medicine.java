package classes;

import java.lang.*;

public class Medicine extends Product
{
	private String category;
	
	public Medicine()
	{
		super();
		System.out.println("E-MEDICINE");
	}
	public Medicine(String barCode, String productTitle, int availableQuantity, double price, String category)
	{
		super(barCode, productTitle, availableQuantity, price);
		this.category = category;
		System.out.println("P-MEDICINE");
	}
	
	public void setCategory(String category){this.category = category;}
	public String getCategory(){return category;}
	
	public void showDetails()
	{
		System.out.println("Product Barcode: "+barCode);
		System.out.println("Product Title: "+productTitle);
		System.out.println("Product Price: "+price);
		System.out.println("Available Quantity: "+availableQuantity);
		System.out.println("Per Transaction Limit: "+perTransactionLimit);
		System.out.println("Product Category: "+category);
	}
}