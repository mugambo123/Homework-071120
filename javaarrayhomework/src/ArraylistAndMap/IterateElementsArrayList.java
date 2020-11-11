package ArraylistAndMap;

//3. Write a Java program to iterate through all elements in a ArrayList.

import java.util.ArrayList;

public class IterateElementsArrayList {
    public static void main(String[] args) {
        ArrayList<String> branchLocationCities = new ArrayList<>();
        branchLocationCities.add("London");
        branchLocationCities.add("Paris");
        branchLocationCities.add("New York");
        branchLocationCities.add("San Fransisco");
        branchLocationCities.add("Los Angeles");
        branchLocationCities.add("Chicago");
        branchLocationCities.add("Boston");
        branchLocationCities.add("Toronto");
        branchLocationCities.add("Singapore");
        branchLocationCities.add("Zurich");

        System.out.println("HSBC International Branches: " );

        for ( int i = 0; i < branchLocationCities.size(); i++){

            System.out.println("HSBC " +branchLocationCities.get(i));

    }

}
}
