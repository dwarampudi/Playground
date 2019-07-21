import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n = 0, rev = 0;
    n = sc.nextInt();
    while(n != 0){
    	rev = rev * 10;
      	rev = (n % 10) + rev;
      	n = n/10;
    }
    System.out.print(rev);
  }
}