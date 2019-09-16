
/**
 * Class Numbers 
 *
 * @author (Nikhitha)
 * @version (915)
 */

//Problem 3
public class Numbers
{
    private int num1;
    private int num2;
    public Numbers(int n1, int n2)
    {
        num1 = n1;
        num2 = n2;
    }
    
    public int multiply(int m1, int m2)
    {
        return m1*m2;
    }
    
    public static void main(String args[])
    {
        System.out.print('\u000C');
        Numbers multipleGroup1 = new Numbers(5,10);
        System.out.println("Num1 value "+ multipleGroup1.num1);
        System.out.println("Num2 value "+ multipleGroup1.num2);
        int result = multipleGroup1.multiply(12,12);
        System.out.println("Multiplication Result "+result);
        
    }
        
}
