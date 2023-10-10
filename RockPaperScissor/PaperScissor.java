
import java.util.Scanner;
public class PaperScissor{
 public static int computerAI(){
int paper = 0;
int rock = 1;
int scissor = 2;
int compRand = (int)(Math.random()*2);
 if(compRand == paper){
     return paper;
     
 } else if(compRand == rock){
     return rock;

} else{
    return scissor;
}
 

}

public static String RPC(int choice){
    String response = new String();
    if(choice == 0){
        response = "Paper";
    } else if(choice == 1){
        response = "Rock";
    } else if(choice == 2){
        response = "Scissor";
    }else{
        response = "ERROR, player choice doesnt exsist";
        System.out.println(choice);
    }
    
    return response;
}

public static boolean playerWin(int computer, int playerChoice){
    boolean Win = false;
    int paper = 0;
    int rock = 1;
    int scissor = 2;
    if(computer == paper && playerChoice == scissor){
        Win = true;
    } else if(computer == rock && playerChoice == paper){
        Win = true;
    } else if(computer == scissor && playerChoice == rock){
        Win = true;
    }
    return Win;
}

public static String verbose(int playerChoice){
    int paper = 0;
    int rock = 1;
    int scissor = 2;
    String comp = new String();
    if(playerChoice == paper){
        comp = "Scissor";
    } else if(playerChoice == rock){
        comp = "Paper";
    } else if(playerChoice == scissor){
        comp = "Rock";
    }
    return comp;
}
}