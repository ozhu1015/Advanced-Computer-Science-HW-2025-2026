import java.util.Scanner;

public class RPSGame {
    private Player player;
    private NPC opponent;

    public RPSGame(Player player, NPC opponent) {
        this.player = player;
        this.opponent = opponent;
    }

    public void start(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name: ");
        player.name = scan.nextLine();
        System.out.println("Enter your choice (rock, paper, scissors): ");
        String playerChoice = scan.nextLine().toLowerCase();
        boolean value = RPSGame.validateChoice(playerChoice);
        int i = 1;
        while (value == false && i < 3) {
            System.out.println("Invalid!");
            System.out.println("Enter your choice (rock, paper, scissors): ");
            playerChoice = scan.nextLine().toLowerCase();
            value = RPSGame.validateChoice(playerChoice);
            i += 1;
        }
        if (value == true) {
            player.choice = playerChoice;
        } else {
            player.choice = RPSGame.generateRandomChoice();
        }
        scan.close();
    }

    public void setPlayerValues(String name, String choice){
        player.setName(name);
        player.setChoice(choice);
    }

    public boolean didPlayerWin(){
        if (player.getChoice().equals(opponent.getChoice())){
            return false;
        } 
        if (player.getChoice().equals("rock") 
            && opponent.getChoice().equals("scissors") 
            || player.getChoice().equals("paper") 
            && opponent.getChoice().equals("rock") 
            || player.getChoice().equals("scissors") 
            && opponent.getChoice().equals("paper")) {
            return true;
        } else {
            return false;
        }
    } 

    public String toString() {
        if (didPlayerWin() == true) {
            return player.getName() + " won! \nCongratulations!";
        } else {
            return "Opponent won! \nBetter luck next time!";
        }
    }

    public String displayResults() {
        String result = "";
        result += "== GAME RESULTS ==\n";
        result += player.getName() + " chose " + player.getChoice() + ".\n";
        result += "Opponent chose " + opponent.getChoice() + ".\n";
        result += toString();
        return result;
    }


    public static boolean validateChoice(String choice) {
        if (choice.equals("rock") || choice.equals("scissors") || choice.equals("paper")) {
            return true;
        } else {
            return false;
        }

    }

    public static String generateRandomChoice() {
        int randomChoice = (int) (Math.random() * 3)  + 1;
        if (randomChoice == 1) {
            return "rock"; 
        } else if (randomChoice == 2) {
            return "paper";
        } else {
            return "scissors";
        }
    }

}
