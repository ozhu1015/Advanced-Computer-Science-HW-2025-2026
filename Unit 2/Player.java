public class Player {
    String name;
    String choice;

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getChoice() {
        return choice;
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
        return name + " chose " + choice + ".";
    }
}
