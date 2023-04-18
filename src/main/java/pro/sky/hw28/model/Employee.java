package pro.sky.hw28.model;

import java.util.Objects;

public class Employee {


    private final String firstName;
    private final String lastName;

    private int department;

    private int salary;

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Employee(String firstName, String lastName, int department, int salary) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "_________" + "\n"  + "\n" +
                "Фамилия: " + this.lastName + "\n" + "Имя: " + this.firstName
                + "\n"+ "\n" +
                "Отдел: " + this.department+ "\n" +
                "Зарплата: " + this.salary   + "_________";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(firstName, employee.firstName)
                && Objects.equals(lastName, employee.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}