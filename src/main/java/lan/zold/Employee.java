package lan.zold;
import getSalary;

public class Employee {
    Integer id;
    String name;
    String city;
    Double salary;
    String birth;

    public Employee(Integer id, String name, String city, Double salary, String birth) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.salary = salary;
        this.birth = birth;
    }

    public Double getSalary() {
        return this.salary;
    }
}
