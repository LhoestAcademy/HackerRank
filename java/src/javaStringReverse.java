import java.util.Scanner;

// HackerRank
// Question: Java String Reverse
// https://www.hackerrank.com/challenges/java-string-reverse/problem
public class javaStringReverse {

    public static void main(String[] args) {
        Scanner scannerObject=new Scanner(System.in);
        String word= scannerObject.next();
        StringBuilder str = new StringBuilder(word);

        String answer = str.reverse().toString().equals(word)?"Yes":"No";

        System.out.println(answer);
    }
}
