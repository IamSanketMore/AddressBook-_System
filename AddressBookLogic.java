import java.util.*;
public class AddressBookLogic implements BookInterface
{
	Scanner input = new Scanner(System.in);
//	ArrayList<AddressBook> AddressBookList = new ArrayList<AddressBook>();
	
	//ArrayList<AddressBook> AddressBookList save(String firstName, AddressBook newBook)
	//{
	//	AddressBookList.set(String firstName,newBook);
	//	return AddressBookList;
	//}
	public AddressBook newBook()
	{
		AddressBook newBook = new AddressBook();
		
	
	      System.out.println("Enter the First Name");
	      String firstName = input.next();
	      newBook.setFirstName(firstName);
	      
	      System.out.println("Enter the Last Name");
	      String lastName = input.next();
	      newBook.setLastName(lastName);
	      
	      System.out.println("Enter The Address");
	      String address = input.next();
	      newBook.setAddress(address);
	      
	      System.out.println("Enter the city");
	      String city = input.next();
	      newBook.setCity(city);
	      
	      System.out.println("Enter the state");
	      String state = input.next();
	      newBook.setState(state);
	      
	      System.out.println("Enter the zip Code");
	      String zip = input.next();
	      newBook.setZip(zip);
	      
	      System.out.println("Enter the Phone number");
	      String mobileNumber = input.next();
	      newBook.setmobileNumber(mobileNumber);

		  System.out.println("Enter the Email");
	      String Email = input.next();
	      newBook.setEmail(Email);
	      
	      return newBook;
	}
}
