/**
 * method for random number of stars
 * @author Darian
 */
public class Main {
  public static void chaotic(int num){
    int randNum = (int)(Math.random()*(5 - 1 + 1))+ 1;
    // for loop will keep repeating until i becomes less than chosen number
    for (int i = 0; i < num; i++){
      
      // on 1 line print "*" until the number of stars reaches randNum
      for (int j = 0; j < randNum; j++){
        randNum = (int)(Math.random()*(5 - 1 + 1))+ 1;
        System.out.print("*");
      }
      // print an empty line so the next row of stars can be printed
      System.out.println("");
    }

  }

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // call out chaotic method
    chaotic(7);
    
  }
}
