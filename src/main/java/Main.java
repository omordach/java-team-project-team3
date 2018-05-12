import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
        InputStream input = new FileInputStream("src/employees.json");
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        objectMapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        TypeFactory typeFactory = TypeFactory.defaultInstance();
        List <Employees> employees = objectMapper.readValue(input,
                typeFactory.constructCollectionType(ArrayList.class, Employees.class));

//        System.out.println(employees.get(0).getLastName()); //need just for checking that file parsing works


//      Print unsorted sorted Collection (ArrayList)
        System.out.println("Unsorted Collection (ArrayList): ");
        System.out.println();
        for (Employees unsorted : employees) {
            System.out.println(unsorted);
        }

        // Sorting by Last name

        Collections.sort(employees, Employees.LastNameComparator);


        // Print sorted Collection (ArrayList)
        System.out.println();
        System.out.println("Sorted by Last Name Collection (ArrayList): ");
        System.out.println();
        for (Employees sorted : employees) {
            System.out.println(sorted);

        }

    }
}