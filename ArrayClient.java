public class ArrayClient
{
   public static void main(String[] args)
   {  
      Array client = new Array();
      client.fillArray();
      System.out.print("\nThe numbers in order are: ");
      client.print();
      System.out.print("\nThe number in reverse order are: ");
      client.reversePrint();
      System.out.println("\n" + "\nThe 3rd number is " + client.getNth(3));
      System.out.println("The 8th number is " + client.getNth(8) + "\n");
      System.out.println("The average is " + client.calculateAverage() + "\n");
      System.out.println("The highest number is " + client.highest());
      System.out.println("The lowest number is " + client.lowest());
      
   }
}