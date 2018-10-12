import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Welcome. What is your name?");

        String name = scan.nextLine();
        System.out.println("Hello " + name + ". Try your best to crack the code! \n");

        int a = 3;
        System.out.println("PHASE 1");
        System.out.println("Enter a number:");

        int userInput1 = scan.nextInt(), userInput2 = 0, userInput3 = 0;

        if (userInput1 == a){
                System.out.println("Correct!\n");
                System.out.println("PHASE 2\n" + "Enter a number:");

                userInput2 = scan.nextInt();

                if (userInput2 == 1 || (userInput2 >= 33 && userInput2 <= 100)){
                    System.out.println("Correct!\n");
                    System.out.println("PHASE 3\n" + "Enter a number:");

                    userInput3 = scan.nextInt();

                    if (userInput3 > 0 && (userInput3 % 3 == 0) || (userInput3 % 7 == 0)){
                        System.out.println("Correct!\n" + "You have cracked the code!");
                    }
                    else {
                        System.out.println("Sorry, that was incorrect!\n" + "Better luck next time!");
                    }
                }
                else {
                    System.out.println("Sorry, that was incorrect!\n" + "Better luck next time!");
                }
            }
            else {
                System.out.println("Sorry, that was incorrect!\n" + "Better luck next time!");

            }
        }
    }
