public class PurrfectUtils {
    public static String determineCatMood(Cat cat) {
        if (10 >= cat.getMoodLevel() && cat.getMoodLevel() > 7) {
            return "Currently, " + cat.getName() + " is in a great mood.\n" +
            "Petting is appreciated.";
        } else if (7 >= cat.getMoodLevel() &&  cat.getMoodLevel() > 3) {
            return "Currently, " + cat.getName() + " is reminiscing of a past life.\n" +
            "Petting is acceptable.";
        } else {
            return "Currently, " + cat.getName() + " is plotting revengeance.\n" +
            "Petting is extremely risky.";
        }
    }

    public static char generateCatChar(String catId) {
        int sum = 0;
        for (int i = 0; i < catId.length(); i++) {
            sum += catId.charAt(i) - '0';
        }
        return (char) (sum % 26 + 'A');
    }

    public static int generateRandomNumber(int low, int high) {
        if (low >= high) {
            int newHigh = low;
            low = high;
            high = newHigh; 
        }
        return (int) (Math.random() * (high - low )) + low;
    }

    public static String validateCatId(String catId) {
        Integer catIdInt = Integer.valueOf(catId);
        if (catIdInt.compareTo(1000) == -1 || catIdInt.compareTo(9999) == 1) {
            return Integer.toString(PurrfectUtils.generateRandomNumber(1000, 9999));
        } else {
            return catIdInt.toString();
        }
    }

    public static int validateMoodLevel(int moodLevel) {
        if (moodLevel < 0) {
            return 0;
        } else if (moodLevel > 10) {
            return 10;
        } else {
            return moodLevel;
        }
    }

    public static void bootUp(Cat cat) {
        System.out.println(cat.toString());
    }

    public static void pet(Cat cat) {
        System.out.println("Attempting to pet...");
        if (cat.getMoodLevel() >= 2) {
            cat.setMoodLevel(cat.getMoodLevel() + 1);
            System.out.println("Petting successful!");
        } else if (cat.getMoodLevel() < 2 && cat.isHungry()) {
            cat.setMoodLevel(cat.getMoodLevel() - 1);
            System.out.println("Petting failed...");
        } else if (cat.getMoodLevel() < 2 && !cat.isHungry()) {
            cat.setMoodLevel(cat.getMoodLevel() + 1);
            System.out.println("Petting successful!");
        };
    }

    public static void trimClaws(Cat cat) {
        System.out.println("Attempting to trim claws...");
        int chance = generateRandomNumber(0, 2);
        if (chance == 0) {
            cat.setMoodLevel(cat.getMoodLevel() - 1);
            System.out.println(cat.getName() + " did not like that!");
        } else if (chance == 1) {
            cat.setMoodLevel(cat.getMoodLevel() - 2);
            System.out.println(cat.getName() + " really hated that!");
        }
    }

    public static void cleanLitterBox(Cat cat) {
        System.out.println("Cleaning the litter box...");
        cat.setMoodLevel(cat.getMoodLevel() + 1);
        cat.setHungry(true);
        System.out.println("Done! \n" + cat.getName() + " appreciated that.");
    }

    public static void feed(Cat cat) {
        System.out.println("Filling up " + cat.getName() + " 's bowl...");
        cat.setMoodLevel(cat.getMoodLevel() + 2);
        cat.setHungry(false);
        System.out.println("Done! \n" + cat.getName() + " is eating...\n" + cat.getName() + " is full!");

    }

}
