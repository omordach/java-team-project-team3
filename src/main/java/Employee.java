import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;


@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Employee {
    /*Initialization of fields which we want to get from json file while parsing*/
    @JsonProperty("last name")
    private String lastName;
    private String position;
    private int salary;
}