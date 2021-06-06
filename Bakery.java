package bakery;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Bakery {
    private List<Employee> employees;
    private String name;
    private int capacity;

   public Bakery(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.employees = new ArrayList<>();

    }

    public void add(Employee employee) {
        if (employees.size() < capacity) {
            this.employees.add(employee);
        }
    }

    public boolean remove(String name) {
       return employees.removeIf(employee -> employee.getName().equals(name));
    }

    public Employee getOldestEmployee() {
        List<Employee> first = employees.stream().sorted(Comparator.comparingInt(Employee::getAge).reversed())
                .collect(Collectors.toList());
        return first.get(0);
    }

    public Employee getEmployee(String name) {
        Employee employee = null;
        for (Employee employee1 : employees) {
            if (employee1.getName().equals(name)) {
                employee = employee1;
                break;
            }
        }
        return employee;
    }

    public int getCount() {
        return employees.size();
    }

    public String report() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Employees working at Bakery %s:", this.name));
        sb.append(System.lineSeparator());
        for (Employee employee : employees) {
            sb.append(employee.toString());
            sb.append(System.lineSeparator());
        }
        return sb.toString();
    }
}


