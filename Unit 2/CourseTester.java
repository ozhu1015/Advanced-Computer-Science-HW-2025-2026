public class CourseTester {
    
    public static void main(String[] args) {
        int[] charlieScores = {93, 95, 97};
        int[] evaScores = {92, 94, 91};
        int[] frankScores = {75, 80, 85};
        StudentRecord record1 = new StudentRecord("Charlie Brown", charlieScores);
        StudentRecord record2 = new StudentRecord("Eva White", evaScores);
        StudentRecord record3 = new StudentRecord("Frank Black", frankScores);
        StudentRecord[] students = {record1, record2, record3};
        Course course1 = new Course("Math", students);
        System.out.println(record1.toString());
        System.out.println(course1.toString());
        System.out.println(record1.getAverage(0, 3));
        System.out.println(record1.getTestScore(1));
        System.out.println(course1.findBestStudent());

    }


}
