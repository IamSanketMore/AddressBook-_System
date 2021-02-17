import java.util.*;
public class AddressBook 
{
		private String firstName;
		private String lastName;
		private String address;
		private String city;
		private String state;
		private String zip;
		private String mobileNumber;
		private String email;

//------------First Name--------------------
		public String getFirstName() 
		{
			return firstName;
		}

		public void setFirstName(String firstName) 
		{
			this.firstName = firstName;
		}
//---------- Last Name----------------
		public String getLastName() 
		{
			return lastName;
		}
		
		public void setLastName(String lastName) 
		{
			this.lastName = lastName;
		}
//----------------address------------------
		public String getAddress() 
		{
			return address;
		}
		public void setAddress(String address) 
		{
			this.address = address;
		}
//----------------City-------------------------
		public String getCity() 
		{
			return city;
		}

		public void setCity(String city) 
		{
			this.city = city;
		}
//--------------State------------------------
		public String getState() 
		{
			return state;
		}
		public void setState(String state) 
		{
			this.state = state;
		}
//-------------Zip-------------------------------
		public String getZip() 
		{
			return zip;
		}
		public void setZip(String zip) 
		{
			this.zip = zip;
		}
//----------------- MObilr Number-------------------------
		public String getmobileNumber() 
		{
			return mobileNumber;
		}
		public void setmobileNumber(String mobileNumber) 
		{
			this.mobileNumber = mobileNumber;
		}
//---------------Email---------------------------------
		public String getEmail() 
		{
			return email;
		}
		public void setEmail(String email) 
		{
			this.email = email;
		}

		
		public AddressBook(){}
		public AddressBook(String firstName, String lastName, String address, String city, String state, String zip, String mobileNumber, String email)
		{
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.address = address;
	        this.city = city;
	        this.state = state;
	        this.zip = zip;
	        this.mobileNumber = mobileNumber;
	        this.email = email;
	    }

		public String toString() 
		{
			return "AddressBookContact{" +
					"firstName='" + firstName + '\'' +      ", lastName='" + lastName + '\'' +
					", Address='" + address + '\'' +
					", city='" + city + '\'' +
					", state='" + state + '\'' +
					", zip=" + zip +
					", mobileNumber=" + mobileNumber +
					", email=" + email +
					'}';
		}
}
