public class Course {
    private String courseName;
    private StudentRecord[] enrolledStudents;

    public Course(String courseName, StudentRecord[] enrolledStudents) {
        this.courseName = courseName;
        this.enrolledStudents = enrolledStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public StudentRecord[] getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setEnrolledStudents(StudentRecord[] enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }

    public String toString() {
        String string = "";
        string += "== " + courseName + " ==\n";
        for (int i = 0; i < enrolledStudents.length; i++) {
            string += (i + 1) + ".) " + enrolledStudents[i].toString() + "\n";
        }
        return string;
    }

    public String findBestStudent() {
        double maximum = 0;
        String maximumName = " ";
        for (int i = 0; i < enrolledStudents.length; i++) {
            if (enrolledStudents[i].getFinalAverage() > maximum) {
                maximumName = enrolledStudents[i].getName();
                maximum = enrolledStudents[i].getFinalAverage();
            }
        }
        return maximumName;
    }

    public double calculateTestAverage(int testNumber) {
        double sum = 0;
        for (int i = 0; i < enrolledStudents.length; i++) {
            sum += enrolledStudents[i].getTestScore(testNumber);
        }
        return sum / enrolledStudents.length;
    }

}
