public class Cat {
    String name;
    String ownerName;
    int moodLevel;
    String catId;
    char catChar;
    boolean isHungry;

    public Cat(String name, String ownerName, int moodLevel, String catId) {
        this.name = name;
        this.ownerName = ownerName;
        this.moodLevel = PurrfectUtils.validateMoodLevel(moodLevel);
        this.catId = PurrfectUtils.validateCatId(catId);
        this.catChar = PurrfectUtils.generateCatChar(catId);
        this.isHungry = true;
    }

    public Cat() {
        this.name = "Snowball";
        this.ownerName = "Olivia";
        this.moodLevel = 5;
        this.catId = "1000";
        this.catChar = PurrfectUtils.generateCatChar(catId);
        this.isHungry = true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getMoodLevel() {
        return moodLevel;
    }

    public void setMoodLevel(int moodLevel) {
        this.moodLevel = PurrfectUtils.validateMoodLevel(moodLevel);
    }

    public String getCatId() {
        return catId;
    }

    public void setCatId(String catId) {
        this.catId = PurrfectUtils.validateCatId(catId);
    }

    public char getCatChar() {
        return catChar;
    }

    public void setCatChar(char catChar) {
        this.catChar = catChar;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public void setHungry(boolean isHungry) {
        this.isHungry = isHungry;
    }


    public String generateCatTag() {
        return catId + PurrfectUtils.generateCatChar(catId);
    }
    
    public String toString() {
        return "== ABOUT " + name.toUpperCase() + " ==\n" +
                name + " is a cat." + "\n" +
                "Their tag is " + generateCatTag() + "\n" +
                PurrfectUtils.determineCatMood(this);
    }

    public boolean equals(Cat otherCat) {
        if (this.name.equals(otherCat.name) &&
           this.ownerName.equals(otherCat.ownerName) &&
           this.moodLevel == otherCat.moodLevel &&
           this.generateCatTag().equals(otherCat.generateCatTag()) &&
           this.isHungry == otherCat.isHungry) {
               return true;
           } else {
               return false;
           }
    }

}
