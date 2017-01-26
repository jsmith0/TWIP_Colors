package com.company;


public class GetRGB {

    public static String getRGB(String s){
        String R1 = s.substring(0,1);
        String R2 = s.substring(1,2);

        String G1 = s.substring(2,3);
        String G2 = s.substring(3,4);

        String B1 = s.substring(4,5);
        String B2 = s.substring(5,6);


        int RR1 = Integer.parseInt(R1);
        int RR2 = Integer.parseInt(R2);

        int GG1 = Integer.parseInt(G1);
        int GG2 = Integer.parseInt(G2);

        int BB1 = Integer.parseInt(B1);
        int BB2 = Integer.parseInt(B2);

        int r = RR1^16 * RR2;
        int g = GG1^16 * GG2;
        int b = BB1^16 * BB2;
        String all = r + " " + g + " " + b;
        System.out.println(all);
        return all;

    }
}
