package timeConversion;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        /*
         * Write your code here.
         */
        String a=s.substring(0,2);
        String b=s.substring(2,8);
        
        if(s.contains("PM") && a.equals("12")){
            return a+b;
        }              
        else if(s.contains("PM")){
            int change=Integer.parseInt(a);
            change=12+change;
            String p=String.valueOf(change);
            return p+b;
        }     
        else if(s.contains("AM") && a.equals("12")){
            String m="00";
            return m+b;
        }       
        else{
            return a+b;
        }
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
