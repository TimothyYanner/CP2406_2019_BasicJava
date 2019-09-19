package week8;

public class StudentDemo {
    public static void main(String[] args) {
        UndergraduateStudent undergraduateStudent1 = new UndergraduateStudent();
        undergraduateStudent1.setIdNumber(123);
        undergraduateStudent1.setLastName("Yanner");
        undergraduateStudent1.setAnnualTuition();

        UndergraduateStudent undergraduateStudent2 = new UndergraduateStudent();
        undergraduateStudent2.setIdNumber(456);
        undergraduateStudent2.setLastName("Smith");
        undergraduateStudent2.setAnnualTuition();

        GraduateStudent graduateStudent1 = new GraduateStudent();
        graduateStudent1.setIdNumber(789);
        graduateStudent1.setLastName("James");
        graduateStudent1.setAnnualTuition();

        GraduateStudent graduateStudent2 = new GraduateStudent();
        graduateStudent2.setIdNumber(321);
        graduateStudent2.setLastName("Thomas");
        graduateStudent2.setAnnualTuition();

        StudentAtLarge studentAtLarge1 = new StudentAtLarge();
        studentAtLarge1.setIdNumber(987);
        studentAtLarge1.setLastName("John");
        studentAtLarge1.setAnnualTuition();

        StudentAtLarge studentAtLarge2 = new StudentAtLarge();
        studentAtLarge2.setIdNumber(654);
        studentAtLarge2.setLastName("Jane");
        studentAtLarge2.setAnnualTuition();

        Student[] students = {undergraduateStudent1, graduateStudent1, studentAtLarge1, undergraduateStudent2, graduateStudent2, studentAtLarge2};

        int i;
        for (i = 0; i < students.length; ++i) {
            System.out.println(students[i].getLastName() + " has the ID number " + students[i].getIdNumber() +
                    " and an annual tuition of $" + students[i].getAnnualTuition());
        }
    }
}
