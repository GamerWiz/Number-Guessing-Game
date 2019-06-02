import java.util.Random;
import java.util.Scanner;

public class numberguessing {
  public static void main(String[] args) {
    int x = 0;
    int computerWins = 0;
    int playerWins = 0;
    while (x == 0) {
      int trycounter = 0;
      Random rand = new Random();
      int rand_int1 = rand.nextInt(100);
      int y = 0;
      while (y == 0){
      if (playerWins == 5 || computerWins == 5){
        System.out.println("You play this game too much. Go outside and be active for once");
      }
      System.out.print("First Try: ");
      Scanner T1 = new Scanner(System.in);
      while (!T1.hasNextInt()){
        System.out.println("Clearly you're kinda messed up in the head like Supercuts, that's not even a number");
        T1.next();
      }
      int try1 = T1.nextInt();
      if (try1 != rand_int1) {
        if(try1>rand_int1){
          System.out.println("The number you had was too high, higher than a teen at Woodstock");
        }
        else if(try1<rand_int1){
          System.out.println("The number you had was too low, lower than your intelligence level for guessing numbers");
        }
        trycounter++;
      }
      if (try1 == rand_int1) {
        System.out.println("You won!");
        playerWins++;
        System.out.println("Computer: " + computerWins + " Player: " + playerWins);
        System.out.println("Would you like to play again? N or Y");
        Scanner pa1 = new Scanner(System.in);
        String PA1 = pa1.next();
        if(PA1.equalsIgnoreCase("N")){
          return;
        }
        else if(PA1.equalsIgnoreCase("Y")){
          break;
        }
      }







      Scanner T2 = new Scanner(System.in);
      System.out.print("Second Try: ");
      while (!T2.hasNextInt()){
        System.out.println("Clearly you're kinda messed up in the head like Supercuts, that's not even a number");
        T2.next();
      }
      int try2 = T2.nextInt();
      if (try2 != rand_int1) {
        if(try2>rand_int1){
          System.out.println("The number you had was too high, and clearly you are too");
        }
        else if(try2<rand_int1){
          System.out.println("The number you had was too low, like Peter Dinklage");
        }
        trycounter++;
      }
      if (try2 == rand_int1) {
        System.out.println("You won!");
        playerWins++;
        System.out.println("Computer: " + computerWins + " Player: " + playerWins);
        System.out.println("Would you like to play again? N or Y");
        Scanner pa1 = new Scanner(System.in);
        String PA1 = pa1.next();
        if(PA1.equalsIgnoreCase("N")){
          return;
        }
        else if(PA1.equalsIgnoreCase("Y")){
          break;
        }
      }






      Scanner T3 = new Scanner(System.in);
      System.out.print("Third Try: ");
      while (!T3.hasNextInt()){
        System.out.println("Clearly you're kinda messed up in the head like Supercuts, that's not even a number");
        T3.next();
      }
      int try3 = T3.nextInt();
      if (try3 != rand_int1) {
        if(try3>rand_int1){
          System.out.println("The number you had was too high, ur big dum");
        }
        else if(try3<rand_int1){
          System.out.println("The number you had was too low, stoopid");
        }
        trycounter++;
      }
      if (try3 == rand_int1) {
        System.out.println("You won!");
        playerWins++;
        System.out.println("Computer: " + computerWins + " Player: " + playerWins);
        System.out.println("Would you like to play again? N or Y");
        Scanner pa1 = new Scanner(System.in);
        String PA1 = pa1.next();
        if(PA1.equalsIgnoreCase("N")){
          return;
        }
        else if(PA1.equalsIgnoreCase("Y")){
          break;
        }
      }





      Scanner T4 = new Scanner(System.in);
      System.out.print("Fourth Try: ");
      while (!T4.hasNextInt()){
        System.out.println("Clearly you're kinda messed up in the head like Supercuts, that's not even a number");
        T4.next();
      }
      int try4 = T4.nextInt();
      if (try4 != rand_int1) {
        if(try4>rand_int1){
          System.out.println("The number you had was too high, it's literally in heaven");
        }
        else if(try4<rand_int1){
          System.out.println("The number you had was too low, it's literally in hell");
        }
        trycounter++;
      }
      if (try4 == rand_int1) {
        System.out.println("You won!");
        playerWins++;
        System.out.println("Computer: " + computerWins + " Player: " + playerWins);
        System.out.println("Would you like to play again? N or Y");
        Scanner pa1 = new Scanner(System.in);
        String PA1 = pa1.next();
        if(PA1.equalsIgnoreCase("N")){
          return;
        }
        else if(PA1.equalsIgnoreCase("Y")){
          break;
        }
      }





      Scanner T5 = new Scanner(System.in);
      System.out.print("Fifth Try: ");
      while (!T5.hasNextInt()){
        System.out.println("Clearly you're kinda messed up in the head like Supercuts, that's not even a number");
        T5.next();
      }
      int try5 = T5.nextInt();
      if (try5 != rand_int1) {
        if(try5>rand_int1){
          System.out.println("The number you had was too high, and you are a not smart person");
        }
        else if(try5<rand_int1){
          System.out.println("The number you had was too low, I didn't realize a code could be this");
        }
        trycounter++;
      }
      if (try5 == rand_int1) {
        System.out.println("You won!");
        playerWins++;
        System.out.println("Computer: " + computerWins + " Player: " + playerWins);
        System.out.println("Would you like to play again? N or Y");
        Scanner pa1 = new Scanner(System.in);
        String PA1 = pa1.next();
        if(PA1.equalsIgnoreCase("N")){
          return;
        }
        else if(PA1.equalsIgnoreCase("Y")){
          break;
        }
      }
      if (trycounter == 5) {
        System.out.println("You really had 5 chances to win and you didn't. Good job.");
        computerWins++;
        System.out.println("The number was " + rand_int1);
        System.out.println("Computer: " + computerWins + " Player: " + playerWins);
        System.out.println("Would you like to play again? N or Y");
        Scanner pa1 = new Scanner(System.in);
        String PA1 = pa1.next();
        if(PA1.equalsIgnoreCase("N")){
          return;
        }
        else if(PA1.equalsIgnoreCase("Y")){
          break;
        }
      }
      }
    }
  }
}
