package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);


        while (true) {
            System.out.println("Enter the type of the color you want, \"name\" \"RGB\" \"hex\" or \"quit\"");
            String style = kb.next();

            if (style.equalsIgnoreCase("name")) {
                System.out.println("Enter your color.");
                String SoConfused = kb.next();

                CommonName.GetCommonName(SoConfused);
                break;
            }
            else if (style.equalsIgnoreCase("rgb")) {
                System.out.println("Enter your color.");
                String SoConfused = kb.next();

                CommonName.GetCommonName(SoConfused);
                break;
            }
            else if (style.equalsIgnoreCase("hex")) {
                System.out.println("Enter your color.");
                String SoConfused = kb.next();

                GetRGB.getRGB(SoConfused);
                CommonName.GetCommonName(SoConfused);
                break;
            }
            else if (style.equalsIgnoreCase("quit")){
                break;
            }
            else {
                System.out.println("Try again... Or type \"quit\"");
            }
        }
    }
}
