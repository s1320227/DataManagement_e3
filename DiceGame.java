import java.util.Random;
import java.util.Scanner;

public class DiceGame {
  private int die1, die2;
  private String name;
  public DiceGame(){
  }
  public static void main(String[] args){
    DiceGame game = new DiceGame();
    Random rand = new Random();
    die1 = rand.nextInt(6) + 1;
    die2 = rand.nextInt(6) + 1;
    int total = die1 + die2;
    
    game.Greeting();
    
    System.out.println("Rolling dice...");
    System.out.println("Die 1: " + die1);
    System.out.println("Die 2: " + die2);
    System.out.println("Total value: " + total);
    game.WinLoseChecker(total);
  }

  
  public void Greeting(){
    Scanner sc = new Scanner(System.in);
    System.out.println("What is your name?");
    System.out.print("> ");
    name = sc.nextLine();
    System.out.println("Hello, " + name + "!");
  }


  public void WinLoseChecker(int total){
    if(total >= 8){
      System.out.println(name + " won!!");
    }else{
      System.out.println(name + " lost..");
    }
  }
  

}
