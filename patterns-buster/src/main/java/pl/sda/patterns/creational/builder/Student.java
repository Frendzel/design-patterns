package pl.sda.patterns.creational.builder;

import java.time.DayOfWeek;
import java.time.Month;
import java.time.Year;

//TODO implement builder instead of using constructor here
public class Student {
    //Required Parameters
    private String firstName;
    private String lastName;
    private String pesel;
    private Year birthYear;

    //Optional Parameters
    private Month birthMonth;
    private DayOfWeek birthDayOfWeek;
    private Boolean scholarship;

    public Student(String firstName,
                   String lastName,
                   String pesel,
                   Year birthYear,
                   Month birthMonth,
                   DayOfWeek birthDayOfWeek,
                   Boolean scholarship) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = pesel;
        this.birthYear = birthYear;
        this.birthMonth = birthMonth;
        this.birthDayOfWeek = birthDayOfWeek;
        this.scholarship = scholarship;
    }

    public Student() {
    }

    public static class StudentBuilder {

        //Required Parameters
        private String firstName;
        private String lastName;
        private String pesel;
        private Year birthYear;

        //Optional Parameters
        private Month birthMonth;
        private DayOfWeek birthDayOfWeek;
        private Boolean scholarship;

        public StudentBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public StudentBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Student build() {
            return new Student(firstName, lastName, pesel, birthYear, birthMonth, birthDayOfWeek, scholarship);
        }
    }

    public static StudentBuilder builder() {
        return new StudentBuilder();
    }
}
