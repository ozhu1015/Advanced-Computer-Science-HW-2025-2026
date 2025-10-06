public class CatTester {
    public static void main(String[] args) {
        //1 - should say new cat bc we're initializing a new object
        Cat myCat = new Cat("Betsy", "Tabby");
        Cat otherCat = new Cat("Tiger Beast", "Tabby");
        System.out.println(myCat.toString());
        //2 - this part should be printed
        System.out.println("My Cat's Name: " + myCat.getName());

        //3 - shouldn't be returning something, should be printing it
        System.out.println("Are the cat's equal?" + myCat.equals(otherCat));

        //4 - wrong print statement
        System.out.println("Is my cat hungry? " + myCat.getIsHungry());

        String firstName = "Tiger";
        //5 - should be one equal sign, == checks for equalty but we want to set them equal
        String lastName = "Beast";
        String name = firstName + " " + lastName;

        System.out.println("Changing the cat's name...");
        myCat.setName(name);
        //6 - there shouldn't be an apostrophe there bc an apostrophe indicates possession but we just want a plural
        System.out.println("The two cats are the same now: " + myCat.equals(otherCat));

    }

}