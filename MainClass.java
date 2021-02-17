import java.util.*;
public class MainClass 
{

	public static void main(String args [])
	{
		System.out.println("************************************************************************************");
		System.out.println("*                                Address Book System                               *");
		System.out.println("************************************************************************************");

		Scanner sc = new Scanner(System.in);
		AddressBook Person = new AddressBook();
		AddressBookLogic BookLogic = new AddressBookLogic();

		//Creating Array List AddressBook As Data type
		ArrayList<AddressBook> list = new ArrayList<AddressBook>();


		boolean done = false;
		while(done == false)
		{
			System.out.println("|----------------------------------|");
			System.out.println("|      *  Select Option *          |");
			System.out.println("|----------------------------------|");
			System.out.println("| 1 -> Add Entry                   |");
			System.out.println("| 2 -> View data                   |");
			System.out.println("| 3 -> Edit/Update data            |");
			System.out.println("| 4 -> Delete data                 |");
			System.out.println("| 5 -> Exit                        |");
			System.out.println("|----------------------------------|");
			System.out.print("Enter Your Choice:-");

			int option = sc.nextInt();
			switch(option)
			{
			case 1:
				System.out.println("------------------- Add Details -------------");
				Person = BookLogic.newBook();
				// --------- Add Data To The ArrayList ------------ //
				list.add(Person);
				System.out.println("\n * Person Details Entry Successfully Added *\n");

				break;
			case 2:
				System.out.println("\n---------------- View Details ---------------\n");
				// ---------- Display ArrayList Data ----------------- //
				for(AddressBook n : list){
					System.out.println("Full Name:-"+n.getFirstName() +" " +n.getLastName());					
					System.out.println("Address:-"+n.getAddress());
					System.out.println("City:-"+n.getCity());
					System.out.println("State:-"+n.getState());
					System.out.println("Zip:-"+n.getZip());
					System.out.println("Mobile Number:-"+n.getmobileNumber());
					System.out.println("Email:-"+n.getEmail());
					System.out.println("----------------------------------------------");
				}
				break;		
			case 3:
				System.out.println("----------- Edit/Update Details -------------");
				System.out.println("For Contact Search Type First Name of Person");
				// Accept Name 
				String update_name = sc.next();

				// Iterate loop Through Arraylist
				for(AddressBook n: list){
					if(n.getFirstName().equalsIgnoreCase(update_name)){ // Check Name if given name is present in Arraylist
						System.out.println("Enter The Address");
						String address = sc.next();
						n.setAddress(address);

						System.out.println("Enter the city");
						String city = sc.next();
						n.setCity(city);

						System.out.println("Enter the state");
						String state = sc.next();
						n.setState(state);

						System.out.println("Enter the zip Code");
						String zip = sc.next();
						n.setZip(zip);

						System.out.println("Enter the Phone number");
						String mobile = sc.next();
						n.setmobileNumber(mobile);

						System.out.println("Enter the Email");
						String email = sc.next();
						n.setEmail(email);
					}
					else
					{
						System.out.println("!!! Data Not Found !!!\n Check You Enter Data Was Right");
						System.out.println("----------------------------------------------");
					}
				}
				System.out.println("\n * Person Details Entry Modified Successfully *\n");
				break;
			case 4:
				System.out.println("------------  Delete Details -------------");
				System.out.println("For Delete Data Type First Name of Person");
				String name = sc.next(); // Accept given name for delete 
				// Iterate loop through Arraylist
				for(AddressBook n : list)
				{
					if(n.getFirstName().equalsIgnoreCase(name))
					{ // Check Name if given name is present in Arraylist
						list.remove(n);
						break;
					}
					else
					{
						System.out.println("!!! Data Not Found !!!\n Check You Enter Data Was Right");
						System.out.println("----------------------------------------------");
					}
				}
				System.out.println("\n * Person Details Entry Deleted Successfully *\n");
				break;

			case 5:
				done = true;
				System.out.println("********* Exit ********* \nfrom Address book System");
				break;

			default:
				System.out.print("!!!!!! Please choose a valid menu number");
				break;
			}
		}
	}




}
