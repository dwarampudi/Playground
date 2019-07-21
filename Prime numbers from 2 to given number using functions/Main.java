import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      int i,j,f;
      for(i=1;i<=n;i++)
      {
        f=0;
        for(j=1;j<=n;j++)
        {
          if(i%j==0)
            f++;
        }
        if(f==2)
          System.out.println(+i);
	}
}
}