package betweenTwoSets;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Result {
	/*
	 * Complete the 'getTotalX' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts following
	 * parameters: 1. INTEGER_ARRAY a 2. INTEGER_ARRAY b
	 */

	public static int getTotalX(List<Integer> a, List<Integer> b) {
		// Write your code here
		 /*
	     * Complete the 'getTotalX' function below.
	     *
	     * The function is expected to return an INTEGER.
	     * The function accepts following parameters:
	     *  1. INTEGER_ARRAY a
	     *  2. INTEGER_ARRAY b
	     */

	        int min=Collections.min(b);
	        int max=Collections.max(a);
	        int n=0;
	        for(int i=max;i<=min;i++){
	            int count=0;
	            for(int k=0;k<a.size();k++){
	                if(i%a.get(k)==0){
	                    count++;
	                }
	            }
	            int c=0;
	            if(count==a.size()){
	                for(int j=0;j<b.size();j++){
	                    if(b.get(j)%i==0){
	                        c++;
	                    }
	                }
	            }
	            if(c==b.size()){
	                n++;
	            }
	        }
	        return n;

	}
}
