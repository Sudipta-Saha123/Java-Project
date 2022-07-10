package classes;

import java.lang.*;
import interfaces.*;

public class MainBranch implements SuperShopOperations, EmployeeOperations
{
	SuperShop supershops[] = new SuperShop[500];
	Employee employees[] = new Employee[100];
	
	public boolean insertSuperShop(SuperShop s)
	{
		boolean flag = false;
		for(int i=0; i<supershops.length; i++)
		{
			if(supershops[i] == null)
			{
				supershops[i] = s;
				flag = true;
				break;
			}
		}
		return flag;
	}
	public boolean removeSuperShop(SuperShop s)
	{
		boolean flag = false;
		for(int i=0; i<supershops.length; i++)
		{
			if(supershops[i] == s)
			{
				supershops[i] = null;
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	
	public void showAllSuperShops()
	{
		for(int i=0; i<supershops.length; i++)
		{
			if(supershops[i] != null)
			{
				System.out.println("-------------------------");
				supershops[i].showAllProduct();
				System.out.println();
				
			}
		}
	}
	
	public SuperShop searchSuperShop(String shopcode)
	{
		SuperShop flag = null;
		
		for(int i=0; i<supershops.length; i++)
		{
			if(supershops[i] != null)
			{
				if(supershops[i].getShopCode() == shopcode)
				{
					flag = supershops[i];
					break;
				}
			}
		}
		return flag;
	}
	
	public boolean insertEmployee(Employee e)
	{
		boolean flag = false;
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] == null)
			{
				employees[i] = e;
				flag = true;
				break;
			}
		}
		return flag;
	}
	public boolean removeEmployee(Employee e)
	{
		boolean flag = false;
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] == e)
			{
				employees[i] = null;
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	
	public void showAllEmployees()
	{
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] != null)
			{
				System.out.println("-------------------------");
				System.out.println("Employee Id: "+employees[i].getEmpId());
				System.out.println("Employee Name: "+employees[i].getName());
				System.out.println("Employee Salary: "+employees[i].getSalary());
				System.out.println();
				
			}
		}
	}
	
	public Employee searchEmployee(String empId)
	{
		Employee flag = null;
		
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] != null)
			{
				if(employees[i].getEmpId() == empId)
				{
					flag = employees[i];
					break;
				}
			}
		}
		return flag;
	}
	
}