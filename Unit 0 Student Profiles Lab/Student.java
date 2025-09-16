public class Student {
    String name;
    String id;
    int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        this.id = generateId();
    }

    public Student(String name) {
        this.name = name;
        this.grade = 10;
        this.id = generateId();
    }

    public int getGrade() {
        return grade;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String toString() {
        return name + " is a " + grade + "th grade student. Their id is " + id + ".";
    }

    private boolean equals(Student otherStudent) {
        if (this.name == otherStudent.name && this.id == otherStudent.id && this.grade == otherStudent.grade) {
            return true;
        } else {
            return false;
        }
    }

    
    private String generateId() {
        double d = Math.random();
        d = d * 10;
        int i = (int)d;
        return String.valueOf(i);
    }
