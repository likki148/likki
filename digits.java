 
import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		      int count=0,n;
        Scanner sc=new Scanner(System.in);
                n=sc.nextInt();
        while(n != 0)
        {
            n=n/10;
            ++count;
        }
        System.out.println(count);
 
	}
}
