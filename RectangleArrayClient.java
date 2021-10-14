import java.util.Scanner;
public class RectangleArrayClient
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      RectangleArray rect = new RectangleArray();
      System.out.print("Maximum length = ");
      int maxLength = input.nextInt();
      System.out.print("Maximum width = ");
      int maxWidth = input.nextInt();
      
      rect.fillArray(maxLength, maxWidth);
      rect.print();
      
      System.out.println("\nSearch for a Rectangle");
      System.out.print("What is the length? ");
      int length = input.nextInt();
      System.out.print("What is the width? ");
      int width = input.nextInt();
      
      int location = rect.search(length, width);
      
      if(location != -1)
      {
         System.out.println("\nThe Rectangle with length " + length + " and width " + width + " occurs at index " + location + "\n");
      }
      else 
      {
         System.out.println("\nThis value does not occur in the array\n");
      }
      
      System.out.println("The Rectangle with the largest area is length=" + rect.largestArea().getLength() + " width=" + rect.largestArea().getWidth());
      System.out.println("The Rectangle with the smallest area is length=" + rect.smallestArea().getLength()+ " width=" + rect.smallestArea().getWidth());
      System.out.println("The Rectangle with the largest perimeter is length=" + rect.largestPerimeter().getLength()+ " width=" + rect.largestPerimeter().getWidth());
      System.out.println("The Rectangle with the smallest perimeter is length=" + rect.smallestPerimeter().getLength()+ " width=" + rect.smallestPerimeter().getWidth());

   }
}