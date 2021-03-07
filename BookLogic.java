import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
//import java.util.Map.Entry;
import java.util.Scanner;
//import java.util.Set;
public class BookLogic implements BookInterface
{
	Map<String, ArrayList<Contact>> AddressBookMap = new HashMap<String, ArrayList<Contact>>();
    ArrayList<Contact> data = new ArrayList<Contact>();
    Scanner scanReader = new Scanner(System.in);

    public static int NumberOfAddressBook;
    
	public  void addressBookDetails()
	{
		Map<String, ArrayList<Contact>> AddressBookMap = new HashMap<String, ArrayList<Contact>>();
		
		boolean addressBookWhileLoop = true;
		while(addressBookWhileLoop)
		{
			System.out.println("|--------------------------------------|");
			System.out.println("|      * Address Book Choice *         |");
			System.out.println("|--------------------------------------|");
			System.out.println("| 1 -> Create New AddreessBook         |");
			System.out.println("| 2 -> View Names Of AddreessBook      |");
			System.out.println("| 3 -> Store Data in AddreessBook      |");
			System.out.println("| 4 -> Search Person By City           |");
			System.out.println("| 5 -> Search Person By State          |");
			System.out.println("| 6 -> View Persons By City            |");
			System.out.println("| 7 -> Exit                            |");
			System.out.println("|--------------------------------------|");

			System.out.print("\n ***Enter Your Choice\t:-");
			int choiceOfAddressBook = scanReader.nextInt();
			switch(choiceOfAddressBook)
			{
			case 1:
			{
				
				System.out.println("How Many Address Book Do You Want Create :-");
				final int numOfAddressBook = scanReader.nextInt();
				NumberOfAddressBook = numOfAddressBook;
				
				ArrayList<String> AddressBookNamesList = new ArrayList<String>();
				System.out.println("Enter Unique Names of Address Book:");

				for(int i = 0; i < numOfAddressBook; i++)
				{
					while(true)
					{
						String namesOfAddressBook = scanReader.next();
						if(!AddressBookNamesList.contains(namesOfAddressBook))
						{
							AddressBookNamesList.add(namesOfAddressBook);
							AddressBookMap.put(AddressBookNamesList.get(i), new ArrayList<Contact>());
							break;
						}
						else 
						{
							System.out.println("This name of address book is already exist.Please enter new name");

						}
					}
				}
				System.out.println("You have Successfully added " + numOfAddressBook + " Address Book");
				break;
			}//Case 1: End

			case 2:
			{
				System.out.println("Total Address Book :" +NumberOfAddressBook);
				for(Map.Entry<String,ArrayList<Contact>> eachAddressbook:AddressBookMap.entrySet()) 
				{
					System.out.println("*************************************************************");
					System.out.println("*    Address Book Name  : "+eachAddressbook.getKey()+"      *");
					System.out.println("*************************************************************");
					System.out.println(eachAddressbook.getValue()+"\n");
					System.out.println("*************************************************************");
				}
				break;
			}//case 2: end

			case 3:
			{
				for(Map.Entry<String,ArrayList<Contact>> givenAddressbook:AddressBookMap.entrySet()) 
				{
					System.out.println("Enter contact in : " + givenAddressbook.getKey());

					boolean temp = true;
					while(temp) 
					{
						boolean contactWhileLoop = true;
						while (contactWhileLoop)
						{
							System.out.println("|--------------------------------------|");
							System.out.println("|    * Contact Details Choice *        |");
							System.out.println("|--------------------------------------|");
							System.out.println("| 1 -> Add Data in AddreessBook        |");
							System.out.println("| 2 -> View Data in AddreessBook       |");
							System.out.println("| 3 -> Edit/Update Data in AddreessBook|");
							System.out.println("| 4 -> Delete Data in AddreessBook     |");
							System.out.println("| 5 -> Exit                            |");
							System.out.println("|--------------------------------------|");

							System.out.print("\n ***Enter Your Choice\t:-");
							int ChoiceInConatct = scanReader.nextInt();

							switch (ChoiceInConatct)
							{

								case 1:
								{
									System.out.println("-------------- Add Details -------------");
	
									ArrayList<String> data = new ArrayList<String>();
								
	
									System.out.println("Enter the First Name");
									String firstName = scanReader.next();
									
	
									System.out.println("Enter the Last Name");
									String lastName = scanReader.next();
									
	
									System.out.println("Enter The Address");
									String address = scanReader.next();
									
	
									System.out.println("Enter the city");
									String city = scanReader.next();
	
									System.out.println("Enter the state");
									String state = scanReader.next();
	
									System.out.println("Enter the zip Code");
									String zip = scanReader.next();
	
									System.out.println("Enter the Phone number");
									String mobileNumber = scanReader.next();
	
									System.out.println("Enter the Email");
									String Email = scanReader.next();
	
									data.add(firstName);
									data.add(lastName);
									data.add(address);
									data.add(city);
									data.add(state);
									data.add(zip);
									data.add(mobileNumber);
									data.add(Email);
									
									Contact inputData=new Contact(data.get(0),data.get(1),data.get(2),data.get(3),data.get(4),data.get(5),data.get(6),data.get(7));
									
									//--------------- For avoid Duplicate Data ---------
									boolean isMatch=false;
									for(Map.Entry<String,ArrayList<Contact>> eachAddressBook:AddressBookMap.entrySet()) 
									{
										for(int index=0;index<eachAddressBook.getValue().size();index++) 
										{
											if(eachAddressBook.getValue().get(index).getFirstName().equals(inputData.getFirstName())) 
											{
												isMatch=true;
												break;
											}
	
										}
										if(isMatch) 
										{
											break;
										}									
									}
									if(!isMatch) 
									{
										AddressBookMap.get(givenAddressbook.getKey()).add(inputData);
										System.out.println("You have successfully added new contact.");
										System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------");					
									}
									else 
									{
										System.out.println("This person is already exist.Please enter contact of new person");
									}
									
									break;
								}
								case 2:
								{	System.out.println("----------- View Details ---------------");
								// ---------- Display ArrayList Data ----------------- //
								for(int i=0;i<AddressBookMap.get(givenAddressbook.getKey()).size();i++)
								{
									AddressBookMap.get(givenAddressbook.getKey()).get(i).showData();					
								}
								break;
								}
								case 3:
								{
									System.out.println("----------- Edit/Update Details -------------");
									System.out.println("For Contact Search Type First Name of Person");
									String update_name = scanReader.next();

									for(Map.Entry<String,ArrayList<Contact>> eachAddressBook:AddressBookMap.entrySet()) 
				            		{
				            			for(int index=0;index<eachAddressBook.getValue().size();index++) 
				            			{
				            				
				            				if(eachAddressBook.getValue().get(index).getFirstName().equalsIgnoreCase(update_name)) 
				            				{
				            	                System.out.println("Enter The Address");
				            	                String address = scanReader.next();
				            	                eachAddressBook.getValue().get(index).setAddress(address);
				            	                System.out.println("Enter the city");
				            	                String city = scanReader.next();
				            	                eachAddressBook.getValue().get(index).setCity(city);

				            	                System.out.println("Enter the state");
				            	                String state = scanReader.next();
				            	                eachAddressBook.getValue().get(index).setState(state);

				            	                System.out.println("Enter the zip Code");
				            	                String zip = scanReader.next();
				            	                eachAddressBook.getValue().get(index).setZip(zip);

				            	                System.out.println("Enter the Phone number");
				            	                String mobile = scanReader.next();
				            	                eachAddressBook.getValue().get(index).setmobileNumber(mobile);

				            	                System.out.println("Enter the Email");
				            	                String email = scanReader.next();
				            	                eachAddressBook.getValue().get(index).setEmail(email);		
				            				}
				            				
				            			}				
				            		}
									System.out.println("Person Details Updated Successfully");
									break;
								}	
								case 4:
								{
									System.out.println("------------  Delete Details -------------");
									System.out.println("For Delete Data Type First Name of Person");
									String deleteName = scanReader.next(); // Accept given name for delete
									
									for(Map.Entry<String,ArrayList<Contact>> givenAddressBook:AddressBookMap.entrySet()) 
				            		{
				            			for(int index=0;index<givenAddressBook.getValue().size();index++) 
				            			{
				            				
				            				if(givenAddressBook.getValue().get(index).getFirstName().equalsIgnoreCase(deleteName)) 
				            				{
				            					AddressBookMap.remove(givenAddressBook);
				            				}
				            				
				            			}				
				            		}
									System.out.println("Person Details Deleted Successfully");

									break;
								}
								case 5:
								{
									contactWhileLoop = false;
									System.out.println("********* Exit ********* \nfrom Address book System");
									break;
								}
								
								default:
								{
									System.out.print("!!!!!! Please choose a valid menu number");
									break;
								}
								}// Switch end
							}//Contact While Loop end
						
						AddressBookMap.put(givenAddressbook.getKey(), AddressBookMap.get(givenAddressbook.getKey()));
						temp = false;
						}//temp while end
					}//For Loop end
					break;
				}//case3 : end
				case 4:
				{
            		System.out.print("Enter city name State name For Search Persons :- ");
            		String cityName = scanReader.next();

            		System.out.println("------------------------------------------------------------------------------");
            		System.out.println(" *** Total Persons Lives In '"+cityName+"' City *** \n");
            		for(Map.Entry<String,ArrayList<Contact>> eachAddressBook:AddressBookMap.entrySet()) 
            		{
            			for(int index=0;index<eachAddressBook.getValue().size();index++) 
            			{
            				
            				if(eachAddressBook.getValue().get(index).getCity().equals(cityName)) 
            				{
            					System.out.println("AddressBook Name :-" +eachAddressBook.getKey() + "\t Person Name:-" + eachAddressBook.getValue().get(index).getFirstName());		
            				}
            				
            			}				
            		}
            		System.out.println("------------------------------------------------------------------------------");
            		break;
				}//Case 4 end
				case 5:
				{
					System.out.print("Enter State name For Search Persons :- ");
            		String stateName = scanReader.next();
					System.out.println("------------------------------------------------------------------------------");
            		System.out.println(" *** Total Persons Lives In '"+stateName+"' City *** \n");
            		for(Map.Entry<String,ArrayList<Contact>> eachAddressBook:AddressBookMap.entrySet()) 
            		{
            			for(int index=0;index<eachAddressBook.getValue().size();index++) 
            			{
            				if(eachAddressBook.getValue().get(index).getState().equals(stateName)) 
            				{
            					System.out.println("AddressBook Name :-" +eachAddressBook.getKey() + "\t Person Name:-" + eachAddressBook.getValue().get(index).getFirstName());								
            				}
            			}				
            		}
            		System.out.println("------------------------------------------------------------------------------");
            		break;
				}
				case 6:
				{
					for(Map.Entry<String,ArrayList<Contact>> eachAddressBook:AddressBookMap.entrySet()) 
            		{
            			for(int index=0;index<eachAddressBook.getValue().size();index++) 
            			{
            				System.out.println(eachAddressBook.getKey()+" : " +eachAddressBook.getValue().get(index).getCity() +" : "+eachAddressBook.getValue().get(index).getFirstName());
     				            				
            			}				
            		}
				}
				case 7:
				{
					addressBookWhileLoop = false;
				}// Case 5 End
			}//Address Book Switch End
		}//address Book While Loop end
		scanReader.close();
	}// AddressBookDetails method End
}//BookLogic class end
