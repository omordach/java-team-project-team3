import java.util.Comparator;

public class Sorting {

    /*Comparator for sorting the list by Last Name*/
    public static Comparator <Employees> LastNameComparator = new Comparator <Employees>() {

        public int compare(Employees s1, Employees s2) {
            String LastName1 = s1.getLastName().toUpperCase();
            String LastName2 = s2.getLastName().toUpperCase();

            //ascending order
            return LastName1.compareTo(LastName2);

            //descending order
            //return LastName2.compareTo(LastName1);
        }
    };

    /*Comparator for sorting the list by Position*/
    public static Comparator <Employees> PositionComparator = new Comparator <Employees>() {

        public int compare(Employees s1, Employees s2) {
            String Position1 = s1.getPosition().toUpperCase();
            String Position2 = s2.getPosition().toUpperCase();

            //ascending order
            return Position1.compareTo(Position2);

            //descending order
            //return Position2.compareTo(Position1);
        }
    };

    /*Comparator for sorting the list by salary*/
    public static Comparator <Employees> SalaryComparator = new Comparator <Employees>() {

        public int compare(Employees s1, Employees s2) {

            int salary1 = s1.getSalary();
            int salary2 = s2.getSalary();

            /*For ascending order*/
            return salary1 - salary2;

            /*For descending order*/
            //return salary2-salary1;
        }

    };

}
