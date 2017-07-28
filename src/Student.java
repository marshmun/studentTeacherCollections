public class Student {

    private String firstName;
    private String lastName;
    private int id;
    private int grade;

    public Student () {}


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        return (id != student.id);
    }

    @Override
    public int hashCode() {
        int result = 31 * id + grade;
        result = 31 * result + firstName.hashCode();
        result = 31 * result + lastName.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Student\n" +
                "Name: '" + firstName + " " + lastName + "'\n" +
                "Id: " + id + "\n" +
                "Grade: " + grade + "\n";
    }
}