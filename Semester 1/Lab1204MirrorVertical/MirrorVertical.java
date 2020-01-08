package Lab1204MirrorVertical;


/**
 * Class MirrorVertical 
 *
 * @author (Nikhitha)
 * @version (1204)
 */
public class MirrorVertical
{
    /**
     * Constructor for objects of class MirrorVertical
     */
    public MirrorVertical()
    {
       
    }
    
    public void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    
    public void mirrorAtCenter(int[] arr){
        for(int index = 0; index < arr.length/2; index++){
            swap(index, arr.length-1-index);
        }
    }
}

