import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
        InputStream input = new FileInputStream("src/employees.json");
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        objectMapper
                .enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        TypeFactory typeFactory = TypeFactory.defaultInstance();
        List <EmployeesDTO> employees = objectMapper.readValue(input,
                typeFactory.constructCollectionType(
                        ArrayList.class, EmployeesDTO.class));

        System.out.println(employees.get(1).getLastName());

    }

}