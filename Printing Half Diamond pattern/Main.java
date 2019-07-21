import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
     Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      //char c = s.next().charAt(0);
      for(int i=1;i<=n;i++)
      {
        for(int j=i;j<n;j++)
      {
        System.out.print(" ");
	}
       for( int k=1;k<(i*2);k++)
       {
         System.out.print("*");
}
       System.out.println();
      }
      
    }
}