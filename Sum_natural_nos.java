//sum of natural numbers

import java.util.Scanner;
class Sum_natural_nos
{
  public static void main(String args[])
  {
    int n,sum;
    Scanner in=new Scanner(System.in);
    System.out.println("enter th no.:");
    n=in.nextInt();
    sum=(n*n+n)/2;
    System.out.println("sum of the no.s= "+sum);
  }
}
