import java.util.Scanner;

public class AddressBookSystem
{
	public static void main(String args [])
	{
		System.out.println("************************************************************************************");
		System.out.println("*                                Address Book System                               *");
		System.out.println("************************************************************************************");
		
		Contact object = new Contact("Sanket","More","Deopur Dhule","Dhule","Maharastra","424005","8180019348","sanketmore.999.m@gmail.com");
		
		object.viewData();
	}
}
class Contact
{
		String firstName;
		String lastName;
		String address;
		String city;
		String state;
		String zip;
		String mobileNumber;
		String email;
	
		Scanner sc = new Scanner(System.in);
		
		Contact(String firstName, String lastName,String address,String city,String state,String zip,String mobileNumber,String email)
		{
			this.firstName = firstName;
			this.lastName = lastName;
			this.address = address;
			this.city = city;
			this.state = state;
			this.zip = zip;
			this.mobileNumber = mobileNumber;
			this.email  = email;
		}
		public String getData()
		{
			System.out.println("Enter First Name:-");
			firstName =  sc.next();
			System.out.println("Enter Last Name:-");
			lastName =  sc.next();
			System.out.println("Enter Address:-");
			address =  sc.next();
			System.out.println("Enter City:-");
			city =  sc.next();
			System.out.println("Enter State:-");
			state =  sc.next();
			System.out.println("Enter Zip Code:-");
			zip =  sc.next();
			System.out.println("Enter a Mobile Number:-");
			mobileNumber =  sc.next();
			System.out.println("Enter a Email Id:-");
			email =  sc.next();
			
			return firstName;
		}	
		public void viewData()
		{
			getData();
			System.out.println("First Name:-"+firstName);
			System.out.println("Last Name:-"+lastName);
			System.out.println("Address:-"+address);
			System.out.println("City:-"+city);
			System.out.println("State:-"+state);
			System.out.println("Zip Code:-"+zip);
			System.out.println("Mobile Number:-"+mobileNumber);
			System.out.println("Email Id:-"+email);
		}
}
