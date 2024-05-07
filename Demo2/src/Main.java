import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList al = new ArrayList<>();


        List<Employee> employees = List.of(
                new Employee(1, "John", 30000),
                new Employee(2, "Sarah", 28000),
                new Employee(3, "Sam", 26000),
                new Employee(4, "Sophia", 24000),
                new Employee(5, "Steven", 27000)
        );

        employees.stream()
                .filter(e -> e.getName().startsWith("S"))
                .filter(e -> e.getSalary() > 25000);
                /*.filter(e->e.getName());
                .forEach(System.out::println);*/
    }

}