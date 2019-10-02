
/**
 * Write a description of class Scanner here.
 *
 * @author ( Nikhitha Nair)
 * @version (924)
 */
public class Scanner
{
   
    /**
     * Constructor for objects of class Scanner
     */
    public Scanner()
    {
        // initialise instance variables
        
    }

    public void createPerson(String fullName){
        
        System.out.print('\u000C');    
          
        String firstName="",middleName="",lastName="";
         if(fullName.indexOf(",") != -1){
            //LastNameformat            
            lastName  = fullName.substring(0,fullName.indexOf(",")); 
            String firstMiddle = fullName.substring(fullName.indexOf(",")+2,fullName.length()); 
           
            if (firstMiddle.lastIndexOf(" ") != -1){               
               firstName = firstMiddle.substring(0, firstMiddle.lastIndexOf(" "));
               middleName  = fullName.substring(fullName.lastIndexOf(" "));
            }else{
                firstName = firstMiddle; 
            }
             
             
        }else{
             firstName = fullName.substring(0,fullName.indexOf(" ")); 
             if(fullName.indexOf(" ") != fullName.lastIndexOf(" ")){
                 middleName =fullName.substring(fullName.indexOf(" "),fullName.lastIndexOf(" "));
                  
             }
             lastName =  fullName.substring(fullName.lastIndexOf(" ")); 
            //First Nameformat
        }
        Person p  = new Person(firstName,middleName,lastName);
    }
}
