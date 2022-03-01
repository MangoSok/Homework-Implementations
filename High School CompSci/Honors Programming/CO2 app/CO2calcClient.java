import java.util.Scanner;
public class CO2calcClient
{
   public static void main(String[] arg)
   {
      CO2calculator obj = new CO2calculator();
      System.out.print("How many miles have you driven today? \n (give your best approximation)  ");
      Scanner sc = new Scanner(System.in);
      double miles = sc.nextDouble();
      obj.fillMiles(miles);
      System.out.println();
      System.out.print("Do you know how many miles per gallon your car runs? \n (1 for yes, 2 for no)");
      int num = sc.nextInt();
      if(num == 1)
      {
         System.out.print("Input your car's miles per gallon:");
         double num2 = sc.nextDouble();
         obj.fillMilesPerGallon(num2);
      }
      
      System.out.println();
      System.out.print("Your output of CO2 today is approximately equal to " 
      + obj.calculate() + " pounds.");
   }
}