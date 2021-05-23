import java.util.Scanner;
import  java.util.*;               // imported random number generator
public class rockpaper {
    public static void main(String[] args) {
        Random generator = new Random();             // defining random as generator
        Scanner sc = new Scanner(System.in);        // defining scanner as sc
       // int rock = 1;                    // this was just to make code easier by initialising the
       // int paper = 2;                   // value of rock p an s by 1 2 3
      //  int scissor = 3;



        //int computerChoice, userinput;

        System.out.println("\t\t1 is for Rock\t\t 2 is for Paper\t\t 3 is for Scissor"); // Info for user
        System.out.println("Enter a number from 1 to 3");
        int UserInput = sc.nextInt();      // taking input

        int computerChoice = generator.nextInt(3) + 1;  // I am storing a random number from
                                                               // 1 to 3 in computerChoice variable



        if (UserInput == 1 && computerChoice == 1){  // if else conditions

            System.out.println("It is Rock vs Rock, So it is tie game ");
        }


          else if (UserInput == 1 && computerChoice == 2) {
              System.out.println("It is Rock vs paper, You Loose");
            }


         else if (UserInput == 1 && computerChoice == 3) {
                System.out.println("It is rock vs Scissor, You win");
         }


        else if (UserInput == 2 && computerChoice == 1) {
            System.out.println("It is paper vs Rock, You win");
        }
        else if (UserInput == 2 && computerChoice == 2) {
            System.out.println("It is rock vs rock, It's a tie game");
        }
        else if (UserInput == 2 && computerChoice == 3) {
            System.out.println("It is Paper vs scissor, You win");

        }
         else if(UserInput==3 && computerChoice==1){
            System.out.println("It is scissor vs rock, You loose");

        }
         else if (UserInput ==3 && computerChoice==2){
            System.out.println("It is Scissor vs Paper, You win");

        }
         else if (UserInput==3 && computerChoice==3){
            System.out.println("It is scissor vs Scissor, It's a tie");
        }
         if (UserInput>3){
             System.out.println("please enter valid number");
         }



    }

}
