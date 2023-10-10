
import java.util.Scanner;
public class yes
{
    public static void main(String[] args){
        Scanner in =  new Scanner(System.in);  
        int computer = PaperScissor.computerAI();
        int paper = 0;
        int rock = 1;
        int scissor = 2;
        int playerChoice = -1;
        System.out.println("Computer - Human, let’s have an epic game of Rock, Paper, Crossblades!");
        String playerIn = new String();
        String playerResp = new String();
        playerIn = in.nextLine();
        int stringLen = playerIn.length();
        int periodLocation = playerIn.lastIndexOf(".");
        playerResp = playerIn.substring(periodLocation + 1);
        playerResp = (playerResp.trim()).toUpperCase();
        if(playerResp.equals("ROCK")){
        playerChoice = rock;
        } else if(playerResp.equals("SCISSORS")){
            playerChoice = scissor;
        } else if(playerResp.equals("PAPER")){
            playerChoice = paper;
        }else if(stringLen < 50){
        System.out.println("computer - Your deception is too easy to see through.  Be more verbose");
        System.out.println("computer - I choose " + PaperScissor.verbose(playerChoice));
    }else {
            System.out.println("computer - You have failed to adhere to the ancient traditions of Rock, Paper, Crossblades! You have lost by disqualification! Disgraceful!");
    
        }
        
        if(computer == playerChoice){
            System.out.println("computer - I choose " + PaperScissor.RPC(computer));
            System.out.println("computer - Unbelievable! We have tied! *Eye twitches*");
        } else if(PaperScissor.playerWin(computer,playerChoice) == true){
            System.out.println("computer - I choose " + PaperScissor.RPC(computer));
            System.out.println("computer - Unbelievable, you have won");
        } else if(PaperScissor.playerWin(computer,playerChoice) == false){
            System.out.println("computer - I choose " + PaperScissor.RPC(computer));
            System.out.println("computer - HA, i've won");
        }
    }
}
