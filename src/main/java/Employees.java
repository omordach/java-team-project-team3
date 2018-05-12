import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

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

}