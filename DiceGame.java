import java.util.Random

public class DiceGame {
  private int die1, die2;
  public DiceGame(){
  }
  public static void main(String[] args){
    Random rand = new Random();
    die1 = rand.nextInt(6) + 1;
    die2 = rand.nextInt(6) + 1;
    int total = die1 + die2;
    System.out.println("Rolling dice...");
    System.out.println("Die 1: " + die1);
    System.out.println("Die 2: " + die2);
    System.out.println("Total value: " + total);
  }
}
