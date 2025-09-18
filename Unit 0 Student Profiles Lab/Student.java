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

    public String toString() {
        return name + " is a " + grade + "th grade student. Their id is " + id + ".";
    }

    public boolean equals(Student otherStudent) {
        if (this.name.equals(otherStudent.name) 
            && this.id.equals(otherStudent.id) 
            && this.grade == otherStudent.grade) {
            return true;
        } else {
            return false;
        }
    }

    
    public String generateId() {
        double d = Math.random();
        d = d * 778 + 111;
        double e = Math.random();
        e = e * 10000;
        return (int) d + "-" + (int) e;
    }
}
