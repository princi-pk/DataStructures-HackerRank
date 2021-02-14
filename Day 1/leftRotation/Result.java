package leftRotation;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'rotateLeft' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER d
     *  2. INTEGER_ARRAY arr
     */

    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
    // Write your code here
    	 List<Integer> list=new ArrayList<Integer>();
         
         int s=arr.size();
         int temp=d;
         for(int i=0;i<s-d;i++){
             list.add(i,arr.get(temp));
             temp++;
         }
         list.add(s-d,arr.get(0));
         int n=1;
         for(int j=s-d+1;j<s;j++){
             list.add(j,arr.get(n));
             n++;
         }
         return list;        
                  
    }        
}

