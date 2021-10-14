import java.util.Scanner;
public class LinkedListClient
{
   public static void main(String[] arg)
   {
      LinkedList list = new LinkedList();
      System.out.print("Enter a non-negative value:");
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      while(num >= 0)
      {
         list.fillList(num);
         System.out.print("Enter a non-negative value:");
         num = sc.nextInt();
      }
      list.printInOrder();
      //list.printInReverse(list.giveFront());
      //System.out.println(list.numNodes());
      //list.printRepeat(list.giveFront(),list.giveFront());
      //list.printEvens();
      list.removeZeros(list.giveFront());
      list.printInOrder();
      //list.add1();
   }
}