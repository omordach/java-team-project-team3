import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;


public class EmployeesReader {


    public List<Employee> createList(String filePath) {
        List<Employee> employeeList = null;
        try (InputStream input = new FileInputStream(filePath)) {
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
            objectMapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
            TypeFactory typeFactory = TypeFactory.defaultInstance();

            employeeList = objectMapper.readValue(input,
                    typeFactory.constructCollectionType(ArrayList.class, Employee.class));
        } catch (FileNotFoundException e) {
            System.out.println("Can`t read file");
        } catch (IOException e) {
            e.printStackTrace();
        }

        return employeeList;
    }


}
