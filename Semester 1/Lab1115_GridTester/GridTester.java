package Lab1115_GridTester;


/**
 * Class GridTester
 *
 * @author (Nikhitha Nair)
 * @version (1115)
 */

import java.util.*;public class GridTester {
   
  int numArray [][] = new int [10][10];
  int sum = 0;
  int greatest = 0;
  
  public int getRandomNumber(){
    return (int)(Math.random() * ((10  - 1) + 1)) + 1;
  }
 
  public  void loadArray(){
   
    for (int i = 0; i < 10; i++) {
                                                                             
      for (int j=0; j <10; j++){
       
        numArray[i][j] = getRandomNumber();
      }
     
    }
   
  }
  
  public int sumAll(){
   for (int[]i:numArray){
          for(int j:i){                                                                      
              sum += j;
    }
   }
   return sum;
  }
    
  public int findGreatest(){
      for (int[]i:numArray){
          for(int j:i){                                                                      
              if(j>(greatest)){
                 greatest = j;
                }
    }
   }
   return greatest;
    }
    
  public void numberOfGreatest(){
    }
    
  public void findAvg (){
    }
 
  public static void main(String[] args){
    GridTester gs = new GridTester();
    gs.loadArray();
    System.out.println(gs.sumAll());
    System.out.println(gs.findGreatest());
  }
 
}
