
/**
 * Class Division 
 *
 * @author (Nikhitha)
 * @version (915)
 */
public class Division
{
    public Division()
    {

    }

    //Problem 4, Example 1
    public int countInt(int x){
        boolean isDone = false;
        int count = 0;
        while (!isDone){
            x = x/10;
            if (x!=0){
                count++;
            }
            else{
                isDone = true;
                count++;
            }
        }
        return count;
    }
    
    //Problem 4, Example 2
    
    public int sumInt(int y){
        boolean isDone = false;
        int sum =0;
        while (!isDone){
            
            if(y/10 !=0){
                sum = sum+y%10;
                y=y/10;
            }else
            {
               sum = sum + y; 
               isDone = true;
            }
        }
        return sum;
    }
}
