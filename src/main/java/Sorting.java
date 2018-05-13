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
}
