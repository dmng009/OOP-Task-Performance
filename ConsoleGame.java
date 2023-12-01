package consoleGame;
import java.util.*;

interface Playable {
    void play();
	void print();

}

interface Scorable {
    int score();
}

interface Printable {
    void print();
}

class StoryMode implements Playable, Printable {

    public void play() {   	
        System.out.println("\nStarting the game...");
        try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
        System.out.println("------------------------------");
        System.out.println("The story begins in you finding yourself in a mysterious forest.");
        System.out.println("You get lost trying to find herbs.");       
               
        Scanner scanner = new Scanner(System.in);       
                                            
        boolean input = false;
		                  
        while(!input) {
        System.out.println("\nPress 'C' to Continue the Story...");
        char ch = scanner.nextLine().charAt(0);
           if(ch == 'C'|| ch == 'c') {
           	input = true;
           }
           else {
           	System.out.println("Invalid Input. Press C only.");    
           	
           } 
        }            
        // Decision 1 
        System.out.println("\nInstruction:");
        System.out.println("To get out of the forest, you must choose whether to take the left or the right path.");
        System.out.println("Each path has 2 choices, either you gain something or find a way to get out of the forest.");
        System.out.println("------------------------------");             
        System.out.println("Decision 1: You come across a separating path.");
        System.out.println("1. Take the left path.");
        System.out.println("2. Take the right path.");
        int decision1 = scanner.nextInt();

        if (decision1 == 1) {
            System.out.println("\nYou chose to take the left path.");
            

            // Left Path 
            System.out.println("------------------------------");
            System.out.println("As you walk along the left path, you discover a secret cave.");           
            System.out.println("Decision 2: Approach the secret cave or continue your journey?");
            System.out.println("1. Approach the secret cave.");
            System.out.println("2. Continue your journey.");
            int decision2 = scanner.nextInt();

            if (decision2 == 1) {
            	System.out.println("------------------------------");
                System.out.println("You approach the secret cave. You discover ancient runes and decided to take a look at it.");              
                System.out.println("Decision 3: Read the ancient runes or leave the cave?");
                System.out.println("1. Read the ancient runes.");
                System.out.println("2. Leave the cave.");
                int decision3 = scanner.nextInt();

                if (decision3 == 1) {
                    System.out.println("\nYou decide to read the ancient runes. You gained knowlodge and unlock hidden powers.");                  
                } 
                
                else {
                    System.out.println("\nYou leave the cave and continue your journey.");                  
                }
               
            } 
            
            else {
                System.out.println("As you continue your journey, you accidentally encounter a friendly little fairy.");
                System.out.println("The little fairy guided you to a shortcut, saving you time on your journey.");               
            }
            
        } 
        
        else {
            System.out.println("You chose to take the right path.");            

            // Right Path 
            System.out.println("------------------------------");
            System.out.println("As you walk along the right path, you notice strange glowing flowers.");
            System.out.println("Decision 2: Investigate the flowers or avoid them?");
            System.out.println("1. Investigate the flowers.");
            System.out.println("2. Avoid the flowers.");
            int decision2 = scanner.nextInt();

            if (decision2 == 1) {
                System.out.println("\nYou investigate the flowers and discover they have healing properties.");
                System.out.println("You decided to pick up the flowers and continued your journey.");
                
            } else {
                System.out.println("\nYou decide to avoid the flowers and continue your journey.");
                System.out.println("Shortly after, you find a hidden treasure chest.");
                System.out.println("The treasure chest contains valuable items.");               
            }
        }
        
        System.out.println("------------------------------");
        System.out.println("Your journey through the mysterious forest comes to an end.");
        System.out.println("Do you wish to continue your journey? (Y/N)");
        String choice = scanner.nextLine().toUpperCase();

        while (!choice.equals("Y") && !choice.equals("N")) {
            System.out.println("Please enter 'Y' to continue or 'N' to exit.");
            choice = scanner.nextLine().toUpperCase();       
        }
        if (choice.equals("Y")) {
            System.out.println("Continuing your journey...\n");
            
        } 
        else {
            System.out.println("Exiting the game. Thank you for playing!");                             
        }
     }

	public void print() {
		
	}

}

public class ConsoleGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
        System.out.println("Welcome to Survive The Mysterious Forest!");
        System.out.println("Choose a mode: ");
        System.out.println("1. Story Mode");
        System.out.println("2. Survival Mode");
        System.out.print("Enter your choice (1 or 2): ");
        
        int choice = scanner.nextInt();

        Playable selectedMode;
        switch (choice) {
            case 1:
                selectedMode = new StoryMode();
                break;
                
            default:
                System.out.println("Invalid choice. Exiting the game.");
                return;
        }
        selectedMode.play();
        selectedMode.print();        
        }       
    }
}



