import java.lang.*;
import fileio.*;
import classes.*;
import java.util.*;


public class Start
{
	public static void main(String args[])
	{
		MainBranch mb = new MainBranch();
		Product.perTransactionLimit = 6000.0;
		FileReadWriteDemo frwd = new FileReadWriteDemo();
		Scanner sc = new Scanner(System.in); // sc is an object of Scanner class, which is used to take user input
											 // nextInt() -> method to take int input.
											 // nextDouble() -> method to take double input.
											 // next() -> method to take String input.
											 // next().charAt(0) -> method to take char input.
		
		boolean repeat = true;
		
		System.out.println("-----------------------------");
		System.out.println("**********Welcome to Plus Pharma  **********");
		System.out.println("------------------------------");
		
		while(repeat)
		{
			System.out.println("What do you want to chose?\n");
			System.out.println("\t1. Employee Management");
			System.out.println("\t2. SuperShop Management");
			System.out.println("\t3. SuperShop Product Management");
			System.out.println("\t4. Product Quantity Add-Sell");
			System.out.println("\t5. Exit");
			System.out.println();
			
			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();
			
			switch(choice)
			{
				case 1:
					
					System.out.println("-----------------------------------");
					System.out.println("You have Choose Employe Management");
					System.out.println("------------------------------------");
					
					System.out.println("\nYou have the following option: \n");
					System.out.println("-----------------------------------");
					System.out.println("\t1. Insert New Employee");
					System.out.println("\t2. Remove Existing Employee");
					System.out.println("\t3. Show All Employees");
					System.out.println("\t4. Search an Employee");
					System.out.println("\t5. Go Back");
					System.out.println("-----------------------------------");
					System.out.println();
					
					System.out.print("Enter your option: ");
					int option1 = sc.nextInt();
					
					switch(option1)
					{
						case 1: 
						
							System.out.println("-----------------------------------");
							System.out.println("Insert New Employee Selected");
							System.out.println("------------------------------------");
							
							System.out.print("Enter Employee Id: ");
							String empId1 = sc.next();
							System.out.print("Enter Employee Name: ");
							String name1 = sc.next();
							System.out.print("Enter Employee Salary: ");
							double salary1 = sc.nextDouble();
							
							Employee e1 = new Employee();
							e1.setEmpId(empId1);
							e1.setName(name1);
							e1.setSalary(salary1);
							
							if(mb.insertEmployee(e1)){System.out.println("Employee Inserted.....EmpID: "+e1.getEmpId());}
							else{System.out.println("Employee can not founded......EmpID: "+e1.getEmpId());}
							
							System.out.println();
							break;
							
						case 2:
						
							System.out.println("--------------------------------------");
							System.out.println("You have Choose Remove Existing Employee");
							System.out.println("----------------------------------------");
							
							System.out.print("Enter Employee Id: ");
							String empId2 = sc.next();
							
							Employee e2 = mb.searchEmployee(empId2);
							
							if(e2 != null)
							{
								if(mb.removeEmployee(e2)){System.out.println("Employee Removed....EmpID: "+e2.getEmpId());}
								else{System.out.println("Something is wrong.");}
							}
							else{System.out.println("Employee not found....EmpID: " +e2.getEmpId());}
							
							System.out.println();
							break;
							
						case 3:
						
							System.out.println("------------------------------------");
							System.out.println("You have Choose Show All Employees");
							System.out.println("-------------------------------------");
							
							mb.showAllEmployees();
							
							System.out.println();
							break;
							
						case 4:
							
							System.out.println("-----------------------------------");
							System.out.println("You have choose Search an Employee");
							System.out.println("------------------------------------");
							
							System.out.print("Enter EmpId: ");
							String empId4 = sc.next();
							
							Employee e4 = mb.searchEmployee(empId4);
							
							if(e4 != null)
							{
								System.out.println("Employee Found.......");
								System.out.println("Employee ID: "+e4.getEmpId());
								System.out.println("Employee Name: "+e4.getName());
								System.out.println("Employee Salary: "+e4.getSalary());
								System.out.println();
							}
							else{System.out.println("Employee not Found.....");}
								
							System.out.println();
							break;
						
						case 5:
						
							System.out.println("-----------------------------------");
							System.out.println("Going Back......");
							System.out.println("------------------------------------");
							
							System.out.println();
							break;
							
						default:
							
							System.out.println("------------------------------------");
							System.out.println("Invalid Option.");
							System.out.println("-------------------------------------");
							
							System.out.println();
							break;
					}
					
					System.out.println();
					break;
				
				case 2:
					
					System.out.println("------------------------------------");
					System.out.println("You have choose SuperShop Management");
					System.out.println("-------------------------------------");
					
					System.out.println("\nYou have the Following Option: \n");
					System.out.println("-----------------------------------");
					System.out.println("\t1. Insert New SuperShop");
					System.out.println("\t2. Remove Existing SuperShop");
					System.out.println("\t3. Show All SuperShop");
					System.out.println("\t4. Search a SuperShop");
					System.out.println("\t5. Go Back");
					System.out.println("-----------------------------------");
					System.out.println();
					
					System.out.print("Enter your option: ");
					int option2 = sc.nextInt();
					
					switch(option2)
					{
						case 1: 
						
							System.out.println("------------------------------------");
							System.out.println("Insert New SuperShop Selected");
							System.out.println("------------------------------------");
							
							System.out.print("Enter SuperShop Code: ");
							String shopcode1 = sc.next();
							System.out.print("Enter SuperShop Address: ");
							String address1 = sc.next();
							
							SuperShop s1= new SuperShop();
							s1.setShopCode(shopcode1);
							s1.setAddress(address1);
							
							if(mb.insertSuperShop(s1)){System.out.println("SuperShop Inserted...Shop Code: "+s1.getShopCode());}
							else{System.out.println("SuperShop can not be inserted......");}
							
							System.out.println();
							break;
							
						case 2:
						
							System.out.println("------------------------------------");
							System.out.println("You have choose Remove existing SuperShop");
							System.out.println("------------------------------------");
							
							System.out.print("Enter SuperShop code: ");
							String shopcode2 = sc.next();
							
							SuperShop s2 = null;
							s2= mb.searchSuperShop(shopcode2);
							
							if(s2 != null)
							{
								if(mb.removeSuperShop(s2)){System.out.println("SuperShop Removed......\n ID: "+s2.getShopCode());}
								else{System.out.println("Oops. SuperShop cannot removed.....");}
							}
							else{System.out.println("No Restaurant found to remove.");}
							
							System.out.println();
							break;
							
						case 3:
						
							System.out.println("------------------------------------");
							System.out.println("You have choose Show All SuperShop");
							System.out.println("------------------------------------");
							
							mb.showAllSuperShops();
							
							System.out.println();
							break;
							
						case 4:
						
							System.out.println("------------------------------------");
							System.out.println(" You have choose Search a SuperShop ");
							System.out.println("------------------------------------");
							
							System.out.print("Enter SuperShop Code: ");
							String shopcode4 = sc.next();
							
							SuperShop s4 = mb.searchSuperShop(shopcode4);
							
							if(s4 != null)
							{
								System.out.println("SuperShop Found......");
								System.out.println("SuperShop Code: "+s4.getShopCode());
								System.out.println("SuperShop Address: "+s4.getAddress());
								System.out.println();
							}
							else{System.out.println(" SuperShop not Found.....");}
								
							System.out.println();
							break;
						
						case 5:
						
							System.out.println("------------------------------------");
							System.out.println("Going Back.......");
							System.out.println("------------------------------------");
							
							System.out.println();
							break;
							
						default:
							
							System.out.println("------------------------------------");
							System.out.println("Invalid Option.");
							System.out.println("------------------------------------");
							
							System.out.println();
							break;
						
					}
					
					System.out.println();
					break;
					
				case 3:
				
					System.out.println("---------------------------------------");
					System.out.println("You have choose SuperShop product Management");
					System.out.println("-----------------------------------------");
					
					System.out.println("\nYou have the following option: \n");
					System.out.println("-----------------------------------");
					System.out.println("\t1. Insert New Product");
					System.out.println("\t2. Remove Existing Product");
					System.out.println("\t3. Show All Products");
					System.out.println("\t4. Search a Product");
					System.out.println("\t5. Go Back");
					System.out.println("-----------------------------------");
					System.out.println();
					
					System.out.print("Enter your option: ");
					int option3 = sc.nextInt();
					
					switch(option3)
					{
						case 1: 
						
							System.out.println("-------------------------------------");
							System.out.println("You have choose Insert New Product");
							System.out.println("-------------------------------------");
							
							System.out.println("There are two Types of Food Products: ");
							System.out.println("\t1. Grocery");
							System.out.println("\t2. Medicine");
							System.out.println("\t3. Go Back");
							
							System.out.print("Enter Your Type: ");
							int type = sc.nextInt();
							
							Product p = null;
							
							if(type == 1)
							{
								System.out.println("-------------------------------------");
								System.out.println("Your Type is: Grocery");
								System.out.println("-------------------------------------");
								
								System.out.print("Enter product code: ");
								String barc = sc.next();
								System.out.print("Enter Product Name: ");
								String pt = sc.next();
								System.out.print("Enter Product Price: ");
								double pr = sc.nextDouble();
								System.out.print("Enter product Availability: ");
								int aq = sc.nextInt();
								System.out.print("Enter Product Category: ");
								String cat1= sc.next();
								
								Grocery gc = new Grocery(barc, pt, aq, pr, cat1);
								
								p = gc;
							}
							else if(type == 2)
							{
								System.out.println("***********************************");
								System.out.println("Your Type is: Medicie");
								System.out.println("***********************************");
								
								System.out.print("Enter Product code: ");
								String barc = sc.next();
								System.out.print("Enter Product Name: ");
								String pt = sc.next();
								System.out.print("Enter Product Price: ");
								double pr = sc.nextDouble();
								System.out.print("Enter Product Availability: ");
								int aq = sc.nextInt();
								System.out.print("Enter product category: ");
								String cat1= sc.next();
								
								Medicine mc = new Medicine(barc, pt, aq, pr, cat1);
								
								p = mc;
							}
							else if(type == 3)
							{
								System.out.println("-------------------------------------");
								System.out.println("Going Back......");
								System.out.println("-------------------------------------");
							}
							else
							{
								System.out.println("-------------------------------------");
								System.out.println("Invalid Type.....");
								System.out.println("-------------------------------------");
							}
							
							if(p != null)
							{
								System.out.print("Enter SuperShop code: ");
								String shopcode1 = sc.next();
								
								SuperShop s31 = mb.searchSuperShop(shopcode1);
								
								if( s31 != null)
								{
									if(s31.insertProduct(p)){System.out.println("Product Inserted. "+ p.getBarCode() + " for "+ s31.getShopCode());}
									else{System.out.println("Oops.... Something is Wrong......");}
								}
								else{System.out.println("Product not inserted......");}
							}
							
							System.out.println();
							break;
							
						case 2:
						
							System.out.println("-------------------------------------");
							System.out.println("You have Choose Remove Existing Product ");
							System.out.println("-------------------------------------");
							
							 System.out.print("Enter SuperShop code : ");
							 String shopcode1 = sc.next();
                            SuperShop  s32= mb.searchSuperShop(shopcode1); 
                            if (s32 == null) {
                                System.out.println("Invalid supershop code");
                                break;
                            }
							
                            System.out.print("Enter a Product id to Remove : ");
							String barCode1 = sc.next();
                            Product p1= s32.searchProduct(barCode1);

                            if (p1 != null) {
                                if (s32.removeProduct(p1)){
                                    System.out.println("Product Removed");
                                } 
                                else {System.out.println("Product not removed.....");}
                            } 
                            else {System.out.println("Invalid food item ID");}
							
							System.out.println();
							break;
							
						case 3:
						
							System.out.println("-------------------------------------");
							System.out.println("You have choose Show All Product");
							System.out.println("-------------------------------------");
							
							System.out.print("Enter SuperShop code: ");
							String shopcode3 = sc.next();
							
							SuperShop s3=mb.searchSuperShop(shopcode3);
							
							if(s3!= null)
							{
								s3.showAllProduct();
							}
							else{System.out.println("Oops, Something is Wrong......");}
							
							System.out.println();
							break;
							
						case 4:
						
							System.out.println("-------------------------------------");
							System.out.println("You have choose Search a Product");
							System.out.println("-------------------------------------");
							
							System.out.print("Enter SuperShop Code: ");
							String shopcode4= sc.next();
							SuperShop s4= mb.searchSuperShop(shopcode4);
							if(s4 == null)
							{
								System.out.println("Invalid SuperShop");
							}
							System.out.print("Enter Food Item ID: ");
							String barCode4= sc.next();
								
							Product p4= s4.searchProduct(barCode4);
							if(p4 != null)
							{
								System.out.println("Product Found.");
								System.out.println("Product Code: "+ p4.getBarCode());
							    System.out.println("Product Title: "+ p4.getProductTitle());
								System.out.println("Product price: "+ p4.getPrice());
								System.out.println("Product Availability: "+ p4.getAvailableQuantity());
							}
							else{System.out.println("Oops. Something is Wrong......");}
							
							
							System.out.println();
							break;
						
						case 5:
						
							System.out.println("-------------------------------------");
							System.out.println("Going Back.......");
							System.out.println("-------------------------------------");
							
							System.out.println();
							break;
							
						default:
							
							System.out.println("-------------------------------------");
							System.out.println("Invalid Option......");
							System.out.println("-------------------------------------");
							
							System.out.println();
							break;
						
					}
					
					System.out.println();
					break;
				
				case 4:
				
					System.out.println("------------------------------------------");
					System.out.println("Your have choose product Quantity Add-Sell");
					System.out.println("-----------------------------------------");
					
					System.out.println("\nYou have the following option: \n");
					System.out.println("-----------------------------------");
					System.out.println("1. Add Product");
					System.out.println("2. Sell Product");
					System.out.println("3. Show Add Sell History");
					System.out.println("4. Go Back");
					System.out.println("-----------------------------------");
					System.out.println();
					
					System.out.print("Enter your option: ");
					int option4 = sc.nextInt();
					
					switch(option4)
					{
						case 1: 
						
							System.out.println("-------------------------------------");
							System.out.println("You have choose Add Product");
							System.out.println("-------------------------------------");
							System.out.print("Enter SuperShop code: ");
							
							String shopcode1 = sc.next();
							
							SuperShop s41 = mb.searchSuperShop(shopcode1);
							
							if(s41 != null)
							{
								System.out.print("Enter Food Item Number: ");
								String barCode1 = sc.next();
								
								Product p = s41.searchProduct(barCode1);
								
								if(p != null)
								{
									System.out.print("Enter Amount: ");
									int am = sc.nextInt();
									System.out.println("Current Quantity: " + p.getAvailableQuantity());
									if(p.addQuantity(am))
									{
										System.out.println("Adding Quantity: "+ am + "     Successful");
										System.out.println("New Balance: "+p.getAvailableQuantity());
										frwd.writeInFile("Deposit: "+am+" in "+p.getBarCode());
										
									}
									else
									{
										System.out.println("Oops. Something is Wrong.");
									}
								}
								
							}
							
							System.out.println();
							break;
							
						case 2:
						
							System.out.println("***********************************");
							System.out.println("Your have choose Sell Product");
							System.out.println("***********************************");
							System.out.print("Enter SuperShop code: ");
							
							String shopcode2 = sc.next();
							
							SuperShop s42 = mb.searchSuperShop(shopcode2);
							
							if(s42 != null)
							{
								System.out.print("Enter Product code: ");
								String barCode2 = sc.next();
								
								Product p = s42.searchProduct(barCode2);
								
								if(p != null)
								{
									System.out.print("Enter Amount: ");
									int am = sc.nextInt();
									System.out.println("Current Balance: " + p.getAvailableQuantity());
									if(p.sellQuantity(am))
									{
										System.out.println("Withdrawing Amount: "+ am + "     Successful");
										System.out.println("New Balance: "+p.getAvailableQuantity());
										frwd.writeInFile("Withdraw: "+am+" from "+p.getBarCode());
									}
									else
									{
										System.out.println("Oops. Something is Wrong.");
									}
								}
								
							}
							
							System.out.println();
							break;
							
						case 3:
						
							System.out.println("-------------------------------------");
							System.out.println("Your have choose Show Add Sell History");
							System.out.println("-------------------------------------");
							
							frwd.readFromFile();
							
							System.out.println();
							break;
							
						
						case 4:
						
							System.out.println("-------------------------------------");
							System.out.println("Going Back.......");
							System.out.println("-------------------------------------");
							
							System.out.println();
							break;
							
						default:
							
							System.out.println("***********************************");
							System.out.println("Invalid Option......");
							System.out.println("***********************************");
							
							System.out.println();
							break;
					}
					
					System.out.println();
					break;
				
				case 5:
				
					repeat = false;
					System.out.println("------------------------------");
					System.out.println("Thank you for using our System");
					System.out.println("-------------------------------");
					
					System.out.println();
					break;
					
				default:
				
					System.out.println("--------------------------------");
					System.out.println("you have choose Invalid Choice.....");
					System.out.println("----------------------------------");
					
					System.out.println();
					break;
			}
		}
	}
}