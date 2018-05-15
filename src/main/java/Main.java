import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        EmployeesReader employeesReader = new EmployeesReader();
        /* Creating collection (array  list) with data from parsed json file*/
        List<Employee> employees = employeesReader.createList("src/employees.json");

        /* Print unsorted Collection (ArrayList) */
//        System.out.println("Unsorted Collection (ArrayList): ");
//        System.out.println();
//        for (Employee unsorted : employees) {
//            System.out.println(unsorted);
//        }

        /* Sorting by Last Name */
        if (employees != null) {
            Collections.sort(employees, Sorting.EmployeesComparator);

            /* Print sorted Collection (ArrayList) */
            System.out.println();
            System.out.println("Collection (ArrayList) sorted by multiple values (1. by last name; 2. by position; 3. by salary): ");
            System.out.println();
            for (Employee sorted : employees) {
                System.out.println(sorted);

            }
        } else {
            System.out.println("This collection is empty");
        }


    }
}