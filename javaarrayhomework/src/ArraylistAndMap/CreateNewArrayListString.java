package ArraylistAndMap;

/* 2. Write a Java program to create a new array list, add some colours (string) and
printout the collection.*/

import java.util.ArrayList;

public class CreateNewArrayListString {
    public static void main(String[] args) {


        ArrayList<String> coloursList = new ArrayList<>();
        // Adding
        coloursList.add("Sky Blue");
        coloursList.add("Ocean Blue");
        coloursList.add("Turquoise Blue");
        coloursList.add("Dark Blue");
        coloursList.add("Saffron");
        coloursList.add("Orange");
        coloursList.add("Grey");
        coloursList.add("Black");
        coloursList.add("White");

        for (String colours : coloursList) {
            System.out.println("The available  Colour is : " + colours);

        }
    }
}