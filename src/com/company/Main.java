package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        System.out.println("Enter the type of the color you want, \"name\" \"RGB\" or \"hex\"");
        String style = kb.next();

        if (style.equalsIgnoreCase("name")){
            System.out.println("Enter the name of your color.");
            String nm = kb.next();
        }
        if (style.equalsIgnoreCase("rgb")){

        }
        if (style.equalsIgnoreCase("hex")){

        }
    }
}
