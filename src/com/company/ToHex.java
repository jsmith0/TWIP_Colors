package com.company;


public class ToHex {
    public static String toHex (int r, int g, int b) {

        String r1, r2, g1, g2, b1, b2, all;
        int red, green, blue;
        int red2, green2, blue2;

        red = r / 16;
        red2 = r % 16;

        if (red == 10) r1 = "A";
        else if (red == 11) r1 = "B";
        else if (red == 12) r1 = "C";
        else if (red == 13) r1 = "D";
        else if (red == 14) r1 = "E";
        else if (red == 15) r1 = "F";
        else r1 = String.valueOf(red);

        if (red2 == 10) r2 = "A";
        else if (red2 == 11) r2 = "B";
        else if (red2 == 12) r2 = "C";
        else if (red2 == 13) r2 = "D";
        else if (red2 == 14) r2 = "E";
        else if (red2 == 15) r2 = "F";
        else r2 = String.valueOf(red2);

        r1 = r1 + r2;

        green = g / 16;
        green2 = g % 16;

        if (green == 10) g1 = "A";
        else if (green == 11) g1 = "B";
        else if (green == 12) g1 = "C";
        else if (green == 13) g1 = "D";
        else if (green == 14) g1 = "E";
        else if (green == 15) g1 = "F";
        else g1 = String.valueOf(green);

        if (green2 == 10) g2 = "A";
        else if (green2 == 11) g2 = "B";
        else if (green2 == 12) g2 = "C";
        else if (green2 == 13) g2 = "D";
        else if (green2 == 14) g2 = "E";
        else if (green2 == 15) g2 = "F";
        else g2 = String.valueOf(green2);

        g1 = g1 + g2;

        blue = b / 16;
        blue2 = b % 16;

        if (blue == 10) b1 = "A";
        else if (blue == 11) b1 = "B";
        else if (blue == 12) b1 = "C";
        else if (blue == 13) b1 = "D";
        else if (blue == 14) b1 = "E";
        else if (blue == 15) b1 = "F";
        else b1 = String.valueOf(blue);

        if (blue2 == 10) b2 = "A";
        else if (blue2 == 11) b2 = "B";
        else if (blue2 == 12) b2 = "C";
        else if (blue2 == 13) b2 = "D";
        else if (blue2 == 14) b2 = "E";
        else if (blue2 == 15) b2 = "F";
        else b2 = String.valueOf(blue2);

        b1 = b1 + b2;

        all = r1 + g1 + b1;

        System.out.println("Your hex code is... " + all);
        return all;
    }
}
