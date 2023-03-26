
package infobytetasks;
import java.util.Random;
import java.util.Scanner;

public class Numguess {
    public static void main(String[] args) {
        Random r = new Random();
        int Guess_num = r.nextInt(100);
        int turns = 0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Guess a number between 1 to 100, You will have 8 turns!" );
        System.out.println("best of luck!");
     
      
    int i=0, guess;
    boolean win = false;
    while(win==false) {
      guess=sc.nextInt();
      turns++;
    
    if(guess==Guess_num) {
      win=true;
    }
    else if(i>8){
      System.out.println("You lose! the right answer was: "+Guess_num);
      return;
    }
    else if(guess<Guess_num){
      i++;
      System.out.println("Your guess is lower than "+guess+ " Turns left: "+(8-i));
      
    }
    else if(guess>Guess_num) {
      i++;
      System.out.println("Your Guess is higher than "+guess + " Turns left: "+(8-i));
      
    }
    }
    System.out.println("Congratulations ! You guessed the right number.");
    System.out.println("The number was "+Guess_num);
    System.out.println("Total turns used = "+ turns);
    System.out.println("Score = "+((11-turns)*10)+" out of 100");
    
}
}
    



