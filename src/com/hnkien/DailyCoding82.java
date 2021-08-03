package com.hnkien;

//This problem was asked Microsoft.
//Using a read7() method that returns 7 characters from a file, implement readN(n) which reads n characters.
//For example, given a file with the content “Hello world”, three read7() returns “Hello w”, “orld” and then “”.
public class DailyCoding82 {
    public static String read7() {
        return "7 character from a file";
    }
    public static String readN(int n) {
        if (n<=7) {
            String s = read7();
            return s.substring(0,n);
        } else {
            int k = n / 7;
            int m = n % 7;
            StringBuffer sb = new StringBuffer();
            for (int i=0; i<k; i++) {
                sb.append(read7());
            }
            sb.append(read7().substring(0,m));
            return sb.toString();
        }
    }

    public static void runTest() {
        System.out.println(readN(20));
    }
}
