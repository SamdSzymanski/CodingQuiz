import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'marsExploration' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int marsExploration(String s) {
    // Write your code here
    //Variable that will hold the number of letters that are changed in the string
        int lettersChanged = 0;
    //For loop will iterate through every letter, checking if the letters are what they are supposed to be 

        for(int i=0; i<s.length(); i++) {
            //Char value that holds the current character being examined
                char ch = (i%3) % 2==0 ? 'S':'O'; 
                if(s.charAt(i) != ch) lettersChanged++;
        }
        return lettersChanged;
        
        
    }
    

    }



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        int result = Result.marsExploration(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
