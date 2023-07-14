import java.util.Scanner;
class a{
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      int sum=0;
      System.out.println("Enter 5 numbers");
      for(int i=0;i<5;i++)
      {
        int n=sc.nextInt();
        sum=sum+n;
      }
      System.out.println("Sum of 5 numbers are"+" "+sum);
      sc.close();
    }
}
