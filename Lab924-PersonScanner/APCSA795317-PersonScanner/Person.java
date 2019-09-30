
/**
 * Write a description of class Person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Person
{
    // instance variables - replace the example below with your own
    private String fName, mName, lName;

    /**
     * Constructor for objects of class Person
     */
    public Person(String firstName,String middleName,String lastName)
    {
       fName = firstName;
       mName = middleName; 
       lName = lastName;
       System.out.println("First Name  :" + fName);
       System.out.println("Middle Name  :" + mName);
       System.out.println("Last Name  :" + lName);
    }

    
}
