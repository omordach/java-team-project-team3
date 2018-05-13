import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;



@JsonIgnoreProperties(ignoreUnknown = true)
public class Employees {

       /*Initialization of fields which we want to get from json file wile parsing*/
    private String lastName;
    private String position;
    private int salary;

    /*Creating Employees method using JsonCreator*/
    @JsonCreator
    public Employees(@JsonProperty("last name") String lastName,
                     @JsonProperty("position") String position,
                     @JsonProperty("salary") int salary) {
        this.lastName = lastName;
        this.position = position;
        this.salary = salary;
    }

    /*Default getters ans setters*/
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

    /*Override toString method, we need it for printing collections (array list)*/
    @Override
    public String toString() {
        return " " + "Last Name = '" + lastName + '\'' +
                ", Position = '" + position + '\'' +
                ", Salary = " + salary;
    }
}