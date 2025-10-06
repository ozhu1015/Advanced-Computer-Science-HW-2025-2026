// 1 - made public lowercase
// 2- changed cat from plural to singular to match name of file
public class Cat {
	private String name;
	private String breed;
	private boolean isHungry;
	private int livesRemaining;
	
	// 2-Parameter Constructor
    //3 - cat should be uppercase to match class
    // 4 - says 2-parameter constructor but only has one, from code it can be inferred the missing one is breed
	public Cat(String name, String breed) {
        //4 - should be this.name and this.breed to make things clearer
		this.name = name;
		this.breed = breed;
        //5 - yes is not the right boolean, it should be true/false
		this.isHungry = true;
        //6 - changed livesRemaining to this.livesRemaining for clarity, but it isn't needed
		this.livesRemaining = 9;
	}

    //7 - says void but returns something, should instead identify the type being returned
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

    //8 - same problem as 7, should identify the type that is being returned
    //9 - should be in camel case
	public boolean getIsHungry(){
		return isHungry;
	}

    //9.5 - added setters and getters
    public void setIsHungry(boolean isHungry) {
        this.isHungry = isHungry;
    }
    
    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getLivesRemaining() {
        return livesRemaining;
    }

    public void setLivesRemaining(int livesRemaining) {
        this.livesRemaining = livesRemaining;
    }

    //10 - says that it should return a boolean but does not, either return a boolean or make the function void
	public void feed() {
		this.isHungry = false;
	}

    //11 - nice to specify otherCat, but isn't needed
	public boolean equals(Cat otherCat) {
        //12 - this.name == other.name should be equals instead
        //13 - should be == instead of =, since = sets two things to the same thing but == checks for equality
		return this.name.equals(otherCat.name) && this.breed.equals(otherCat.breed)
			&& this.livesRemaining == otherCat.livesRemaining;
	}

    //14 should return a string but doesn't, instead prints it, but it should print things on the tester
	public String toString() {
		return (name + " is of breed " + breed + " and has " + livesRemaining + " lives remaining.");
	}
}