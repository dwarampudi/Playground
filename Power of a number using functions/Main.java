import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner s = new Scanner(System.in);
      int base = s.nextInt();
      int exponent = s.nextInt();
      double r = Math.pow(base,exponent);
      System.out.println(+r);
	}
}