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
        graduateStudent2.setIdNumber(789);
        graduateStudent2.setLastName("James");
        graduateStudent2.setAnnualTuition();
    }
}
