
/**
 * Class Quiz1108.
 *
 * @author (Nikhitha)
 * @version (1108)
 */
import java.util.*;
public class Quiz1108
{
    
    public Quiz1108()
    {
       
    }
    
    public ArrayList<Integer>makeList(int[] nums){
        ArrayList<Integer> newList = new ArrayList<Integer>();
        for (int i = 0; i <nums.length; i++){
            newList.add(nums[i]);
        }
        return newList;
    }
    
    public int [] reverseList(ArrayList <Integer> nums) {
        int [] arr = new int[nums.size()];
        for(int i = 0; i < arr.length; i++){
            arr[i] = nums.get((nums.size()-1) - i);
        }
        return arr;
    }

    
}
