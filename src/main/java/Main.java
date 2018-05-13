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
        /* Magic of parsing json file */
        InputStream input = new FileInputStream("src/employees.json");
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        objectMapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        TypeFactory typeFactory = TypeFactory.defaultInstance();

        /* Creating collection (array  list) with data from parsed json file*/
        List <Employees> employees = objectMapper.readValue(input,
                typeFactory.constructCollectionType(ArrayList.class, Employees.class));

//        /* Print unsorted sorted Collection (ArrayList) */
//        System.out.println("Unsorted Collection (ArrayList): ");
//        System.out.println();
//        for (Employees unsorted : employees) {
//            System.out.println(unsorted);
//        }

        /* Sorting by Last Name */
        Collections.sort(employees, Sorting.LastNameComparator);

        /* Print sorted Collection (ArrayList) */
        System.out.println();
        System.out.println("Collection (ArrayList) sorted by Last Name: ");
        System.out.println();
        for (Employees sorted : employees) {
            System.out.println(sorted);

        }

        /* Sorting by Position */
        Collections.sort(employees, Sorting.PositionComparator);

        /* Print sorted Collection (ArrayList) */
        System.out.println();
        System.out.println("Collection (ArrayList) sorted by Position: ");
        System.out.println();
        for (Employees sorted : employees) {
            System.out.println(sorted);

        }

        /* Sorting by Salary */
        Collections.sort(employees, Sorting.SalaryComparator);

        /* Print sorted Collection (ArrayList) */
        System.out.println();
        System.out.println("Collection (ArrayList) sorted by Salary: ");
        System.out.println();
        for (Employees sorted : employees) {
            System.out.println(sorted);

        }
    }
}