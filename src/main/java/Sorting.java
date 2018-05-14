import java.util.Comparator;

public class Sorting {

    /*Comparator for sorting the list by multiple values*/
    public static Comparator<Employee> EmployeesComparator = new Comparator<Employee>() {

        public int compare(Employee s1, Employee s2) {
            String lastName1 = s1.getLastName();
            String lastName2 = s2.getLastName();
            String position1 = s1.getPosition();
            String position2 = s2.getPosition();
            int salary1 = s1.getSalary();
            int salary2 = s2.getSalary();
            /* If value == null it will be sorted in the end of list  */
            if (null == lastName1) {
                return 1;
            }

            if (!lastName1.equalsIgnoreCase(lastName2)) {
                /* For ascending order by Last Name */
                return lastName1.compareToIgnoreCase(lastName2);
                /* For descending order by Last Name */
                //return lastName2.compareTo(lastName1);
            } else {
                if (null == position1) {
                    return 1;
                }
                if (!position1.equalsIgnoreCase(position2)) {
                    /* For ascending order by Position */
                    return position1.compareToIgnoreCase(position2);
                    /* For descending order by Position */
                    //return position2.compareTo(position1);
                } else {
                    /* For ascending order by Salary*/
                    return salary1 - salary2;
                    /* For descending order by Salary*/
                    //return salary2-salary1;
                }
            }
        }
    };

}
