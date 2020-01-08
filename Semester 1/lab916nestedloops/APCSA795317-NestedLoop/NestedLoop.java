
/**
 * Write a description of class NestedLoop here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NestedLoop
{

    public NestedLoop()
    {
    }

    public void nestedLoop1(){
       System.out.print('\u000C');
        for (int i = 1; i < 6; i++) {
            System.out.print(i);
            for (int j = 1; j < i; j++) {
               System.out.print(i);
       }
       System.out.println("");
       }
    }
    
    public void nestedLoop2(){
       System.out.print('\u000C');
        for (int i = 5; i > 0; i--) {
            System.out.print(i);
            for (int j = 1; j < 8; j++) {
               System.out.print(i);
       }
       System.out.println("");
       }
    }
    
    public void nestedLoop3(int n){
        
        if (n == 2) {
            print(2);
        } else if (n == 3) {
            print(3);
        }else if (n == 6) {
            print(6);
        }else{
          System.out.println("Not a validnumber");  
        }
    }

     private void print(int n){
         for (int i =0; i<n; i++){
             for(int j=0; j<n; j++){
                 System.out.print(n + "");
             }
             System.out.println("");
         }
     }
     
     public void nestedLoop4(int n){
        
        if (n == 7) {
            for (int i =1; i <= n; i++){
                for(int j=i; j < n; j++){
                   System.out.print("-");
             }
             System.out.print("-" +i);
             System.out.println("");
            }
        }else{
          System.out.println("Not a validnumber");  
        }
    }
}
