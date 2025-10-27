public class PawesomeUtils {
    
    public static String generateDogTag(int dogId, char dogChar) {
        return dogId + "" + dogChar;
    }

    public static int validateDogId(int dogId) {
        if (dogId >= 100 && dogId <= 999) {
            return dogId;
        } else {
            return (int) (Math.random() * 900 + 100);
        }
    }

    public static boolean validateDogTag(Dog dog) {
        int b = PawesomeUtils.validateDogId(dog.getDogId());
        char newChar = PawesomeUtils.generateDogChar(b);
        String newDogTag = PawesomeUtils.generateDogTag(b, newChar);
        return dog.getDogTag().equals(newDogTag);
    }

    public static char generateDogChar(int dogId) {
        int digit1 = dogId / 100;
        int digit2 = (dogId / 10) % 10;
        int digit3 = dogId % 10;
        int sum = digit1 + digit2 + digit3;
        return (char) (sum % 10 + 'F');
    }

    public static String pickup(Dog dog, String personName) {
        if (dog.getOwnerName().equals(personName)) {
            dog.setStillInFacility(false);
            return dog.getName() + " has been picked up by their owner " + personName + ".";
        } else {
            return dog.getName() + " cannot be picked up by " + personName + " as they are not the owner.";
        }
    }

    public static void checkIn(Dog dog, String personName) {
        if (PawesomeUtils.validateDogTag(dog)) {
            dog.setStillInFacility(true);
            dog.setOwnerName(personName);
        } else {
            System.out.println("Invalid dog tag. Cannot check in the dog :(");
        }
    }

    public static int convertAgetoHumanAge(Dog dog) {
        if (dog.getAge() == 1) {
            return 15;
        } else if (dog.getAge() == 2) {
            return 24;
        } else {
            return 24 + (dog.getAge() - 2) * 5;
        }
    }

    public static int convertAgetoDogYears(int humanYears) {
        if (humanYears <= 15) {
            return 1;
        } else if (humanYears <= 24) {
            return 2;
        } else {
            return (humanYears - 24) / 5 + 2;
        }
    }

}