package Dragoncave;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Player {
    public static void main(String[]args){
        System.out.println("You are in a land full of dragons.In front of you," +
                        "\nyou see two caves." +
                "In on cave,the dragon is friendly \nand will share his treasure with you.The other dragon " +
                "\nis greedy and hungry and will eat you on sight.\n Which cave will you go into?(1 or 2) ");
        Scanner sc = new Scanner(System.in);
        int choice=1 ;
        boolean valid = false;
        while (valid==false){
           try {
               choice = sc.nextInt();
               valid= true;
               if(choice>2 || choice==0 ){System.out.println(choice +" is not an option choose 1 or 2");
                   valid=false;
               //sc.nextLine();
                   }

           }catch (InputMismatchException e)
           {System.out.println("enter a valid number");

               sc.nextLine();
           }
           }

          switch (choice){
            case 1 : System.out.println("You approach the cave...\n " +
                    "It is dark and spooky...\n" +
                    "A large dragon jumps out in front of you! He opens his jaws and...\n" +
                    " Gobbles you down in one bite!");
                break;
            case 2 :

          }

    }   }

