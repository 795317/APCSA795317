
/**
 * Class SimpleCalculator here.
 *
 * @author (Nikhitha)
 * @version (916)
 */
public class SimpleCalculator
{
    public SimpleCalculator()
    {

    }

    public int add(int x, int y){
        return x+y;
    }
    
    public static void main(String [] args){
        SimpleCalculator calc1 = new SimpleCalculator();
        calc1.add(2, 3);
    }
}
