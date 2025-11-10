public class NPC {
    String choice;
    
    public NPC(){
        choice = RPSGame.generateRandomChoice();
    }

    public void setChoice(String choice) {
        this.choice = choice.toLowerCase();
        boolean value = RPSGame.validateChoice(this.choice);
        if (value) {
            this.choice = choice;
        } else {
            this.choice = RPSGame.generateRandomChoice();
        }

    }

    public String toString() {
        return "Opponent chose " + choice + ".";
    }


    public String getChoice() {
        return choice;
    }


}
