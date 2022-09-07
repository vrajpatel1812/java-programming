/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        int t;
        Scanner scan = new Scanner(System.in);
        t = scan.nextInt();
        for(int i=0;i<t;i++){
            int n ; 
            n = scan.nextInt();
            int base = 5, total = 0, resBase = 5;
            while(resBase <= n) {
                total = total + (n/resBase);
                resBase = resBase * base;
            }
            System.out.println(total);
        }
		// your code goes here
	}
}
