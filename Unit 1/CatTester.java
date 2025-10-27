public class CatTester {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Ponyo", "Olivia's mom", 7, "6767");
        cat1.setCatId("9521");
        PurrfectUtils.generateCatChar(cat1.getCatId());
        cat1.setMoodLevel(11);
        cat1.setOwnerName("Olivia");
        Cat cat2 = new Cat("Ponyo", "Olivia", 10, "9521");
        if (cat1.equals(cat2)) {
            System.out.println("Cats are equal.");
        } else {
            System.out.println("Cats are not equal");
        }

        PurrfectUtils.bootUp(cat1);

        PurrfectUtils.pet(cat1);
        for (int i = 0; i < 4; i++) {
            PurrfectUtils.trimClaws(cat1);
        }

        PurrfectUtils.cleanLitterBox(cat1);
        PurrfectUtils.feed(cat1);
    }
}
