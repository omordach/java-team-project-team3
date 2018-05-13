import java.util.Comparator;

public class Sorting {

    /*Comparator for sorting the list by multiple values*/
    public static Comparator <Employees> EmployeesComparator = new Comparator <Employees>() {

        public int compare(Employees s1, Employees s2) {
            String LastName1 = s1.getLastName().toUpperCase();
            String LastName2 = s2.getLastName().toUpperCase();
            String Position1 = s1.getPosition().toUpperCase();
            String Position2 = s2.getPosition().toUpperCase();
            int salary1 = s1.getSalary();
            int salary2 = s2.getSalary();

            if (!LastName1.equals(LastName2) ) {
                /* For ascending order by Last Name */
                return LastName1.compareTo(LastName2);

                /* For descending order by Last Name */
                //return LastName2.compareTo(LastName1);
            }
            else if (!Position1.equals(Position2) ) {
                /* For ascending order by Position */
                return Position1.compareTo(Position2);

                /* For descending order by Position */
                //return Position2.compareTo(Position1);
            }
            else {
                /* For ascending order by Salary*/
                return salary1 - salary2;

                /* For descending order by Salary*/
                //return salary2-salary1;
            }
        }
    };


}
