import java.util.Scanner;
public class Array
{
   private int[] myList;  
   
   public Array()
   {
      myList  = new int[10];
   }
   
   public void fillArray()
   {
      System.out.println("Enter 10 integers");
      Scanner input = new Scanner(System.in);
      for(int i = 0; i < myList.length; i++)
      {
         System.out.print("# " + (i+1) + "= ");
         myList[i] = input.nextInt();
      }
      
   }
   
   public void print()
   {  
      for(int i = 0; i < myList.length; i++)
      {
         System.out.print(myList[i] + " ");
      }   
   }
   
   public void reversePrint()
   {
      for(int i = myList.length - 1; i >= 0; i--)
      {
         System.out.print(myList[i] + " " );
      }   
   }
   
   public int getNth(int num )
   {
      return myList[num - 1];
   }
   
   public double calculateAverage()
   {
      int sum = 0;
      for(int i = 0; i < myList.length; i++)
   {
      sum += myList[i];
   }
      double average = (double)sum / myList.length;
      return average;
   }
   
   public int highest()
   {  
      int highest = myList[0];
      for(int i = 1; i < myList.length; i++)
      {
         if(highest < myList[i])
         {
            highest = myList[i];
         }
                 
      }
      return highest;
   }
   
   public int lowest()
   {
      int lowest = myList[0];
      for(int i = 1; i < myList.length; i++)
      {
         if(lowest > myList[i])
         {
            lowest = myList[i];
         }
                 
      }
      return lowest;

   }

}