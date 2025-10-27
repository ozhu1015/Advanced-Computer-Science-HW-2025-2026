public class Dog {

    private String name;
    private String ownerName;
    private int age;
    private int dogId;
    private char dogChar;
    private String dogTag;
    private boolean stillInFacility;

    public Dog(String name, String ownerName, int age, int dogId) {
        this.name = name;
        this.ownerName = ownerName;
        this.age = age;
        this.dogId = PawesomeUtils.validateDogId(dogId);
        this.dogChar = PawesomeUtils.generateDogChar(this.dogId);
        this.stillInFacility = true;
        this.dogTag = PawesomeUtils.generateDogTag(this.dogId, this.dogChar);
    }

    public Dog() {
        this.name = "Orion";
        this.ownerName = "Shriya's Mom";
        this.age = 7;
        this.dogId = 123;
        this.dogChar = PawesomeUtils.generateDogChar(this.dogId);
        this.stillInFacility = true;
        this.dogTag = PawesomeUtils.generateDogTag(this.dogId, this.dogChar);
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDogId() {
        return dogId;
    }

    public void setDogId(int dogId) {
        this.dogId = PawesomeUtils.validateDogId(dogId);
        this.dogChar = PawesomeUtils.generateDogChar(this.dogId);
        this.dogTag = PawesomeUtils.generateDogTag(this.dogId, this.dogChar);
    }

    public char getDogChar() {
        return dogChar;
    }

    public void setDogChar(char dogChar) {
        this.dogChar = dogChar;
    }

    public String getDogTag() {
        return dogTag;
    }

    public void setDogTag(String dogTag) {
        this.dogTag = dogTag;
    }

    public boolean isStillInFacility() {
        return stillInFacility;
    }

    public void setStillInFacility(boolean stillInFacility) {
        this.stillInFacility = stillInFacility;
    }

    @Override
    public String toString() {
        if (stillInFacility) {
            return name 
                    + " is a good dog. They are " 
                    + age
                    + " years old and belong to " 
                    + ownerName 
                    + ". They are currently in our facility. For employee use only: DogTag is " + dogTag + ".";
        } else {
            return name 
                    + " is a good dog. They are " 
                    + age 
                    + " years old and belong to " 
                    + ownerName 
                    + ". They are not currently in our facility. For employee use only: DogTag is " + dogTag + ".";
        }
        
    }

    public boolean equals(Dog otherDog) {
        return this.name.equals(otherDog.name) 
            && this.ownerName.equals(otherDog.ownerName) 
            && this.age == otherDog.age 
            && this.dogId == otherDog.dogId 
            && this.dogChar == otherDog.dogChar 
            && this.dogTag.equals(otherDog.dogTag) 
            && this.stillInFacility == otherDog.stillInFacility;
    }
}
