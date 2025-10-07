public class DogTester {
    
    public static void main(String[] args) {
        //create new dogs
        Dog dog1 = new Dog();
        Dog dog2 = new Dog("Fluffy", "Shriya", 3, 100);
        Dog dog3 = new Dog("John", "Buddy", 10, 103);

        //print dogs
        System.out.println(dog1.toString());
        System.out.println(dog2.toString());
        System.out.println(dog3.toString());

        //test setters
        dog1.setAge(8);
        dog3.setOwnerName("Shriya");
        dog2.setDogId(693);

        //test getters
        System.out.println(dog1.getAge());
        System.out.println(dog3.toString());

        //test static method generateDogChar
        System.out.println(Dog.generateDogChar(123));
        System.out.println(Dog.generateDogChar(456));
        System.out.println(Dog.generateDogChar(789));

        //test dogChar and dogTag updates after changing dogId
        System.out.println(dog1.getDogChar());
        System.out.println(dog2.getDogChar());

        System.out.println(dog1.getDogTag());
        System.out.println(dog2.getDogTag());

        //print dogs again
        System.out.println(dog1.toString());
        System.out.println(dog2.toString());
        System.out.println(dog3.toString());

        //test equals method: outcome - failure
        System.out.println(dog1.equals(dog3));

        //test equals method: outcome - success
        Dog dog4 = new Dog("Fluffy", "Shriya", 3, 693);
        System.out.println(dog2.equals(dog4));

        //check stillinfacility
        dog1.setStillInFacility(false);
        System.out.println(dog1.toString());


        //test pickup method
        dog1.setStillInFacility(true);
        System.out.println(Dog.pickup(dog1, "Shriya"));
        System.out.println(dog1.isStillInFacility());
        Dog.pickup(dog1, "Shriya's Mom");
        System.out.println(dog1.isStillInFacility());

        //test checkin method
        dog3.setStillInFacility(false);
        Dog.checkIn(dog3, "Shriya");
        System.out.println(dog3.isStillInFacility());
        System.out.println(dog3.getOwnerName());

    }

}
