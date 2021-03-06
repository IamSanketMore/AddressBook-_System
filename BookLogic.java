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
    Scanner input = new Scanner(System.in);
    ArrayList<Contact> data = new ArrayList<Contact>();
    Scanner scanReader = new Scanner(System.in);

    public static int NumberOfAddressBook;
    public  void addressBookDetails()
	{
		Map<String, ArrayList<Contact>> AddressBookMap = new HashMap<String, ArrayList<Contact>>();
		//Map<String, ArrayList<BookLogic>> AddressBookMap = new HashMap<String, ArrayList<BookLogic>>();

		
		boolean addressBookWhileLoop = true;
		while(addressBookWhileLoop)
		{
			System.out.println("|--------------------------------------|");
			System.out.println("|      * Address Book Choice *         |");
			System.out.println("|--------------------------------------|");
			System.out.println("| 1 -> Create New AddreessBook         |");
			System.out.println("| 2 -> View Names Of AddreessBook      |");
			System.out.println("| 3 -> Store Data in AddreessBook      |");
			System.out.println("| 4 -> Exit                            |");
			System.out.println("|--------------------------------------|");

			System.out.print("\n ***Enter Your Choice\t:-");
			int choiceOfAddressBook = scanReader.nextInt();
			switch(choiceOfAddressBook)
			{
			case 1:
			{
				//BookLogic.createAddressBook();
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
				//BookLogic.showAddressBook();
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
								Scanner input = new Scanner(System.in);
								System.out.println("-------------- Add Details -------------");
								//BookLogic.addDataInAddressBook();

								ArrayList<String> data = new ArrayList<String>();
								//AddressBook newBook = new AddressBook();

								System.out.println("Enter the First Name");
								String firstName = input.next();
								//	newBook.setFirstName(firstName);

								System.out.println("Enter the Last Name");
								String lastName = input.next();
								//newBook.setLastName(lastName);

								System.out.println("Enter The Address");
								String address = input.next();
								//	newBook.setAddress(address);

								System.out.println("Enter the city");
								String city = input.next();
								//	newBook.setCity(city);

								System.out.println("Enter the state");
								String state = input.next();
								//		    					newBook.setState(state);

								System.out.println("Enter the zip Code");
								String zip = input.next();
								//	newBook.setZip(zip);

								System.out.println("Enter the Phone number");
								String mobileNumber = input.next();
								//	newBook.setmobileNumber(mobileNumber);

								System.out.println("Enter the Email");
								String Email = input.next();
								//newBook.setEmail(Email);

								data.add(firstName);
								data.add(lastName);
								data.add(address);
								data.add(city);
								data.add(state);
								data.add(zip);
								data.add(mobileNumber);
								data.add(Email);
								/*		newBook.getFirstName();
		    					newBook.getLastName();
		    					newBook.getAddress();
		    					newBook.getCity();
		    					newBook.getState();
		    					newBook.getZip();
		    					newBook.getmobileNumber();
		    					newBook.getEmail();*/

								//	data.add();
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
								updateData();
								System.out.println("Person Details Updated Successfully");
								break;
							}	
							case 4:
							{
								System.out.println("------------  Delete Details -------------");
								System.out.println("For Delete Data Type First Name of Person");
								removeData();
								//System.out.println("Person Details Deleted Successfully ");
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
				}
				break;
			}//case3 : end
			case 4:
			{
				addressBookWhileLoop = false;
			}
			}//Address Book Switch End
		}//address Book While Loop end
		scanReader.close();
	}// AddressBookDetails method End

  

	public void viewData(){
        for(Contact n : data){
        	
            System.out.println("Full Name:-"+n.getFirstName() +" " +n.getLastName());
            System.out.println("Address:-"+n.getAddress());
            System.out.println("City:-"+n.getCity());
            System.out.println("State:-"+n.getState());
            System.out.println("Zip:-"+n.getZip());
            System.out.println("Mobile Number:-"+n.getmobileNumber());
            System.out.println("Email:-"+n.getEmail());
            System.out.println("----------------------------------------------");
        }
    }

    public void updateData()
    {
        String update_name = input.next();

        // Iterate loop Through Arraylist
        for(Contact n: data){
            if(n.getFirstName().equalsIgnoreCase(update_name)) // Check Name if given name is present in Arraylist
            {
                System.out.println("Enter The Address");
                String address = input.next();
                n.setAddress(address);

                System.out.println("Enter the city");
                String city = input.next();
                n.setCity(city);

                System.out.println("Enter the state");
                String state = input.next();
                n.setState(state);

                System.out.println("Enter the zip Code");
                String zip = input.next();
                n.setZip(zip);

                System.out.println("Enter the Phone number");
                String mobile = input.next();
                n.setmobileNumber(mobile);

                System.out.println("Enter the Email");
                String email = input.next();
                n.setEmail(email);
            }
        }
    }


    public void removeData()
    {
        String name = input.next(); // Accept given name for delete
        // Iterate loop through Arraylist
        for(Contact n : data){
            if(n.getFirstName().equalsIgnoreCase(name)){ // Check Name if given name is present in Arraylist
                data.remove(n);
                break;
            }
            else
            {
                System.out.println("!!! Data Not Found !!!\n Check You Enter Data Was Right");
                System.out.println("----------------------------------------------");
            }
        }
        System.out.println("\n * Person Details Entry Deleted Successfully *\n");
    }
}
