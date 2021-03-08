import java.util.*;

class Main {
  public static int win = 0;
  public static int loss = 0;
  public static int tie = 0;
  
  public static void main(String[] args) {
    System.out.println("Welcome to Rock Paper Scissors");
    System.out.println("You can choose rock, paper and scissors to play. If you want to end the game, say quit");
    Scanner keyboard = new Scanner (System.in);
    String userChoice = keyboard.next();

  while (!userChoice.equals("quit")){
    System.out.println("user throws " + userChoice);
    compareChoice(userChoice);
    userChoice = keyboard.next();
      
    }
    if (userChoice.equals("quit")){
      System.out.println("Thanks for playing. \n Your final score is: ");
      score();
    }
  }

  public static String compareChoice(String userChoice){
    String compChoice = compInput();
    System.out.println("Computer throws " + compChoice);

    String result = "";     

    if (compChoice.equals(userChoice)){
      tie += 1;
      score();
      result = "You tied";      
    }

    else if (userChoice.equals("rock") && compChoice.equals("scissors") || (userChoice.equals("scissors") && compChoice.equals("paper") || (userChoice.equals("paper") && compChoice.equals("rock")))){
      win += 1;
      score();
      result = "You win";
    }

    else {
      loss += 1;
      score();
      result = "You lose";
    }

    System.out.println(result);
    return result;
  }
  
  public static String compInput(){
    String compChoice;
    int rand = (int)(Math.random() * 3);
    if (rand == 0){
      compChoice = "rock"; 
    }
    else if (rand == 1){
      compChoice = "paper";
    }
    else {
      compChoice = "scissors";
    }
    return compChoice;
  }
  public static void score(){
    System.out.println("Ties: " + tie + "\nWins: " + win + "\nLosses: " + loss);
  }
  
}