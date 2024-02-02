import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
        //Variables that will store the sum value
        long minSum = 0;
        long maxSum = 0;
         //Sorts array so that the smallest value will be at index 0, largest     value will be at index 4
        Collections.sort(arr);
        //For loop that iterates through sorted array
        for(int i = 0; i < arr.size(); i++){
            
            //
            if(i >= 1 && i <= 3){ 
                //Adds to both min and max if value is a middle value
                minSum += arr.get(i); 
                maxSum += arr.get(i);
            }
            else if(i == 0){
                //Adds to only min if value is minimum value
                minSum += arr.get(i);
            }
            else{
                //Adds to only max if value is maximum value
                maxSum += arr.get(i);
            }
        
        }
        System.out.println(minSum + " " + maxSum);
        
        
                
            }

    }



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
