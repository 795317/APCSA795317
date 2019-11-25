package Lab1024Sorting;

/**
 * Class SortTester
 *
 * @author (Nikhitha)
 * @version (1024)
 */
import java.util.*;

public class SortTester
{
    private ArrayList<Integer> numList = new ArrayList<Integer>();

    /**
     * Constructor for objects of class SortTester
     */
    public SortTester()
    {
    }

    public void loadNumbers(int n){
        while (numList.size() < n){
            for (int i = 0; i < 100; i++)
            {
                numList.add(i);
                System.out.println(numList.get(i));
            }
        }
    }

}
 