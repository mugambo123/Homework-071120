package ArraylistAndMap;

/*5. Write a Java program to test an array list is empty or
        not.*/

import java.util.ArrayList;

public class IsArrayListEmpty {
    public static void main(String[] args) {
        ArrayList<String> nameInitial = new ArrayList<>();

        System.out.println(nameInitial.isEmpty()); // answer should be true

        nameInitial.add("AP");
        nameInitial.add("JP");
        nameInitial.add("JV");
        nameInitial.add("AK");


        System.out.println(nameInitial.isEmpty()); // answer should be false

        nameInitial.clear();

        System.out.println(nameInitial.isEmpty()); // answer should be true


    }


}
