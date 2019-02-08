package com.company;
import java.util.Scanner;


public class Main {

    public static class Check {

        public boolean checking(String x, String y) {
            boolean b = true;
            String[] strx = x.split(" ");
            String[] stry = y.split(" ");
            String[] r = new String[stry.length];

            if (strx.length <= stry.length) {
                for (int i = 0; i < strx.length; i++) {
                    for (int j = 0; j < stry.length; j++) {
                        if (strx[i].equals(stry[j])) {
                            r[j] = stry[j];
                        }
                    }
                }

                for (int i = 0; i < strx.length; i++) {
                    for (int j = 0; j < stry.length; j++) {
                        if (r[j] == null)
                            continue;
                        if ((strx[i].equals(r[j])) && (r[j] != null) ) {
                            b = true;
                        }
                        else
                        if ((strx[i].equals(r[j]) == false) && (r[j] != null)) {
                            b = false;
                        }
                    }
                }
                return b;

            } else {
                System.out.println("ERROR");
                return false;
            }

        }
    }

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            Check c = new Check();
            String x, y;
            boolean b;
            x = input.nextLine();
            y = input.nextLine();
            b = c.checking(x, y);
            System.out.println(b);
        }

}
