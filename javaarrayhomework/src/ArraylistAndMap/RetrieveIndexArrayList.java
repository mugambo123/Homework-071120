package ArraylistAndMap;

/*4. Write a Java program to retrieve an element (at a specified index) from a given
        array list*/

import java.util.ArrayList;
import java.util.Arrays;

public class RetrieveIndexArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> zipcodeList = new ArrayList<>((Arrays.asList(3549, 3399, 3639, 8890, 1249, 5689, 4569, 3378, 1599, 1121)));

        int firstZipCode = zipcodeList.get(0);
        int thirdZipCode = zipcodeList.get(2);
        int seventhZipCode = zipcodeList.get(6);

        System.out.println(firstZipCode);
        System.out.println(thirdZipCode);
        System.out.println(seventhZipCode);

    }
}
