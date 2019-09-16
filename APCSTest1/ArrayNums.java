
/**
 * Class ArrayNums 
 *
 * @author (Nikhitha)
 * @version (915)
 */

public class ArrayNums
{

    public ArrayNums()
    {

    }

    int[] nums = new int[6];
    public void createNumsArray(){
        System.out.print('\u000C');
        for (int p = 0; p < 6; p++){
            nums[p] =  (int) (5 * Math.random() + 5); 
        }
    }

    public void traverseNumsArray(){
        createNumsArray();
        for (int p = 0; p < 6; p++){
            System.out.println(nums[p]);
        }
    }

    public void sumNumsArray(){
        int sum = 0;
        createNumsArray();
        for (int p = 0; p < 6; p++){
            System.out.println(nums[p]);
            sum = sum + nums[p];
        }
        System.out.println(sum);

    }

    public int[] copyArray(int[] origArray){
        int[] newArray = new int[origArray.length];
        for(int p = 0; p < origArray.length; p++){
            newArray[p] = origArray[p]; 
            System.out.println(newArray[p] );
        }
        return newArray;
    }
    
    public static void main(String[] args){
        //Used main method to test
        System.out.print('\u000C');
        ArrayNums aNum=new ArrayNums();
        aNum.copyArray(new int[]{31,5,6,89});
    }
}

