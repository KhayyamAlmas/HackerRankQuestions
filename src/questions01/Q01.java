package questions01;

import java.util.Scanner;

public class Q01 {
    /* Enter your code here. Read input from STDIN.
       Print output to STDOUT. Your class should be named Solution.
            Task
       Given an integer, n, perform the following conditional actions:

       If n is odd, print Weird
       If n is even and in the inclusive range of 2 to 5, print Not Weird
       If n is even and in the inclusive range of 6 to 20, print Weird
       If n is even and greater than 20, print Not Weird

       Complete the stub code provided in your editor to print whether or not n is weird.

       Input Format

       A single line containing a positive integer, n.

       Constraints
       1<=n<=100

       Output Format

       Print Weird if the number is weird; otherwise, print Not Weird.

       Sample Input 0

       3
       Sample Output 0

       Weird
       Sample Input 1

       24
       Sample Output 1

       Not Weird

       Explanation

       Sample Case 0: n=3
       n is odd and odd numbers are weird, so we print Weird.

       Sample Case 1: n=24
       n>20 and n is even, so it isn't weird. Thus, we print Not Weird.
       */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();

        if (a % 2 != 0) {
            System.out.println("Weird");

        } else {


            if (a >= 2 && a <= 5) {
                System.out.println("Not Weird");
            } else if (a >= 6 && a <= 20) {

                System.out.println("Weird");

            } else {
                System.out.println("Not Weird");
            }

        }
    }
}

