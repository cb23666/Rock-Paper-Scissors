import java.util.Scanner;

public class RockPaper{
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Do you want to play Rock-Paper-Scissors?");
    System.out.print("If you want to play type yes. If you don't want to play say no: ");
    String answer = scan.nextLine();

    if(answer.equals("yes")||answer.equals("Yes")){
        System.out.println("Alright sweet!");
        System.out.println("You are going to be playing against a computer!");
        System.out.println("Rock-Paper-Scissors Shoot!");
        String yourChoice = scan.nextLine();
        String compChoice = computerChoice();

        System.out.println("You chose: "+yourChoice);
        System.out.println("The computer chose: "+compChoice);

        String finalResult = result(compChoice, yourChoice);
        printingResult(yourChoice, yourChoice, finalResult);

    }else{
            System.out.println("Darn maybe next time.");

        }   
    
    scan.close();
    

    }
    public static String computerChoice(){
        int gameNumber =(int)(Math.random()*3);
        if (gameNumber == 0){
            return "rock";
        } else if(gameNumber == 1) {
            return "paper";
        } else if(gameNumber == 2){
            return "scissors";
        } else{
            return "This shouldn't come up";
        }
        
    }
    public static String result(String yourChoice, String computerChoice){
        String result = "";
        
        if (yourChoice.equals("rock")&& computerChoice.equals("scissors")){
            return "You win!";
        }else if (yourChoice.equals("scissors")&& computerChoice.equals("paper")){
            return "You win!";
        }else if (yourChoice.equals("paper")&& computerChoice.equals("rock")){
            return "You win!";
        } else if (computerChoice.equals("scissors")&& yourChoice.equals("paper")){
            return "You lose";
        } else if (computerChoice.equals("rock")&& yourChoice.equals("scissors")){
            return "You lose";
        } else if(computerChoice.equals("paper")&& yourChoice.equals("rock")){
            return "You lose";
        } else if(yourChoice.equals(computerChoice)){
            return "It's a tie";
              
        } else{
            System.out.println("INVALID");
        }
    return result;
        
    }
            
        
    public static void printingResult(String computerChoice, String yourChoice, String result){
        System.out.println(result);

    }
    
    
}