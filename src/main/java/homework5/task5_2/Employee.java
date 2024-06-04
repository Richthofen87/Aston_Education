package homework5.task5_2;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
import java.util.Comparator;
import java.util.stream.Stream;

@Data
@AllArgsConstructor
public class Employee {
    private int age;
    private int salary;
    private String name;
    private String department;

    public static void main(String[] args) {
        List<Employee> employees = getEmployeesList();
        System.out.println("Найти всех сотрудников старше 30 лет и отсортировать их по возрасту:");
        getEmloyeesOlderThan30AndSortByAge(employees).forEach(System.out::println);
        System.out.println("\nПосчитать общее количество сотрудников в отделе \"IT\":");
        System.out.println(getCountOfEmloyeesAtIT(employees));
        System.out.println("\nНайти сотрудника с максимальной зарплатой:");
        System.out.println(getEmloyeeWithMaxSalary(employees));
        System.out.println("\nПолучить список имен всех сотрудников, " +
                "работающих в отделе \"HR\", и отсортировать их по имени:");
        getCountOfEmloyeesAtHRAndSortByName(employees).forEach(System.out::println);
        System.out.println("\nРассчитать среднюю зарплату всех сотрудников:");
        System.out.println(getAverageSalaryOfEmloyees(employees));
    }

    public static List<Employee> getEmployeesList() {
        return Stream.of(new Employee(25, 250, "Jack", "IT"),
                        new Employee(35, 120, "John", "Finance"),
                        new Employee(23, 150, "Mike", "Administrative"),
                        new Employee(43, 180, "Olga", "Procurement"),
                        new Employee(41, 110, "Mishel", "Management"),
                        new Employee(33, 115, "Angela", "HR"),
                        new Employee(25, 110, "Curt", "HR"))
                .toList();
    }

    public static List<Employee> getEmloyeesOlderThan30AndSortByAge(List<Employee> employees) {
        return employees.stream()
                .filter(e -> e.age > 30)
                .sorted(Comparator.comparingInt(e -> e.age))
                .toList();
    }

    public static int getCountOfEmloyeesAtIT(List<Employee> employees) {
        return (int) employees.stream()
                .filter(e -> e.department.equals("IT"))
                .count();
    }

    public static Employee getEmloyeeWithMaxSalary(List<Employee> employees) {
        return employees.stream()
                .max(Comparator.comparingInt(e -> e.salary))
                .get();
    }

    public static List<String> getCountOfEmloyeesAtHRAndSortByName(List<Employee> employees) {
        return employees.stream()
                .filter(e -> e.department.equals("HR"))
                .map(Employee::getName)
                .sorted()
                .toList();

    }

    public static float getAverageSalaryOfEmloyees(List<Employee> employees) {
        return (float) employees.stream()
                .mapToInt(Employee::getSalary)
                .average().getAsDouble();
    }
}
