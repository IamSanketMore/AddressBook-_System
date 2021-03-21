import java.util.Comparator;
import java.util.Locale;

//----------------------------- Interface ---------------------------
interface BookInterface
{

}
//----------------------- Class AddressBook -------------------------------------
public class Contact
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


    // public AddressBook(){}
    public Contact(String firstName, String lastName, String address, String city, String state, String zip, String mobileNumber, String email)
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
    public static Comparator<Contact> SortName = new Comparator<Contact>() {
        @Override
        public int compare(Contact s1, Contact s2)
        {
            String emp1 = s1.getFirstName();
            String emp2 = s2.getFirstName();

            return  emp1.compareToIgnoreCase(emp2);

    }};

    @Override
    public String toString() {
        return "\nAddressBookContact { " +
                " firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip='" + zip + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", email='" + email + '\'' +
                '}'+ System.getProperty("line.separator");
    }

    public void showData()
    {
        System.out.println("**********************************************************************************************************");
        System.out.println(" full Name    -> " +firstName+ "  " +lastName);
        System.out.println(" Address      -> " +address);
        System.out.println(" City         -> " +city);
        System.out.println(" State        -> " +state);
        System.out.println(" Zip          -> " + zip );
        System.out.println(" MobileNumber -> " +mobileNumber);
        System.out.println(" E-mail       -> " +email);
        System.out.println("**********************************************************************************************************");
    }


}
