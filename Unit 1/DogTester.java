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
        System.out.println(PawesomeUtils.generateDogChar(123));
        System.out.println(PawesomeUtils.generateDogChar(456));
        System.out.println(PawesomeUtils.generateDogChar(789));

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
        System.out.println(PawesomeUtils.pickup(dog1, "Shriya"));
        System.out.println(dog1.isStillInFacility());
        PawesomeUtils.pickup(dog1, "Shriya's Mom");
        System.out.println(dog1.isStillInFacility());

        //test checkin method
        dog3.setStillInFacility(false);
        PawesomeUtils.checkIn(dog3, "Shriya");
        System.out.println(dog3.isStillInFacility());
        System.out.println(dog3.getOwnerName());

        //test validateDogId method
        System.out.println(PawesomeUtils.validateDogId(50));
        System.out.println(PawesomeUtils.validateDogId(150));
        System.out.println(PawesomeUtils.validateDogId(1050));

        //test validateDogTag method
        dog1.setDogId(10000);
        System.out.println(PawesomeUtils.validateDogTag(dog1));
        System.out.println(PawesomeUtils.validateDogTag(dog2));
        System.out.println(PawesomeUtils.validateDogTag(dog3));

        //testing conversion of age from dog to human
        dog1.setAge(1);
        dog2.setAge(2);
        dog3.setAge(5);
        System.out.println(PawesomeUtils.convertAgetoHumanAge(dog1));
        System.out.println(PawesomeUtils.convertAgetoHumanAge(dog2));
        System.out.println(PawesomeUtils.convertAgetoHumanAge(dog3));


        //testing conversion of age from human to dog
        System.out.println(PawesomeUtils.convertAgetoDogYears(10));
        System.out.println(PawesomeUtils.convertAgetoDogYears(24));
        System.out.println(PawesomeUtils.convertAgetoDogYears(29));

        Dog dog5 = new Dog("Sparky", "Alice", 4, 85757);
        System.out.println(dog5.getDogTag());
        System.out.println(PawesomeUtils.validateDogTag(dog5));
        System.out.println(dog5.getDogTag());
    }

}
