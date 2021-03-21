public class AddressBookMain
{
    public static void main(String [] args)
    {
        System.out.println("************************************************************************************");
        System.out.println("*                                Address Book System                               *");
        System.out.println("************************************************************************************");

        BookLogic BookLogic = new BookLogic();
        BookLogic.addressBookDetails();
    }// main methood end

}
