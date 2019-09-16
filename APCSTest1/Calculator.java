
/**
 * Class Calculator
 *
 * @author (Nikhitha)
 * @version (915)
 */
public class Calculator
{
    public Calculator()
    {

    }

  

    public int add(int x, int y)
    {
        return x+y;
    }

    public int subract(int x, int y)
    {
        return x-y;
    }

    public int multiply(int x, int y)
    {
        return x*y;
    }

    public float divide(float x, float y)
    {
        if (y == 0){
            System.out.println("Sorry, not a valid value for y!");
            //throw new Error("Not a valid y-value!");
        }
        else if (y != 0){
            return x/y;
        }
        //throw new Error("Please enter valid values!");
        return -1;
    }

    public float mod(float x, float y)
    {
        if (y == 0){
            System.out.println("Sorry, not a valid value for y!");
            //throw new Error("Not a valid y-value!");
        }
        else if (y != 0){
            return x%y;
        }
        //throw new Error("Please enter valid values!");
        return -1;
    }

    public boolean greaterThan(int x)
    {
        if (x>100){
            return true;
        }
        else if (x<100){
            return false;
        }
        else if (x == 100){
            return false;
        }
        return false;
    }

    public void print(int num){
        for(int i=num; i >= 0; i--){
            System.out.println("i is "+ i);
        }

        int j=0;
        while ( j <= num){
            System.out.println("j is "+ j); 
            j++;
        }
    }

    public static void main(String[] args)
    {
        Calculator calc1 = new Calculator();
        calc1.print(20);
        int sum = calc1.add(23, 60);
        int diff = calc1.subract(60, 23);
        int product = calc1.multiply(23, 60);
        float quotient = calc1.divide(60, 0);
        float reminder = calc1.mod(60, 23);
        boolean isXgreaterThan = calc1.greaterThan(10);
        System.out.println(sum);
        System.out.println(diff);
        System.out.println(product);
        System.out.println(quotient);
        System.out.println(reminder);
        System.out.println(isXgreaterThan);
    }
}

