//NUMBER GAME//
import java.util.Random;
import java.util.Scanner;
public class NumberGame{
    
public static void main(String[] args) {
    

    
        Scanner sc=new Scanner(System.in);
        String playAgain="Yes";
        int roundwin=0;
        int totalrounds=0;
        System.out.println("******** Hey Lets Play Random Number Guess Game*******");

        
       
        // int playAgain;
        while(playAgain.equalsIgnoreCase("yes")){
            System.out.println("\n Start Your Round Guess a Number Between 1 to 100");
            Random rn=new Random();
            int genratedNumber=rn.nextInt(100)+1;
            int maxAttempted=10;
            boolean guessCorrect=false;
            totalrounds++;
            for(int attempts=1;attempts<=maxAttempted;attempts++){
                System.out.println("Attempt"+attempts+"_"+"Enter you Number");
                int yourGuess=sc.nextInt();
                sc.nextLine();
               // int generatedNumber = 0;
                if(yourGuess==genratedNumber){
                    System.out.println("\n ***Congratulation***"+attempts+"attempts");
                    guessCorrect=true;
                    roundwin++;
                    break;


                }
                else if(yourGuess>genratedNumber){
                    System.out.println("Your guess is too high");
                }

            else if(yourGuess<genratedNumber){
                    System.out.println("Your guess is too low");
                }
                if(attempts==maxAttempted){
                    System.out.println("All attempt"+genratedNumber);
                }

            }
        
        System.out.println("\n Do you want to play again(yes/no)");
        playAgain=sc.nextLine();

    }
    
    System.out.println("***** Game Over*****");
    System.out.println("***** total Round*****"+totalrounds);
    System.out.println("***** Game Over*****"+roundwin);
    System.out.println("***** Thankyou*****");
    sc.close();
}

}