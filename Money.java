//The Money PreLab:
//1. There are 2 constructions
//2. The instance variables are: myDollars , myCents
//3. The accessor methods are: getDollars , getCents
//4. The mutator methods are: none
//5. There are 2 pararmeters in the first add method
//6. There are 1 pararmeter in the second add method
//7. First add method will be easier to write for OOP Programmer
//8. The second one is easier to write for Client Programmer
//9. In these two methods we will call the constructor
//11. The toString is called in the explicit parameters
//12. Any times it calls
//OOP class 
public class Money
{
   private int myDollars;
   private int myCents; //between 0 and 99
   
   public Money()
   {
      myDollars = 0;
      myCents = 0;
   }
   
   public Money(int dollars, int cents)
   {
      
      if (cents > 99 && cents < 0) throw new IllegalArgumentException();
      myDollars = dollars;
      myCents = cents;
   }
   
   public int getDollars()
   {
      return myDollars;
   }
   
   public int getCents()
   {
      return myCents;
   }
   
   public String toString()
   {
      return myDollars + "." + myCents;
   }
   
   public void getAndPrintDetails()
   {
      int hundreds, fifties, twenties, tens, fives, ones;
      int quaters, dimes, nickels, pennies;

      hundreds = myDollars / 100;
      fifties = (myDollars % 100) / 50;
      twenties = (myDollars % 50) / 20;
      tens = (myDollars % 20) / 10;
      fives = (myDollars % 10) / 5;
      ones = (myDollars % 5) ;
      quaters = myCents / 25;
      dimes = (myCents % 25) / 10;
      nickels = (myCents % 10) / 5;
      pennies = myCents % 5; 
      System.out.println("\t" + hundreds + "hindreds");
      System.out.println("\t" + fifties + "fifties");
      System.out.println("\t" + twenties + "twenties");
      System.out.println("\t" + tens + "tens");
      System.out.println("\t" + fives + "fives");
      System.out.println("\t" + ones + "ones");
      System.out.println("\t" + quaters + "quaters");
      System.out.println("\t" + dimes + "dimes");
      System.out.println("\t" + nickels + "nickels");
      System.out.println("\t" + pennies + "pennies");
   }
   
   public Money add (int dollars, int cents)
   {
      int sumDollars = myDollars + dollars;
      int sumCents = myCents + cents;
      
      Money money = new Money(sumDollars + (sumCents / 100), sumCents % 100);
      return money;
   }
   
   public Money add ( Money theMoney)
   {
      Money num = add(theMoney.getDollars(), theMoney.getCents());
      return num;
      
   }
   
   
}