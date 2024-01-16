package lan.zold;

import java.util.ArrayList;

import hu.szit.Client;
import hu.szit.Convert;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Client client = new Client();
        String url = "http://[::1]:3000/employees";

        String result = client.get(url);
        ArrayList<Employee> emplist = Convert.toListObject(result, Employee.class);

        //Összegzés
        int n = emplist.size();
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + emplist.get(i).getSalary();
        }
        System.out.println("Összeg: " + sum);

        //Megszámolás
        int count = 0;
        for (int i = 0; i < n; i++) {
            String city = emplist.get(i).city;
            if(city.equals("Miskolc")){
                count = count++;
            }
        }
        System.out.println(count);

        //Max kiválasztás - melyik dolgozónak legnagyobb a fizetése?
        Employee max_emp = empList.get(0);
        for (int i = 0; i < n; i++) {
             Employee next_emp = empList.get(i);
             if(next_emp.salary > max_emp.salary) {
                max_emp = next_emp;
             }
        }

    }
}
