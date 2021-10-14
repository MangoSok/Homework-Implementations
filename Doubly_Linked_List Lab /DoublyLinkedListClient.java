import java.util.Scanner;
public class DoublyLinkedListClient
{
   public static void main(String[] arg)
   {
      DoublyLinkedList list = new DoublyLinkedList();
      System.out.print("Enter a name : ");
      Scanner sc = new Scanner(System.in);
      String word = sc.next();
      
      while(!word.equals("Quit"))
      {
         list.add(word);
         System.out.print("Enter a name : ");
         word = sc.next();
      }
      
      list.printInOrder();
      list.printInReverse();
      
      list.removeHarout();
      
      list.printInOrder();
      list.printInReverse();
      
      list.addKosbab();
      
      list.printInOrder();
      list.printInReverse();
      
      System.out.print(list.countVeronika());
   }
}