package pl.sda.patterns.creational.builder;

import java.time.DayOfWeek;
import java.time.Month;
import java.time.Year;

public class LombokStudentTest {

    public void test() {
        LombokStudent.LombokStudentBuilder builder = LombokStudent.builder();

        LombokStudent student = builder.birthYear(Year.now())
                .birthMonth(Month.APRIL)
                .birthDayOfWeek(DayOfWeek.FRIDAY)
                .firstName("Janek")
                .lastName("Kowalski").build();

        Student.StudentBuilder builder2 = Student.builder();
        Student build = builder2.firstName("janek")
                .lastName("kowalski")
                .build();
    }

}
