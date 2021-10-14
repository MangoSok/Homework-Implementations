import java.util.Scanner;
public class StackClassClient
{
   public static void main(String[] arg)
   {
      StackClass obj = new StackClass();
      System.out.print("What is your choice?  ");
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      while(num != 8)
      {
         obj.selectMenu(num);
         if(num == 1)
         {
            num = sc.nextInt();
            obj.pushNum(num);   
         }
         System.out.print("\n" + "What is your choice?  ");
         num = sc.nextInt();
      }
      System.out.println();
      System.out.print("Goodbye!");
   }
}