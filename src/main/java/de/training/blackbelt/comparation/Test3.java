package de.training.blackbelt.comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Test3 {

    public static void main(String[] args) {
        List<Employee2> list = new ArrayList<>();
        Employee2 emp1 = new Employee2(100,"Zaur","Tregulov",12345);
        Employee2 emp2 = new Employee2(15,"Ivan","Petrov",6542);
        Employee2 emp3 = new Employee2(123,"Ivan","Sidorov",8542);
//        Arrays.sort(new Employee[] {emp1, emp2, emp3});
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        System.out.println("Beforre sorting \n" + list);
        Collections.sort(list);
        System.out.println("After id sorting \n" + list);
        Collections.sort(list, new NameComparator());
        System.out.println("After name sorting \n" + list); Collections.sort(list, new NameComparator());
        Collections.sort(list,new SalaryComparator());
        System.out.println("After salary sorting \n" + list);
    }
}

class Employee2 implements Comparable<Employee2>{
    Integer id;
    String name;
    String surname;
    int salary;

    public Employee2(final Integer id, final String name, final String surname, final int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name='" + name + '\'' + ", surname='" + surname + '\'' + ", salary=" + salary + '}';
    }



    @Override
    public int compareTo(final Employee2 anotherEmp) {
        if(this.id == anotherEmp.id) {
            return 0;
        }
        else if (this.id < anotherEmp.id) {
            return -1;
        } else {
            return 1;
        }
    }
}

class NameComparator implements Comparator<Employee2>{

    @Override
    public int compare(final Employee2 emp1, final Employee2 emp2) {
        return emp1.name.compareTo(emp2.name);
    }
}

class SalaryComparator implements Comparator<Employee2>{

    @Override
    public int compare(final Employee2 emp1, final Employee2 emp2) {
        return emp1.salary-emp2.salary;
    }
}