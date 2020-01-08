package Lab1031StringCheck;

/**
 * Class StringChecker
 *
 * @author (Nikhitha Nair)
 * @version (1031)
 */
import java.util.*;
public class StringChecker
{
    String[] wordList;
    ArrayList<String>words = new ArrayList<String>();

    public StringChecker()
    {
    }

    public ArrayList<String> wordChecker(String[] str, String key){
        for (int i = 0; i < str.length; i++){
            if (str[i].indexOf(key) >= 0){
            words.add(new String(str[i])); 
            }
        }
        return words;
    }

    public static void main(String [] args){
        StringChecker s1 = new StringChecker();
        String str[] = { "cats", "dogs", "ducks"};
        System.out.print(s1.wordChecker(str, "cats"));
    }

}
