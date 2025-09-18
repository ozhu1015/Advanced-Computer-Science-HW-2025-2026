public class StudentTester {
    public static void main(String[] args) {
        //making new variables
        Student alex = new Student("Alex");
        Student elsa = new Student("Elsa", 11);
        Student joshua = new Student("Joshua");
        Student shriya = new Student("Shriya", 11);

        //printing out the variables
        System.out.println(alex.toString());
        System.out.println(elsa.toString());
        System.out.println(joshua.toString());
        System.out.println(shriya.toString());

        //changing the grades of the students
        alex.setGrade(11);
        elsa.setGrade(12);
        joshua.setGrade(12);
        shriya.setGrade(11);


        //printing out the variables to see the change
        System.out.println(alex.toString());
        System.out.println(elsa.toString());
        System.out.println(joshua.toString());
        System.out.println(shriya.toString());

        //checking if the students are equal
        if (shriya.equals(elsa)) {
            System.out.println("These two students are equal.");
        } else {
            System.out.println("These two students are not equal.");
        }

        if (alex.equals(joshua)) {
            System.out.println("These two students are equal.");
        } else {
            System.out.println("These two students are not equal.");
        }

    
    }
}