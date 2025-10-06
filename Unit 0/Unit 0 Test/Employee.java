public class Employee {
    private String name;
    private String jobTitle;
    private int salary;

    public Employee(String name, String jobTitle, int salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    //Name: Jane Doe, Job Title: Engineer, Salary: 60000
    public String toString() {
        return "Name: " + name + ", Job Title: " + jobTitle + ", Salary: " + salary;
    }

    public boolean equals(Employee otherEmployee) {
        return this.name.equals(otherEmployee.name) && this.jobTitle.equals(otherEmployee.jobTitle) 
            && this.salary == otherEmployee.salary;
    }

    public void raiseSalary(double percentage) {
        salary += ((percentage/100) * salary);
        salary = (int) salary;
    }
}