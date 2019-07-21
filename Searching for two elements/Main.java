import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner s = new Scanner(System.in);
      int arr_size=s.nextInt();
      int arr[]=new int[arr_size];
      for(int i=0;i<=arr_size-1;i++)
      {
        arr[i]=s.nextInt();
      }
      int search_elem_1 =s.nextInt();
        int search_elem_2=s.nextInt();
      int elem_1_i=-1;
      int elem_2_i = -1;
      for(int i=0;i<=arr_size-1;i++)
      {
        if(search_elem_1 == arr[i])
        {
          elem_1_i=i;
        }
        if(search_elem_2 == arr[i])
        {
          elem_2_i=i;
        }
      }
          System.out.println(elem_1_i);
  System.out.println(elem_2_i);
        }
      }
   