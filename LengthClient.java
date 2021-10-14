import java.util.Scanner ;
public class LengthClient
{
      public static void main(String args[]) 
   {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter first no=");
      int num1, num2, num3;
      num1 = scan.nextInt();
      System.out.println("Enter 2nd no=");
      num2 = scan.nextInt();
      System.out.println("Enter 3rd no=");
      num3 = scan.nextInt();
      Length run4 = new Length (num1, num2, num3);
      run4.printLength();



      Length run1 = new Length();
      run1.addInches(71);   
      run1.printLength();
      
      Length run2 = new Length(5, 2, 11);
      run2.addInches(26);
      run2.printLength();
      
      Length run3 = new Length(2, 7, 22);
      run3.printLength();
      run3.addInches(26);
      run3.printLength();

   }
   
}
