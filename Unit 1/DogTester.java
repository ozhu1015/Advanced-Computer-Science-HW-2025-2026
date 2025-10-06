public class DogTester {
    
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog("Fluffy", "Shriya", 3, 888);
        Dog dog3 = new Dog("John", "Buddy", 10, 103);

        System.out.println(dog1.toString());
        System.out.println(dog2.toString());
        System.out.println(dog3.toString());

        dog1.setAge(8);
        dog3.setOwnerName("Shriya");
        dog2.setDogId(693)

        System.out.println(dog1.getAge());
        System.out.println(dog3.toString());

        dog1.generateDogChar();
        dog2.generateDogChar();

        System.out.println(dog1.get());
        System.out.println(dog2.toString());
    }

}
