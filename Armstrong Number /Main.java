import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
       Scanner in =new Scanner(System.in);
      int n = in.nextInt();
      int x=0,t,a;
      t=n;
      while(n>0)
      {
        a=n%10;
        n=n/10;
       x=x+(a*a*a);
	}
      if(t==x)
        System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
    }
}