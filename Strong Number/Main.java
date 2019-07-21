import java.util.Scanner;
 class Main{
	public static void main (String[] args){
	    // Type your code here
       Scanner in = new Scanner(System.in);
      int i,original,last;
      long fact,sum;
        int n = in.nextInt();
      original=n;
      sum=0;
      while(n>0)
      {
        last=n%10;
        fact=1;
        for(i=1;i<=last;i++)
        {
        fact=fact*i;
         }
        sum =sum+fact;
        n=n/10;
        }
      if(sum==original)
      System.out.println("Yes");
      else
       System.out.println("No");
    }
 }