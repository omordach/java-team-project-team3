import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Comparator;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Employees {

    private String lastName;
    private String position;
    private int salary;

    @JsonCreator
    public Employees(@JsonProperty("last name") String lastName, @JsonProperty("position") String position, @JsonProperty("salary") int salary) {
        this.lastName = lastName;
        this.position = position;
        this.salary = salary;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return " "+ '\'' + "lastName='" + lastName + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary + '\'';
    }

    /*Comparator for sorting the list by Student Name*/
    public static Comparator<Employees> LastNameComparator = new Comparator<Employees>() {

        public int compare(Employees s1, Employees s2) {
            String LastName1 = s1.getLastName().toUpperCase();
            String LastName2 = s2.getLastName().toUpperCase();

            //ascending order
            return LastName1.compareTo(LastName2);

        }};
}