public class AddressBookSystem
{
	public static void main(String args [])
	{
		System.out.println("************************************************************************************");
		System.out.println("*                                Address Book System                               *");
		System.out.println("************************************************************************************");
		
		Contact object = new Contact("Sanket","More","Deopur Dhule","Dhule","Maharastra","424005","8180019348","sanketmore.999.m@gmail.com");
		
		object.contacts();
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
		public void contacts()
		{
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
