import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'hackerrankInString' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String hackerrankInString(String s) {
  int count=0;
  String tst="hackerrank";
  for(int i=0;i<s.length();i++)
    {if(s.charAt(i)==tst.charAt(count)) //Loops through every char in string, if specific char is equal to char in hackerrank, count incrememnts by 1, if statement then checks for next char in test.
      count++;
     if(count==tst.length()) //If count is the same int as |s|, then the string contains the string 'hackerrank' as a subsequence
      return "YES";
    }
   return "NO";
}
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        for (int qItr = 0; qItr < q; qItr++) {
            String s = bufferedReader.readLine();

            String result = Result.hackerrankInString(s);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}
