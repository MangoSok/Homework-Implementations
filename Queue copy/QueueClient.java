import java.util.Scanner;
public class QueueClient
{
   public static void main(String arg[])
   {
      Menu obj = new Menu();
      
      System.out.println("Menu: \n1. Add \n2. Remove \n3. Print");
      System.out.println("4. Print odds \n5. Print reverse");
      System.out.println("6. Delete Zeros \n7. Insert 1 at front \n8. Quit \n\n");
      System.out.print("What is your choice?  ");
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      while(num != 8)
      {
         obj.menuChoice(num);
         if(num == 1)
         {
            num = sc.nextInt();
            obj.addNum(num);   
         }
         System.out.print("\n" + "What is your choice?  ");
         num = sc.nextInt();
      }
      System.out.println();
      System.out.print("Goodbye!");
   }
}