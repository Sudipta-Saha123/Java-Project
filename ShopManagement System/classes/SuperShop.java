package classes;

import java.lang.*;
import interfaces.*;

public class SuperShop implements ProductItemOperations
{
	private String shopcode;
	private String address;
	private Product products[] = new Product[100];
	
	public SuperShop()
	{
		System.out.println("Empty-SuperShop");
	}
	
	public SuperShop(String shopcode, String address)
	{
		System.out.println("Parameterized-SuperShop");
		this.shopcode = shopcode;
		this.address = address;
	}
	
	public void setShopCode(String shopcode)
	{
		this.shopcode = shopcode;
	}
	public void setAddress(String address)
	{
		this.address = address;
	}
	
	public String getShopCode()
	{
		return shopcode;
	}
	public String getAddress()
	{
		return address;
	}
	
	public boolean insertProduct(Product p)
	{
		boolean flag = false;
		for(int i=0; i<products.length; i++)
		{
			if(products[i] == null)
			{
				products[i] = p;
				flag = true;
				break;
			}
		}
		return flag;
	}
	public boolean removeProduct(Product p)
	{
		boolean flag = false;
		for(int i=0; i<products.length; i++)
		{
			if(products[i] == p)
			{
				products[i] = null;
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	
	public void showAllProduct()
	{
		System.out.println("SuperShop Code Number: "+shopcode);
		System.out.println("SuperShop Address: "+address);
		
		for(int i=0; i<products.length; i++)
		{
			if(products[i] != null)
			{
				System.out.println("-------------------------");
				products[i].showDetails();
				System.out.println();
				
			}
		}
	}
	
	public Product searchProduct(String barCode)
	{
		Product flag = null;
		
		for(int i=0; i<products.length; i++)
		{
			if(products[i] != null)
			{
				if(products[i].getBarCode() == barCode)
				{
					flag = products[i];
				    break;
				}
			}
		}
		return flag;
	}
}