import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.Map.Entry.comparingByValue;
import static java.util.stream.Collectors.toMap;

public class BookLogic implements BookInterface
{
    Map<String, ArrayList<Contact>> AddressBookMap = new HashMap<String, ArrayList<Contact>>();
    ArrayList<Contact> data = new ArrayList<Contact>();

    Scanner scanReader = new Scanner(System.in);
    //ArrayList<String> data = new ArrayList<String>();
    Contact c =new Contact("Sanket","More","Dhule","dhule","MH","78421","7845127845","Sanket@123");

    public static int NumberOfAddressBook;

    public  void addressBookDetails()
    {
        Map<String, ArrayList<Contact>> AddressBookMap = new HashMap<String, ArrayList<Contact>>();

        boolean addressBookWhileLoop = true;
        while(addressBookWhileLoop)
        {
            System.out.println("\n|---------------------------------------|");
            System.out.println("|       * Address Book Choice *         |");
            System.out.println("|---------------------------------------|");
            System.out.println("| 1  -> Create New AddreessBook         |");
            System.out.println("| 2  -> View Names Of AddreessBook      |");
            System.out.println("| 3  -> Store Data in AddreessBook      |");
            System.out.println("| 4  -> Search Person By City           |");
            System.out.println("| 5  -> Search Person By State          |");
            System.out.println("| 6  -> View Persons By City            |");
            System.out.println("| 7  -> View Persons By State           |");
            System.out.println("| 8  -> Total Number  Persons In City   |");
            System.out.println("| 9  -> Total Number  Persons In State  |");
            System.out.println("| 10 -> Sort Name Alphabetically        |");
            System.out.println("| 11 -> Exit                            |");
            System.out.println("|---------------------------------------|");

            System.out.print("\n ----------- [ Enter Your Choice ] -----------\n");
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
                        System.out.println("\n You are in [ " + givenAddressbook.getKey() +" ] Address Book \n");

                        boolean temp = true;
                        while(temp)
                        {
                            boolean contactWhileLoop = true;
                            while (contactWhileLoop)
                            {
                                System.out.println("\n|--------------------------------------|");
                                System.out.println("|    * Contact Details Choice *        |");
                                System.out.println("|--------------------------------------|");
                                System.out.println("| 1 -> Add Data in AddressBook         |");
                                System.out.println("| 2 -> View Data in AddressBook        |");
                                System.out.println("| 3 -> Edit/Update Data in AddressBook |");
                                System.out.println("| 4 -> Delete Data in AddressBook      |");
                                System.out.println("| 5 -> Exit                            |");
                                System.out.println("|--------------------------------------|");

                                System.out.print("\n ----------- [ Enter Your Choice ] -----------\n");
                                int ChoiceInConatct = scanReader.nextInt();

                                switch (ChoiceInConatct)
                                {

                                    case 1:
                                    {
                                        System.out.println("--------------------- Add Details in [ " + givenAddressbook.getKey() +" ] Address Book--------------------------");

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

                                        c.setFirstName(firstName);
                                        c.setLastName(lastName);
                                        c.setAddress(address);
                                        c.setCity(city);
                                        c.setState(state);
                                        c.setZip(zip);
                                        c.setmobileNumber(mobileNumber);
                                        c.setEmail(Email);

                                       Contact inputData=new Contact(c.getFirstName(),c.getLastName(),c.getAddress(),c.getCity(),c.getState(),c.getZip(),c.getmobileNumber(),c.getEmail());
                                        data.add(inputData);
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
                                            System.out.println("You have successfully added new contact in [ " + givenAddressbook.getKey() + " ] Address Book");
                                            System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                        }
                                        else
                                        {
                                            System.out.println("This person is already exist in [ " + givenAddressbook.getKey() +" ] Address BookPlease enter contact of new person");
                                        }

                                        break;
                                    }// contact case 1 end
                                    case 2:
                                    {
                                        System.out.println("----------- View Contact Details in  [ " + givenAddressbook.getKey() +" ] Address Book ---------------");
                                        // ---------- Display ArrayList Data ----------------- //
                                        for(int i=0;i<AddressBookMap.get(givenAddressbook.getKey()).size();i++)
                                        {
                                            AddressBookMap.get(givenAddressbook.getKey()).get(i).showData();
                                        }

                                        break;
                                    }// contact case 2 end
                                    case 3:
                                    {
                                        System.out.println("----------- Edit/Update Details [ " + givenAddressbook.getKey() +" ] Address Book-------------");
                                        System.out.println(" For Edit/Update Contact :: Type First Name of Person :-");
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
                                        System.out.println("Person Details Edited/Updated Successfully in [ " + givenAddressbook.getKey() +" ] Address Book");
                                        break;
                                    }	// contact case 3 end
                                    case 4:
                                    {
                                        System.out.println("------------  Delete Contact Details in [ " + givenAddressbook.getKey() +" ] Address Book-------------");
                                        System.out.println("For Delete Contact :: Type First Name of Person :-");
                                        String deleteName = scanReader.next(); // Accept given name for delete


                                        for(Map.Entry<String,ArrayList<Contact>> givenAddressBook:AddressBookMap.entrySet())
                                        {
                                            for(int index=0;index<givenAddressBook.getValue().size();index++)
                                            {

                                                if(givenAddressBook.getValue().get(index).getFirstName().equalsIgnoreCase(deleteName))
                                                {
                                                    //AddressBookMap.remove(givenAddressBook);
                                                }

                                            }
                                        }
                                        System.out.println("Person Details Deleted Successfully");
                                        break;
                                    }// contact case 4 end
                                    case 5:
                                    {
                                        contactWhileLoop = false;
                                        System.out.println(" !!!!!!! Exit from [ " + givenAddressbook.getKey() +" ] Address Book !!!!!!!!!! ");
                                        break;
                                    }// contact case 5 end
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
                    System.out.print("Search How Many Persons Lives in Particular City :: Enter City name :-");
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
                    System.out.print(" Search How Many Persons Lives in Particular State :: Enter State name :- ");
                    String stateName = scanReader.next();
                    System.out.println("------------------------------------------------------------------------------");
                    System.out.println(" *** Total Persons Lives In '"+stateName+"' State *** \n");
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
                }//case 5 end
                case 6:
                {
                    System.out.println("   ***     All Data View By City Name And Persons Name ***    \n");
                    System.out.println("------------------------------------------------------------------------------");
                    System.out.println("| AddressBook Names |  Person Name   |  City Name   |");
                    System.out.println("------------------------------------------------------------------------------");
                    for(Map.Entry<String,ArrayList<Contact>> eachAddressBook:AddressBookMap.entrySet())
                    {
                        for(int index=0;index<eachAddressBook.getValue().size();index++)
                        {
                            String bookName = eachAddressBook.getKey();
                            String cityName = eachAddressBook.getValue().get(index).getCity();
                            String PersonName = eachAddressBook.getValue().get(index).getFirstName();
                            System.out.println("|   "+bookName+"          |     "+PersonName+"    |        "+cityName+"      |");
                        }
                    }
                    break;
                }//case 6 end
                case 7:
                {
                    System.out.println("   ***     All Data View By State Name And Persons Name ***    \n");
                    System.out.println("------------------------------------------------------------------------------");
                    System.out.println("| AddressBook Names |  Person Name   |  State Name   |");
                    System.out.println("------------------------------------------------------------------------------");
                    for(Map.Entry<String,ArrayList<Contact>> eachAddressBook:AddressBookMap.entrySet())
                    {
                        for(int index=0;index<eachAddressBook.getValue().size();index++)
                        {
                            String bookName = eachAddressBook.getKey();
                            String stateName = eachAddressBook.getValue().get(index).getState();
                            String PersonName = eachAddressBook.getValue().get(index).getFirstName();
                            System.out.println("|   "+bookName+"          |     "+PersonName+"    |        "+stateName+"      |");
                        }
                    }
                    break;
                }//case 7 end
                case 8:
                {
                    int counterForCity=0;
                    System.out.print("Enter city name to view Total Number Of Person Lives in city  :- ");
                    String cityName = scanReader.next();

                    System.out.println("------------------------------------------------------------------------------");
                    for(Map.Entry<String,ArrayList<Contact>> eachAddressBook:AddressBookMap.entrySet())
                    {
                        for(int index=0;index<eachAddressBook.getValue().size();index++)
                        {
                            if(eachAddressBook.getValue().get(index).getCity().equals(cityName))
                            {
                                counterForCity++;
                            }
                        }
                    }
                    System.out.println(" *** Total Persons Lives In '"+cityName+"' City is :-"+counterForCity+ "\n");
                    System.out.println("------------------------------------------------------------------------------");
                    break;
                }//Case 8 end
                case 9:
                {
                    int counterForState=0;
                    System.out.print("Enter State name to view Total Number Of Person Lives in  State :- ");
                    String stateName = scanReader.next();
                    System.out.println("------------------------------------------------------------------------------");
                    for(Map.Entry<String,ArrayList<Contact>> eachAddressBook:AddressBookMap.entrySet())
                    {
                        for(int index=0;index<eachAddressBook.getValue().size();index++)
                        {
                            if(eachAddressBook.getValue().get(index).getState().equals(stateName))
                            {
                                counterForState++;
                            }
                        }
                    }
                    System.out.println(" *** Total Persons Lives In '"+stateName+"' State is :-"+counterForState+ "\n");
                    System.out.println("------------------------------------------------------------------------------");
                    break;
                }//case 9 end
                case 10:
                {
                        System.out.println("\n|--------------------------------------|");
                        System.out.println("|  * Sorting Alphabetically Choice *   |");
                        System.out.println("|--------------------------------------|");
                        System.out.println("| 1 -> Sort By First Name              |");
                        System.out.println("| 2 -> Sort By City                    |");
                        System.out.println("| 3 -> Sort By State                   |");
                        System.out.println("| 4 -> Exit                            |");
                        System.out.println("|--------------------------------------|");

                        System.out.print("\n ----------- [ Enter Your Choice ] -----------\n");
                        int ChoiceForSort = scanReader.nextInt();

                        switch (ChoiceForSort)
                        {
                            case 1:
                                List<Contact> sortedListForName =data.stream().sorted((n1,n2) -> n1.getFirstName().compareTo(n2.getFirstName())).collect(Collectors.toList());
                                System.out.println(" *********************************** Sorted Alphabetically in Ascending order By A Person First Name ***************************************\n");
                                System.out.println(sortedListForName);
                                System.out.println("********************************************************************************************************************************************");
                                break;

                            case 2:
                                List<Contact> sortedListForCity =data.stream().sorted((n1,n2) -> n1.getCity().compareTo(n2.getCity())).collect(Collectors.toList());
                                System.out.println(" *********************************** Sorted Alphabetically in Ascending order By  City Name ************************************************\n");
                                System.out.println(sortedListForCity);
                                System.out.println("********************************************************************************************************************************************");
                                break;
                            case 3:
                                List<Contact> sortedListForState =data.stream().sorted((n1,n2) -> n1.getState().compareTo(n2.getState())).collect(Collectors.toList());
                                System.out.println(" *********************************** Sorted Alphabetically in Ascending order By  State Name ***********************************************\n");
                                System.out.println(sortedListForState);
                                System.out.println("********************************************************************************************************************************************");
                                break;
                            }

                    break;
                }// Case 10 End
                case 11:
                {
                    addressBookWhileLoop = false;
                }// Case 11 End
            }//Address Book Switch End
        }//address Book While Loop end
        scanReader.close();
    }// AddressBookDetails method End
}//BookLogic class end
